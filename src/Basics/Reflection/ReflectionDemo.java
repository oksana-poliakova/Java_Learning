package Basics.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */
public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        // Obtaining the Class object
        Class<?> clazz = Reflection.class;

        // Retrieving class information
        String className = clazz.getName();
        int modifiers = clazz.getModifiers();
        Package classPackage = clazz.getPackage();
        Class<?> superClass = clazz.getSuperclass();
        System.out.println(classPackage);
        System.out.println(superClass);
        System.out.println(modifiers);
        System.out.println(className);

        // Creating an instance of the class
        Constructor<?> constructor = clazz.getConstructor();
        Object instance = constructor.newInstance();

        // Invoking a method
        Method method = clazz.getMethod("myMethod");
        method.invoke(instance);

        // Accessing a field
        Field field = clazz.getDeclaredField("myField");
        field.setAccessible(true);
        field.set(instance, "New value");
        Object value = field.get(instance);
    }
}
