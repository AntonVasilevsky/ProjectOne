package com.lambda;

public class Task3 {
    static void asd(int n, Q q){
        System.out.println(q.thirteen(n));
    }

    public static void main(String[] args) {

        asd(23,n->n%13==0);


    }

    interface Q{
        boolean thirteen(int n);
    }
}
