package com.interfaces;

public class SecurityGuard extends Person implements ComputerSupportable, OfficeSupportEntity{
    String specialAmmo = "whistle";
    Computer computer;
    Office office;

    public SecurityGuard() {
    }
    public SecurityGuard(Long id, String name, Computer computer, Office office) {
        super(id, name);
        this.computer = computer;
        this.office = office;
    }



    @Override
    public Computer getComputer() {
        return this.computer;
    }

    @Override
    public void setComputer(Computer c) {
        this.computer = c;
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
