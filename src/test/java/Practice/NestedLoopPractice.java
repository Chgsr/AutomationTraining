package Practice;

public class NestedLoopPractice {

    public static void main(String[] args) {

        /* 1. output for below code : 1
                                      1 2
                                      1 2 3
                                      1 2 3 4 */

        /* for(int i=1;i<=4;i++){

            for(int j=1;j<=i;j++){

                System.out.print(j);
                System.out.print("\t");

            }
            System.out.print("\n");
        } */

        /* 2. output for below code : 1
                                      2 3
                                      4 5 6
                                      7 8 9 10 */
        /* int k = 1;

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(k);
                System.out.print("\t");
                k++;

            }
            System.out.print("\n");
        } */

        /* 3. output for below code : 10 9 8 7
                                      6 5 4
                                      3 2
                                      1 */
       /*int k = 10;

        for (int i = 1; i <= 4; i++) {

            for (int j = 4; j >= i; j--) {

                System.out.print(k);
                System.out.print("\t");
                k--;
            }
            System.out.print("\n");
        }*/

        for (int i = 0; i < 4; i++) {

            for (int j = 1; j <= 4 - i; j++) {

                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println("");

        }


        /* 4. output for below code : * * * *
         * * *
         * *
         *           */

        /*for (int i = 1; i <= 4; i++) {

            for (int j = 4; j >= i; j--) {

                System.out.print("*");
                System.out.print("\t");
            }
            System.out.print("\n");
        }*/


    }
}
