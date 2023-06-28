package Practice.Reflection;

import java.lang.reflect.Field;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */
public class CarRunner {
    public static void main(String[] args) {
        CarReflection car = new CarReflection("Toyota", "Camry", 2022);

        // Get the Car class
        Class<?> carClass = car.getClass();

        // Retrieve the Table annotation
        Table tableAnnotation = carClass.getAnnotation(Table.class);

        // Extract the table name from the annotation
        String tableName = tableAnnotation.name();
        System.out.println("Table Name: " + tableName);

        // Get all declared fields of the Car class
        Field[] fields = carClass.getDeclaredFields();

        // Iterate over the fields
        for (Field field : fields) {
            // Check if the field has the Column annotation
            if (field.isAnnotationPresent(Column.class)) {
                // Retrieve the Column annotation
                Column columnAnnotation = field.getAnnotation(Column.class);
                // Extract the column name from the annotation
                String columnName = columnAnnotation.name();

                try {
                    // Enable access to the private field
                    field.setAccessible(true);
                    // Get the value of the field from the car object
                    Object value = field.get(car);
                    // Print the column name and value
                    System.out.println(columnName + ": " + value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
