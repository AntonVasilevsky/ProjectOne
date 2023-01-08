package com.IO.task3;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Ivan", 25, 180, 'm', "blond"
        , new Address("Brown", 1, 2));
        Employee employee = new Employee("Alan", 26, 180, 'm', "ginger",
                new Address("Brown", 1, 2), "worker" );



        try (FileOutputStream fos = new FileOutputStream("e:\\2.txt");
              ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fis = new FileInputStream("e:\\2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis)){
            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }

    }

}
