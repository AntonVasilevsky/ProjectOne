package com.reflection;

import com.sun.jdi.InterfaceType;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
        Class c = Person.class;
        //System.out.println( c.getName());
        //System.out.println(Arrays.toString(c.getInterfaces()));
        Person person = new Person();
        Field field = person.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(person, "SSS" );
        System.out.println(person.getUniqueData());
        Method method = person.getClass().getDeclaredMethod("print", String.class);
        method.setAccessible(true);
        method.invoke(person,  field.get(person));
        field.set(person, "AAA");

        method.invoke(person,  field.get(person));
        Class psn = Class.forName("com.reflection.Person");
        System.out.println(psn);
        System.out.println(field.get(person));





        
        //System.out.println(Arrays.toString(c.getDeclaredMethods()));

    }
}
