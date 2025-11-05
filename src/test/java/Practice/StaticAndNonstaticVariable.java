// Static Variables belongs to the class and declared using static keyword
// Non-Static Variables belongs to object of class and declared without static keyword

package Practice;

public class StaticAndNonstaticVariable {


    String College = "XYZ University"; //Non-Static Variable
    int Students; //Non-Static Variable
    static int Boys = 1500; //Static Variable
    static int Girls = 1500; //Static Variable
    static int Teachers = 100; //Static Variable
    String Subjects = "Maths,Electronics,Information Technology,Probability"; //Non-Static Variable

    public static void main(String[] args) {

        StaticAndNonstaticVariable obj = new StaticAndNonstaticVariable();
        obj.Students = 100; //Another way of initialization of variable using object

        System.out.println("College: " +obj.College);
        System.out.println("Students: " +obj.Students);
        System.out.println("Boys: " + Boys);
        System.out.println("Girls: " + Girls);
        System.out.println("Teachers: " + Teachers);
        System.out.println("Subjects: " + obj.Subjects);

    }

}
