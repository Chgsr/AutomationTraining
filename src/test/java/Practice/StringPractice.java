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

    static String abc = "JAVA Test JAVA Selenium Test JAVA";

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

        }


        }


    }
}
