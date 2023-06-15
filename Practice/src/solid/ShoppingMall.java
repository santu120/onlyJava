package solid;

import java.util.Objects;

public class ShoppingMall{

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard){
        this.bankCard=bankCard;
    }

    public void doPayment(Object order, int amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard1 = new CreditCard();
        BankCard bankCard2 = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard2);
        shoppingMall.doPayment("Some order", 5000);
    }

}


interface BankCard{
    void doTransaction(int amount);
}

class CreditCard implements BankCard{

    @Override
    public void doTransaction(int amount) {
        System.out.println("Transaction done with CreditCard "+amount);
    }
}

class DebitCard implements BankCard{

    @Override
    public void doTransaction(int amount) {
        System.out.println("Transaction done with DebitCard "+amount);
    }
}
