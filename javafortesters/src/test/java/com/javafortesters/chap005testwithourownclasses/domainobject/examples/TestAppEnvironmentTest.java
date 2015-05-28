package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import com.javafortesters.domainobject.TestAppEnv;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by Tola on 22/05/2015
 */
public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){

        assertEquals("Returns Hard Coded URL", "http://192.123.0.3.67", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainStatically(){

        assertEquals("Just the Domain", "192.123.0.3", TestAppEnv.DOMAIN);
    }

    @Test
    public void canGetPortStatically(){

        assertEquals("Just the port", "67", TestAppEnv.PORT);

    }
}

