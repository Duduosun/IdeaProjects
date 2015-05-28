package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Tola on 27/05/2015
 */
public class MySelectionTest {

    @Test
    public void moreTernary(){
        String url = "www.salmon.com";
        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http:/"));
        assertEquals("http://www.salmon.com", url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void catTernaryOperatorExample(){
        int numberOfCats = 2;
        String cat = "cat";
        String cats = "cats";
        String res = (numberOfCats == 1 ? cat : cats);

        assertEquals("cats is 2",2, numberOfCats);
    }

    @Test
    public void ifAddHttp(){
        String url ="www.sainsburys.co.uk";
        if (!url.startsWith(("http"))){
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.sainsburys.co.uk", url);
    }

    @Test
    public void ifTruthy(){
        boolean truthy=true;
        String aTruth = null;
        if (truthy == true)
            aTruth = "myGood";

//        assertTrue("truthy is myGood",truthy);
        assertEquals("truthy is the truth", "myGood", aTruth);
    }

    @Test
    public void ifFalsy(){
        boolean truthy = true;
        String aTruth = null;
        if (truthy == true) {
            aTruth = "myGood";
            // aTruth = "myBad";
        }

        assertTrue("truthy is myGood", truthy);
        assertFalse("not truthy is myBad", !truthy);
        assertEquals("truthy is true", "myGood", aTruth);
        // assertEquals("not truthy is false", "myBad", aTruth);
    }

    @Test
    public void ifElseAddHttp(){
        String url = "www.sainsburys.co.uk";
        if (url.startsWith("http://")){
            //do nothing the url is fine
        }else {
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.sainsburys.co.uk", url);
    }

    @Test
    public void ifElseTruthy(){
        boolean truthy = true;
        String aTruth = null;
        if (truthy==true)
            aTruth = "myGood";
        else aTruth = "myBad";

        assertTrue("truthy is myGood", truthy);
        assertFalse("not truthy is myBad", !truthy);
    }

    @Test
    public void ifElseNestedAddHttp(){
        String url = "sainsburys.com";
        if (url.startsWith(("http"))){
            //do nothing the url is fine
        }else{
            if (!url.startsWith(("www"))){
                url = "www." + url;
            }
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http:/www.sainsburys.com", url);
    }
}
