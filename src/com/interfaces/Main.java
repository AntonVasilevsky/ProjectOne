package com.interfaces;

public class Main {
    public static void main(String[] args) {
        Office office = new Office(0l, "Epam");
        Office office1 = new Office(1l, "Microsoft");
        Office office2 = new Office(2l, "Tesla");
        Office office3 = new Office(3l, "Mercedes");
        Office office4 = new Office(4l, "SpaceX");
        Courier courier = new Courier(12l, "Tom", office4);
        Courier courier1 = new Courier(21l, "Lens", office3);
        Employee emp = new Employee();
        Employee emp2 = new Employee(1l, "Alisa", new Computer (20, "Apple"), office);
        Employee emp3 = new Employee(5l, "Anton", new Computer (21, "Apple"),office1);
        emp.setId(5l);
        emp.setName("Stephen");
        emp.setComputer(new Computer (21, "Apple"));
        emp.setOffice(office3);
        courier1.setId(3l);
        courier.setId(3l);
        courier.setName("Bob");
        courier1.setName("Bob");


        SecurityGuard sg = new SecurityGuard();
        SecurityGuard sg2 = new SecurityGuard(6l, "Arnold", new Computer(10, "IBM"), office4);
        SecurityGuard sg3 = new SecurityGuard(7l, "Silvester", new Computer(11, "Apple"), office1);
        SecurityGuard sg4 = new SecurityGuard(8l, "Slava", new Computer(12, "Raspberry"), office);
        SecurityGuard sg5 = new SecurityGuard(9l, "Rachel", new Computer(13, "Microsoft"), office2);
        sg.setName("Liam");
        sg.setId(2l);
        sg.setComputer(new Computer(14, "IBM"));



        Person[] people = {emp, sg2, sg3, emp3, emp2, sg4, sg5};

        for (Person p : people
             ) {
            if(p.getOffice().name.equalsIgnoreCase("tesla")){
                System.out.println(p.getOffice());
            }
        }



    }


}
