package quick.lesson;

import java.util.Objects;
import java.util.Scanner;

public class Purchase {
    private String name;
    private Dollar price;
    private int quantity;
    public Purchase(){

    }
    public Purchase (String name, Dollar price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Purchase (Scanner sc){
        String s = sc.next();
        this.name = sc.next();
        this.price = new Dollar(Integer.parseInt(sc.next()));
        this.quantity = Integer.parseInt(sc.next());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price.getCentValue();
    }

    public void setPrice(int price) {
        //this.price = price;
        Dollar d = new Dollar(price);
       this.price = d;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getCost(){
        return price.centValue*quantity;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", quantity = " + quantity ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchase purchase)) return false;
        return name == purchase.name&&price.getCentValue()==purchase.price.getCentValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }
}
