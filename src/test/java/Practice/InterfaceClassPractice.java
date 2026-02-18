package Practice;

public class InterfaceClassPractice implements InterfacePractice1, InterfacePractice2 {

    public void apple() {
        System.out.println("apple");
    }

    public void grapes() {
        System.out.println("grapes");
    }
    public void papaya() {
        System.out.println("papaya");
    }

    public void orange() {
        System.out.println("orange");
    }

    public void berries() {
        System.out.println("berries");
    }

    public void pear() {
        System.out.println("pear");
    }

    public static void main(String[] args) {

        //Create object for interface
        InterfacePractice1 obj1 = new InterfaceClassPractice();
        InterfacePractice2 obj2 = new InterfaceClassPractice();
        //Create object for class
        InterfaceClassPractice obj3 = new InterfaceClassPractice();

        obj1.apple();
        obj1.papaya();
        obj1.grapes();

        obj2.orange();
        obj2.berries();

        //We can use class obj for interface methods as well but not recommended
        //Use interface obj for interface methods
        System.out.println("");
        obj3.pear();
        obj3.apple();
        obj3.grapes();
        obj3.papaya();
        obj3.orange();
        obj3.berries();


            }
}
