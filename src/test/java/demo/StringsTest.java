package demo;

public class StringsTest {


   static String s = "Selenium Class";
   static String s1 = " Selenium with JAVA Class";
   static String s2 = "Selenium Class";

    static String s3 = new String("Selenium");
    static String s4 = new String("Selenium");



    public static void main(String[] args) {

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());


        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

        StringsTest test = new StringsTest();

        //1.i need to print all characters in String
        //2. need to reverse a String

        System.out.println("Printing String in Sequence");

        for (int i=0;i<s1.length();i++){

            System.out.print(s1.charAt(i));
        }

        System.out.println("*********************************** REVERSING STRING ");

        for (int i=s1.length();i>0;i--){

            System.out.print(s1.charAt(i-1));
        }
        System.out.println(" ");

        String[] splittedString = s1.split("with"); //. 1. selenium 2 JAVA Class

        for(String value: splittedString){

            //System.out.println(value);
            if (value.contains("Selenium")){
                System.out.println(value.trim().toLowerCase());
            }

        }

        //String exercise = "JAVA Test JAVA Selenium Test JAVA";
        //1. print Count of repeated word with word and count of A letter




        /*System.out.println(test.s3.hashCode());
        System.out.println(test.s4.hashCode());*/
    }




}
