package com.staticTasks.task1;

public class MyClass {
    public static void main(String[] args) {
        Solution firstSolution = new Solution(69); //22869
        Solution secondSolution  = new Solution(228); //23256
        countTheResult(firstSolution);
        countTheResult(secondSolution);


    }
    public static void countTheResult(Solution solution){
        System.out.println(solution.getTemp());
    }
    static class Solution{
        private int temp;
        static int number;
         final static int CONSTANTA;
       static  {
            number = 100;
            CONSTANTA = 228;
        }
        public Solution (int q){
            temp = q + number++ *CONSTANTA;
        }
        public int getTemp(){
            return temp;
        }

    }
}
