package demo;

public class NestedLoopDemo {

    public static void main(String[] args) {


        /*for (int i=1 ;i<=4;i++) {  //outer for loop

            //System.out.println("Outer For loop Started");

            for (int j=1 ;j<=i;j++) { // inner for loop

                //System.out.println("Inner For Loop Started");
                System.out.print(j);
                System.out.print("\t");
            }
            System.out.println("");
            //System.out.println("Outer For loop Ended");
        }*/

        int k=1;//3

        for (int i=1 ;i<=4;i++) {  //outer for loop

            //System.out.println("Outer For loop Started");

            for (int j = 1; j <= i; j++) { // inner for loop

                //System.out.println("Inner For Loop Started");
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println("");
            //System.out.println("Outer For loop Ended");
        }












        }
}
