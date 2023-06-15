package interfaces;

public class MyFunctionalInterface {

    public MyFunctionalInterface(){

        //TODO: Call Interface

        MyFunction myFunction = (x,y)-> {
            if (x>y){
                System.out.println("x is greater");
            }else{
                System.out.println("y is greater");
            }
        };
        myFunction.add(50,20);
    }

}

@FunctionalInterface
interface MyFunction{
    void add(int a,int b);
}
