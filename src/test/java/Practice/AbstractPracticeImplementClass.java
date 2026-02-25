package Practice;

public class AbstractPracticeImplementClass extends AircraftRulesAbstractPractice {

    public void aircraft3(){
        System.out.println("aircraft3");
    }

    public void aircraft4(){
        System.out.println("aircraft4");
    }

    public static void main(String[] args) {

        AbstractPracticeImplementClass abstractPractice = new AbstractPracticeImplementClass();

        abstractPractice.aircraft1();
        abstractPractice.aircraft2();
        abstractPractice.aircraft3();
        abstractPractice.aircraft4();
    }
}
