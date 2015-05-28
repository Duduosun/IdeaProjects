package com.javafortesters.domainentities;

/**
 * Created by Tola on 24/05/2015
 */
public class User {

    private String username; //fields or field variables
    private String password;

    public User(){
        this("username", "password");

        //username = "username";
        //password = "password";
    }

    public User(String username, String password){
        this.username = username; //local variable have same name as field, hence the use of this keyword
        this.password = password;
    }

    public  String getUsername(){   //getter or accessor
        return username;            //fields + getter = property
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
