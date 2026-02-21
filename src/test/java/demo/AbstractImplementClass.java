package demo;

public  class AbstractImplementClass extends AircraftRules{

    @Override
    public void color() {
        System.out.println("color");
    }
    public void test(){
        System.out.println("test");
    }

    public static void main(String[] args) {

        AbstractImplementClass abstractImplementClass = new AbstractImplementClass();

        abstractImplementClass.name();
        abstractImplementClass.safety();
        abstractImplementClass.color();

    }
    // difference between Interface and Abstract

    //Interface
    //we use key Interface
    //allowed to use only public access modifier
    //can implement interfaces using implement keyword
    // class can implement multiple interfaces

    //Abstract
    //We use key Abstract
    // we can use other than private (public,protected)
    //can implement using extends keyword
    // class should not implement multiple abstract classes

}
