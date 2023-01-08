package quick.lesson;

import java.util.Scanner;

public class PriceDiscountPurchase extends Purchase{
    private int discount;

    public PriceDiscountPurchase() {
    }

    public PriceDiscountPurchase(String name, Dollar price, int quantity, int discount) {
        super(name, price, quantity);
        this.discount = discount;
    }
    public PriceDiscountPurchase(String name, int price, int quantity, int discount) {
        super(name, new Dollar(price), quantity);
        this.discount = discount;
    }

    public PriceDiscountPurchase(Scanner sc) {
        super(sc);
        this.discount = discount;
    }

    @Override
    public int getCost() {
        return (super.getPrice()-discount)*super.getQuantity();
    }
    protected String fieldsToString(){
        int big = this.getCost() / 100;
        int small = this.getCost() - big * 100;
        return ", discount = " + discount +
                " cost = " + big + "." + small + " USD"+
                '}';
    }

    @Override
    public String toString() {
        return super.toString() + fieldsToString();

    }
}
