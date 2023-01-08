package com.patterns;


import java.util.*;

public class Storage {
    private List<String> items;
    private static Storage instance;
    private Storage (){
        items = new ArrayList<String>();
    }
    public static Storage getInstance(){
        if(instance==null){
            instance = new Storage();
            System.err.println("creating new instance");
        }else System.err.println("returns old instance");
        return instance;
    }
    public void addItem(String item){
        items.add(item);
    }
    public void getItems(){
        for (String s : items
             ) {
            System.out.print(s+" ");
        }
    }

}
