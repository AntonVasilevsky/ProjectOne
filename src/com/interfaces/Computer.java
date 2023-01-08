package com.interfaces;

public class Computer implements ComputerSupportable{
    long id;
    String name;

    public Computer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Computer getComputer() {
        return this;
    }


    @Override
    public void setComputer(Computer c) {
        this.id = c.id;
        this.name = c.name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
