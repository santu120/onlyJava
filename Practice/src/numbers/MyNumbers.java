package numbers;

public class MyNumbers {

    public MyNumbers(){

        swapUsingTemp();
        swapWithoutTemp();
    }


    private void swapUsingTemp() {
        int a = 10,b = 20;
        int temp =0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("with 3rd variable => "+" "+"a = "+a +", b= "+b);
    }

    private void swapWithoutTemp(){
        int a = 30,b = 20;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("without 3rd variable => "+" "+"a = "+a +", b= "+b);
    }



    private void printFib(){

        int a=0;
        int b=1;
        int c = 0;

        System.out.print(a+" "+b);

        for (int i=2;i<10;i++){
            c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

        System.out.println("fib using rec "+recFib(10));
    }

    int n1=0,n2=1,n3=0;

    private int recFib(int number){

        if (number > 0){
            n3=n1+n2;
            n1=n2;
            n2=n3;

            System.out.println(" "+n3);
            return recFib(number-1);
        }
        return 0;
    }

    private void factorial(){
        int fact = 1;
        for (int i=1;i<5;i++){
            fact = fact*i;
        }

        System.out.println(" ");
        System.out.println("factorial => "+fact);
        System.out.println("factorial using rec => "+recFact(4));
    }

    private int recFact(int number){
        if (number == 0)
            return 1;

        return (number*recFact(number-1));
    }


    private void reverseNumbe(){
        int a = 155;

    }
}
