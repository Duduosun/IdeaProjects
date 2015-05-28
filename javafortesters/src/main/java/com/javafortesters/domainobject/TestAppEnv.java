package com.javafortesters.domainobject;

/**
 * Created by Tola on 22/05/2015
 */
public class TestAppEnv {

    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;
        //return "http://192.123.0.3:67";
    }
}
