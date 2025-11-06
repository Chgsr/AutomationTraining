package Practice;

import java.util.ArrayList;

public class ArrayListPractice {

 public static void main(String[] args) {

     ArrayList<Integer> numbers = new ArrayList<Integer>();
     numbers.add(100);
     numbers.add(200);
     numbers.add(300);
     numbers.add(400);
     numbers.remove(0);

     for(int i=0; i<numbers.size(); i++){
         System.out.println(numbers.get(i));
     }

 }

}
