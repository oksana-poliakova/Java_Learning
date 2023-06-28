package Basics.Reflection.AnnotationExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Oksana Poliakova on 28.06.2023
 * @projectName Lesson1
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MinAge {
    int age() default 18; // Annotation element for specifying the minimum age, default value is 18
}
