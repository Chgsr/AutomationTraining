package Practice;

public class MethodsPractice {

    //General Method Syntax : AccessModifier static/nonstatic returnType methodName (){}

    public static void testMethodStatic() {

        System.out.println("testMethodStatic");
        System.out.println("testMethod");
    }

    public static void testMethodNonStatic() {
        System.out.println("testMethodNonStatic");
        System.out.println("testMethod");
    }

    public static int addition(int a, int b) {

        int c = a + b;
        System.out.println(c);

        return c;
    }

    public static String name(){

        return "test";


    }

    public static void main(String[] args) {
        testMethodStatic();

        testMethodNonStatic();

        addition(3, 4);

        System.out.println(name());
    }


}
