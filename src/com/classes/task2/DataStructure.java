package com.classes.task2;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class DataStructure {
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    private int index;


    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    public void printer(Predicate<DataStructure> predicate){

        for (int i = 0; i < arrayOfInts.length; i++) {
            index = i;
            if(predicate.test(this)){
                System.out.println(i);
            }
        }

    }
    public void prints(Function<Integer, Boolean> function){
        for (int i = 0; i < arrayOfInts.length; i++){
            if(function.apply(i)){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }
    public static boolean isEven(int i){
        return i%2==0;
    }
    public static boolean isOdd(int i){
        return i%2!=0;
    }
    public boolean isEvenIndex(){
        return index%2==0;
    }
    public boolean isOddIndex(){
        return !isEvenIndex();
    }

    public void printEven() {

        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
        void print(DataStructureIterator iterator);


    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    private  class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public void setNextIndex(int nextIndex){
            this.nextIndex = nextIndex;
        }

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = arrayOfInts[nextIndex];

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }


        @Override
        public void print(DataStructureIterator iterator) {
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }
    }

    public static void main(String s[]) {

        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        DataStructureIterator iterator = ds.new EvenIterator();
        //ds.printEven();
        EvenIterator evenIterator = ds.new EvenIterator();
        //evenIterator.print(iterator);
        print(i->{

            evenIterator.setNextIndex(1);  // changes odd to even
           evenIterator.print(evenIterator);
           return true;
        });
//        System.out.println("starts here" );
        //ds.printer(dataStructure -> dataStructure.isOddIndex());
//        ds.printer(DataStructure::isEvenIndex);
        //ds.prints(d -> d%2!=0);
        ds.prints(DataStructure::isEven);
        ds.prints(DataStructure::isOdd);




       /* evenIterator.print(new DataStructureIterator() {
            private int nextIndex = 1;

            public boolean hasNext() {

                // Check if the current element is the last in the array
                return (nextIndex <= SIZE - 1);
            }

            public Integer next() {

                // Record a value of an even index of the array
                Integer retValue = ds.arrayOfInts[nextIndex];

                // Get the next even element
                nextIndex += 2;
                return retValue;
            }


            @Override
            public void print(DataStructureIterator iterator) {
                while (iterator.hasNext()) {
                    System.out.print(iterator.next() + " ");
                }
                System.out.println();
            }



        });*/



    }






    public static void print(Function<Integer, Boolean> iteration){
        iteration.apply(2);
    }


}
