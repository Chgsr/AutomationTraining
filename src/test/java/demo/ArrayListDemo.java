package demo;


import java.util.ArrayList;

public class ArrayListDemo {


    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("120");
        arrayList.add("Test ArrayList");
        arrayList.add("Selenium");
        arrayList.add("Java");

        arrayList.add(2,"Index1 Value");

        System.out.println(arrayList.contains("Selenium"));
        System.out.println(arrayList.contains("Test1"));

        arrayList.remove("Selenium");
        arrayList.remove(0);

        System.out.println(arrayList.contains("Selenium"));
        System.out.println("*************************************");

        for (String value:arrayList){

            System.out.println(value);

        }

        System.out.println("*************************************");

        for (int i=0;i<arrayList.size();i++){

            String arrayValue = arrayList.get(i);

            System.out.println(arrayValue);

        }


        // we need to check one string is there array/arraylist

    }
}
