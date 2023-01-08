package quick.lesson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("e:\\downloads\\input2.txt");
        Scanner sc = new Scanner(file);
        PriceDiscountPurchase pdp = new PriceDiscountPurchase();
        PercentDiscountedPurchase pdp1 = new PercentDiscountedPurchase();
        PercentDiscountedPurchase pdp2 = new PercentDiscountedPurchase();
        pdp1.setName("milk");
        pdp2.setName("milk");
        pdp1.setPrice(200);
        pdp2.setPrice(200);
        System.out.println(pdp1.equals(pdp2));













    }
}
