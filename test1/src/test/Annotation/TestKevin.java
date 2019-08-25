package test.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * 注解只是起到辅助的作用，不会影响业务逻辑
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface  TestKevin {
    String name() default "TestKevin";
}