package com.ferry;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Pax p1 = new Pax(60);
        TransportObj obj1 = p1;
        TransportObj obj2 = new Cargo(1500, 1);
        TransportObj obj3 = new Cargo(3200, 7.87);
        TransportObj obj5 = new Cargo(99200, 7.87);
        TransportObj obj6 = new Cargo(3200, 7.87);

        TransportObj[] objs = {obj1, obj2, obj3, obj5};
        System.out.println(Arrays.toString( objs));
        Ferry titanic = new Ferry(objs);
        titanic.canGo();
        Arrays.sort(objs, new compareTransportationType());
        System.out.println(Arrays.toString( objs));

    }

    static class compareTransportationType implements Comparator<TransportObj> {

        @Override
        public int compare(TransportObj o1, TransportObj o2) {
           if (o1.getId() < o2.getId()) {
                return -1;
            } else if (o1.getId() > o2.getId()) {
                return 1;
            } else return 0;
        }
    }
}
