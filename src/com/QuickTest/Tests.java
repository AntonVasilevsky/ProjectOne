/*
package com.QuickTest;

import com.collections.hard.Dollar;
import com.collections.hard.PricePurchase;
import com.collections.hard.Purchase;

public enum Tests {
    G_PURCHASE {
        @Override   // ------ сдлеать здесь как в P_PURCHASE
        Purchase getPurchase(String s) {
            return new Purchase(s);
        }


    },
    P_PURCHASE {
        @Override
        PricePurchase getPurchase(String s) {
            return new PricePurchase(s);
        }


    };
    abstract Purchase getPurchase(String s);


    public static Purchase getPurchaseFromFactory(String s) { // принимает строку аргументом, разложить,
        // создать покупку, определить тип
        String id;
        String[] sub = s.split(";");
        if(sub.length == 4){
            id = Tests.P_PURCHASE.name();
            Tests kind = Tests.valueOf(id);
            return kind.getPurchase(sub[0], new Dollar(Integer.valueOf(sub[1])), (Integer.valueOf(sub[2])), (Integer.valueOf(sub[3])));
        }else
            id = "GENERAL_PURCHASE";
            Tests kind = Tests.valueOf(id);
            return null;


         // принимает отдельные элементы строки.
    }

}
*/
