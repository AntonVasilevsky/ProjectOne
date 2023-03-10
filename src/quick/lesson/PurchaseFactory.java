package quick.lesson;

import java.util.Scanner;

public class PurchaseFactory {
    private enum PurchaseKind {
        GENERAL_PURCHASE {
            Purchase getPurchase(Scanner sc) {
                return new Purchase(sc);
            }
        },
        PRICE_DISCOUNT_PURCHASE {
            PriceDiscountPurchase getPurchase(Scanner sc) {
                return new PriceDiscountPurchase(sc);
            }
        },

        PERCENT_DISCOUNT_PURCHASE {
            PercentDiscountedPurchase getPurchase(Scanner sc) {
                return new PercentDiscountedPurchase(sc);
            }
        };

        abstract Purchase getPurchase(Scanner sc);
    }

    public static Purchase getPurchaseFromFactory(Scanner sc) {
        String id = sc.next();
        PurchaseKind kind = PurchaseKind.valueOf(id);
        return kind.getPurchase(sc);
    }
}
