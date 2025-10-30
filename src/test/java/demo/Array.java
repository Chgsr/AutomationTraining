package demo;

public class Array {

    String str = "Test";

    int a =10;

    public static int ab = 15;
    protected static int ac = 20;
    private static int ad = 21;

    /// interger , String array
    ///
    /// Datatype[] referenceVariable = new DataType[/*sizeofArray*/];

    static  int[] demoArray = new int[7];

    static int[] getDemoArray1 = {15,20,30,25,29,67,90,84,27,89,84,90};

    String[] strArray = {"All","Alexa","Amazon"};

    public static void main(String[] args) {


        //System.out.println(Array.ab+Array.ac+Array.ad);

        demoArray[0]=10;
        demoArray[1]=15;
        demoArray[2]=20;
        demoArray[3]=30;
        demoArray[4]=40;
        demoArray[5]=40;
        demoArray[6]=40;

        System.out.println(demoArray[0]);
        System.out.println(demoArray[1]);
        System.out.println(demoArray[2]);
        System.out.println(demoArray[3]);
        System.out.println(demoArray[4]);

        //loops
        for(int i=0;i< demoArray.length;i++){

            System.out.println(demoArray[i]);
            //i=4
        }

        for(int i=1;i<=getDemoArray1.length;i++){

            System.out.print(getDemoArray1[i-1]+",");


        }

        //printing values which are dividable by 2
        //static int[] getDemoArray1 = {11,20,30,25,29,67,90,84,27,89,84,90};10/2
        //to check whether this array has any number which is dividing by 2
        for (int i=0;i<getDemoArray1.length;i++){

            if (getDemoArray1[i] % 2 == 0){

                System.out.println("Numbers which are dividable by 2 "+getDemoArray1[i]);
                break;
            }
            else {

                System.out.println("Numbers which are not dividable by 2 "+getDemoArray1[i]);
            }

        }
        //static int[] getDemoArray1 = {15,20,30,25,29,67,90,84,27,89,84,90};
        String[] strArray = {"Test","Automation","Java","Selenium"};

        for (int number:getDemoArray1){

            System.out.println(number);

        }

        for (String value:strArray){

            System.out.println(value);

        }



        //practice scenario - create two arrays, print both array values

        //ArrayList









    }





}
