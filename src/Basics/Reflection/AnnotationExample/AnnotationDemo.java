package Basics.Reflection.AnnotationExample;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */
public class AnnotationDemo {
    public static void main(String[] args) {
        TestUser user1 = new TestUser("John", 20);
        TestUser user2 = new TestUser("Alice", 17);
        TestUser user3 = new TestUser("Peter", 22);

        // Checking the user's age against the minimum value using the MinAge annotation
        checkMinAge(user1);
        checkMinAge(user2);
        checkMinAge(user3);
    }

    private static void checkMinAge(TestUser user) {
        // Getting all fields of the User class using Reflection API
        java.lang.reflect.Field[] fields = user.getClass().getDeclaredFields();

        // Searching for fields with the MinAge annotation
        for (java.lang.reflect.Field field : fields) {
            MinAge minAgeAnnotation = field.getAnnotation(MinAge.class);

            // Checking if the field has the MinAge annotation
            if (minAgeAnnotation != null) {
                int minAge = minAgeAnnotation.age();

                // Getting the value of the field
                try {
                    field.setAccessible(true);
                    int userAge = field.getInt(user);

                    // Checking the user's age against the minimum value
                    if (userAge < minAge) {
                        System.out.println(user.getName() + " is too young. Minimum age required: " + minAge);
                    } else {
                        System.out.println(user.getName() + " is old enough.");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
