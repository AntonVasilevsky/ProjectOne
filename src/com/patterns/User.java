package com.patterns;

public class User {
    private static User user;
    private User() {

    }

    public static User getUser() {
        if(user==null){
            user = new User();
            System.out.println("creating new user");
        }else {
            System.out.println("returning old user");
        }
            return user;

    }
}
