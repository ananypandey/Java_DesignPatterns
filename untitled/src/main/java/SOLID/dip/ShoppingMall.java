package SOLID.dip;

public class ShoppingMall {
    private DebitCard debitCard;
    public ShoppingMall(DebitCard debitCard)
    {
        this.debitCard = debitCard;
    }
    public void doPurchaseSomething(long amount)
    {
        debitCard.doTransaction(amount);
    }
    public static void main(String[] args)
    {
        DebitCard debitCard1 = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard1);
        shoppingMall.doPurchaseSomething(1000);
    }
}
