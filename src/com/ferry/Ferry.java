package com.ferry;

public class Ferry {
    private  final double capacity = 50000;
    private TransportObj[] objects;

    public Ferry(TransportObj[] objects) {
        this.objects = objects;
    }

    public void canGo(){
        double total = 0;
        for (TransportObj o : objects
             ) {
           total+= o.calculateMass();
        }
        if(capacity>=total){
            System.out.println("The ferry can go");
        }else{
            System.out.println("The ferry cant go. Its too heavy");
        }

    }
}
