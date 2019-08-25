package test.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wuzejian on 2017/5/18.
 * 约束注解
 */
/*如果将public 修饰改为 默认（internal @interface Constraints）
 SQLInteger 等其他注解 引用时在同包不会报错  但是：
运行调用是就会java.lang.illegalaccessexception 没有访问权限

--因为在调用的 过程中 一定 隐藏 调用了Annotation其他的类 导致不同包没权限访问--
*/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {

    boolean primaryKey() default false;

    boolean allowNull() default false;

    boolean unique() default false;
}