package demo;

public class InterfaceUseDemo implements InterfaceDemo, InterfaceDemo2 {


    @Override
    public void red() {
        System.out.println("Red Signal");
    }

    @Override
    public void green() {

        System.out.println("Green Signal");

    }

    @Override
    public void yellow() {
        System.out.println("Yellow Signal");
    }

    public void walk(){

        System.out.println("walk signal");
    }


    public static void main(String[] args) {

        InterfaceDemo obj = new InterfaceUseDemo();

        obj.red();
        obj.green();
        obj.yellow();

        InterfaceUseDemo obj2 = new InterfaceUseDemo();

        obj2.walk();
        obj2.red();
        obj2.green();
        obj2.yellow();
        obj2.stop();

        InterfaceDemo2 obj3 = new InterfaceUseDemo();

        obj3.stop();


    }


    @Override
    public void stop() {

        System.out.println("stop signal");

    }
}
