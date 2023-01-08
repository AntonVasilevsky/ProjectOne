package quick.lesson;

import java.util.Scanner;

public class PercentDiscountedPurchase extends Purchase{
        private double discount;
        final int NUMBER = 4;

    public PercentDiscountedPurchase() {
    }

    public PercentDiscountedPurchase(String name, Dollar price, int quantity, double discount) {
        super(name, price, quantity);
        this.discount = discount;
    }
    public PercentDiscountedPurchase(String name, int price, int quantity, int discount) {
        super(name, new Dollar(price), quantity);
        this.discount = discount;
    }

    public PercentDiscountedPurchase(Scanner sc) {
        super(sc);
        this.discount = Double.parseDouble(sc.next().replace(',', '.'));
    }

    @Override
    public int getCost() {
        int cost;
       if(super.getQuantity()>NUMBER){

           return cost = (int)(super.getPrice()*super.getQuantity()*(1-discount/100));
        }else
       return super.getCost();
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
        return super.toString()+fieldsToString();
    }
}
