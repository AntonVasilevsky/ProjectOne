package com.staticTasks.task2;

public class Class2 extends Class1 {
    @Override
    public int getField() {
        return super.getField();
    }



    public Class2(int a) {
        super(a);
    }

    static {
        System.out.println("static class B");
    }

    {
        System.out.println("non static class B");
    }


}
