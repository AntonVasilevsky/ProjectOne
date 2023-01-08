package com.lambda;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6);
        list.forEach(System.out::println);
        System.out.println(list);

       /* String s = "1";
        notNull(s, (q) -> q != null);
        isEmpty(s, q-> q.isBlank());
        Predicate<String> p1 = (q) -> q != null;
        Predicate<String> p2 = q-> q.isBlank();
        notNullAndIsEmpty(s, p1, p2);*/
        Predicate<String> predicate1 = s1 -> s1.startsWith("J");
        Predicate<String> predicate2 = s1 -> s1.startsWith("M");
        Predicate<String> predicate3 = s1 -> s1.endsWith("A");

        System.out.println(predicate1.or(predicate2).and(predicate3).test("JavA"));
        System.out.println(predicate1.or(predicate2).and(predicate3).test("MaltA"));
        HeavyBox box = new HeavyBox(23);
        Consumer<HeavyBox> c1 = (hb)-> System.out.println("Отгрузил ящик весом " +hb.weight);
        Consumer<HeavyBox> c2 = (hb)-> System.out.println("Отправляем ящик весом " +hb.weight);
        c1.andThen(c2).accept(box);

        Function<Integer, String> function = (i)-> {
            if(i>0){
               return  "Положительное число";
            } else if (i<0) {
                return  "Отрицательное число";
            }else
               return  "Ноль";
        };
        System.out.println(function.apply(-1));

        Supplier<Integer> supplier = () -> (int)(Math.random()*10+1);

        for (int i = 0; i < 10; i++) {
            System.out.println(supplier.get());
        }





    }
    static void notNull (String q, Predicate<String> predicate){
        System.out.println(predicate.test(q));
    }
    static void isEmpty(String q, Predicate<String> predicate){
        System.out.println(predicate.test(q));
    }

   static class HeavyBox{
        public int weight;

        public HeavyBox(int weight) {
            this.weight = weight;
        }

       @Override
       public String toString() {
           return "HeavyBox{" +
                   "weight=" + weight +
                   '}';
       }

       public int getWeight() {
           return weight;
       }
   }

}
