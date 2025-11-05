//practice scenario - create two arrays, print both array values

package Practice;

public class ArrayPractice
{
    /* static variables belong to the class and allows main() to access them directly
    without needing to create an object of TwoArraysPractice. */

    ///Declare and initialize arrays
    static int[] Array1 = {10,20,30,40,50}; //static variable
    static int[] Array2 = {05,15,25,35,45}; //static variable

    public static void main(String[] args)
    {
        //int[] Array1 = {10,20,30,40,50}; //non static variable
        //int[] Array2 = {05,15,25,35,45}; //non static variable

        System.out.println("Array1 list");

         for(int i=0; i<Array1.length; i++)
        {
            System.out.println(Array1[i]);

        }

        System.out.println("\nArray2 list");

        for(int i=0; i<Array2.length; i++)
        {
            System.out.println(Array2[i]);
        }

        // ✅ Create third array to store the sum
        int[] sumArray = new int[Array1.length];

        // ✅ Add corresponding elements from both arrays
        for (int i = 0; i < Array1.length; i++) {
            sumArray[i] = Array1[i] + Array2[i];
        }

        // ✅ Print the resulting sum array
        System.out.println("\nSum of both arrays:");
        for (int i = 0; i < sumArray.length; i++) {
            System.out.println(sumArray[i]);
        }

    }
}
