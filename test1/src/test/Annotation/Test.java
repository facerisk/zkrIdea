package test.Annotation;

@TestKevin(name="hehe")
public class Test {

    public static void showKevin(Class c) {
        System.out.println(c.getName());
        boolean isExist = c.isAnnotationPresent(TestKevin.class);

        if (isExist) {
            TestKevin TestKevin = (TestKevin) c.getAnnotation(TestKevin.class);
            System.out.println(TestKevin.name());
        }
    }

    public static void main(String[] args) {
        Test.showKevin(Test.class);
    }
}