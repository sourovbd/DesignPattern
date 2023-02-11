package main.java.design.principal.dip;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount) {

        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        // DebitCard debitCard=new DebitCard();
        // CreditCard creditCard=new CreditCard();

        BankCard bankCard = new DebitCard();

        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}