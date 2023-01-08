package com.interfaces;

public class Office implements OfficeSupportEntity{
    Long id;
    String name;

    public Office(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Office{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Computer getComputer() {
        return null;
    }

    @Override
    public void setComputer(Computer c) {

    }

    @Override
    public Office getOffice() {
        return this;
    }

    @Override
    public void setOffice(Office office) {
        this.id = office.id;
        this.name = office.name;
    }

    @Override
    public String getName() {
        return null;
    }

}
