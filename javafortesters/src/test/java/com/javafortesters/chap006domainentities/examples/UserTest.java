package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Tola on 24/05/2015
 */
public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();

        assertEquals("default username expected", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin","pA55w0rD");

        assertEquals("given username expected", "admin", user.getUsername());
        assertEquals("given password expected", "pA55w0rD", user.getPassword());
    }

    @Test
    public void userPublicField(){  //example changing value of public field from User class
        User auser = new User();
       // auser.username = "bob";
        //assertEquals("not default username","bob", auser.username);
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword("PaZZwor6");

        assertEquals("setter password expected" ,"PaZZwor6", user.getPassword());
    }
}
