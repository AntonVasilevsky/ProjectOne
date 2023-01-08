package com.staticTasks.task2;

public class Class1 {
    private int field;
    public Class1(int a){
        field = a;
    }
    public int getField(){
        return field;
    }
    public void setField(int field){
        this.field = field;
    }
    static {
        System.out.println("static class A");
    }
    {
        System.out.println("non static class A");
    }
}
