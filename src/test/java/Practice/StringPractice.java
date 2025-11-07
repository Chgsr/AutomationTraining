// String exercise = "JAVA Test JAVA Selenium Test JAVA";
// 1.Print the repeated word and the count
// 2.Print the count of A letter

/* Steps to write this program
1.Print the repeated word and the count
* Split the string into words
* Print the repeated word
* Print the count of repeated word

2.Print the count of A letter
* Split the string into characters
* Print the count of A letter
* */

/* doubts
What is the method we will use to count the word and letters
 */

package Practice;

public class StringPractice {

    static String abc = "Test JAVA JAVA Selenium Testt JAVA";
    static int javaCount = 0;
    static int aCount = 0;

    public static void main(String[] args) {

        System.out.println(abc);

        /* split the string by space ( split(" ")) */
        String[] splitstring = abc.split(" ");

        for (String s : splitstring) {
            //System.out.println(s);
            //System.out.println(s.length());
            if (s.equalsIgnoreCase("JAVA"))
            {
                System.out.println(s);
                //javaCount = javaCount+1;
                javaCount++;

            }
        }
        System.out.println("Count of JAVA "+javaCount);

        for (int i = 0; i < abc.length(); i++) {

            char c = abc.charAt(i);

            if (c=='A'){
                aCount = aCount+1;
            }


        }
        System.out.println("Count of A"+aCount);
        String duplicateValue = " ";
        //Test JAVA JAVA Selenium Testt JAVA


        for (String value:splitstring){

            if (value.equalsIgnoreCase(duplicateValue)){

                duplicateValue = value;

            }

        }
        System.out.println(duplicateValue);

        //String Array
        //iterating one by one
        //we need to store that string to compare with next string



    }
}
