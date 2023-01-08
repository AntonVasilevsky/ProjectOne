package com.interfaces;

public class Courier extends Person implements ComputerSupportable, OfficeSupportEntity{
    private Computer computer;
    private Office office;
    public Courier() {
    }

    public Courier(Long id, String name,Office office) {
        super(id, name);
        this.office = office;
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
        return this.office;
    }

    @Override
    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
