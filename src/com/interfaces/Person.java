package com.interfaces;

public abstract class Person implements Identifiable, ComputerSupportable, OfficeSupportEntity{
    Long id;
    String name;

    public Person() {

    }

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void setId(Long id) {
    this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public boolean equalTo(Identifiable identifiable) {
        return Identifiable.super.equalTo(identifiable);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
