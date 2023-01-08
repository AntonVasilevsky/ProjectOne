
package com.collections.hard;

import com.collections.hard.Dollar;
import com.collections.hard.Purchase;

public class PurchaseFactory {
    private enum PurchaseKind {
        GENERAL_PURCHASE {
            @Override
            Purchase getPurchase(String s) {
                return new Purchase(s);
            }
        },
        PRICE_PURCHASE {
            @Override
            PricePurchase getPurchase(String s) {
                return new PricePurchase(s);
            }


        };
        abstract Purchase getPurchase(String s);





    }

    public static Purchase getPurchaseFromFactory(String s) {

        String id;
        String[] sub = s.split(";"); // как найти количество ";" в строке?
        if(sub.length == 4){
            id = "PRICE_PURCHASE";
        }else
            id = "GENERAL_PURCHASE";


        PurchaseKind kind = PurchaseKind.valueOf(id);
        return kind.getPurchase(s);
    }

}

