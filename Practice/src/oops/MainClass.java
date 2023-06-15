package oops;

public class MainClass {

    public static void main(String[] args) {
        Base b = new Derived();
        b.Base1();
        b.baseStatic();


    }
}


class Base {
    public Base() {
        System.out.println("Base");
    }

    protected void Base1(){
        System.out.println("BAse Base1 Method");
    }

    public static void baseStatic(){
        System.out.println("Base static Method");
    }
}
class Derived extends Base {
    public Derived() {
        System.out.println("Derived");
    }

    @Override
    public void Base1() {
        System.out.println("Derived Base1 Method");
    }

    public static void baseStatic(){
        System.out.println("Derived static Method");
    }
}
class DeriDerived extends Derived {
    public DeriDerived() {
        System.out.println("DeriDerived");
    }

    @Override
    public void Base1() {
        System.out.println("DeriDerived Base1 Method");
    }
}