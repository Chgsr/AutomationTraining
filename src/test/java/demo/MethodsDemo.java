package demo;

public class MethodsDemo {

    //Syntax : AccessModifier static/notstaic returnType methodname (){}

    public static void testMethodStatic (){

        System.out.println("Method Calling Static");
        System.out.println("Test Method Calling");

    }
    public  void testMethodNonStatic (){

        System.out.println("Method Calling Non Static");

    }
    public static int addition(int a,int b){

        int c= a+b;
        System.out.println(c);

        return c;
    }
    public static String Name(){

        return "Selenium";
    }

    public static void main(String[] args) {

        testMethodStatic();

       int d = addition(10,15);

        System.out.println(d);


       int e = addition(25,15);

        System.out.println(e);
    }

}

//id
//xpath
//css
//classname
//text
//linkedText
//partialtext


