package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tola on 22/05/2015 for javafortesters for javafortesters Project
 */
public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        //Integer four = new Integer(4);
        Integer four = 4; // this is an object - auto boxing
        //int fourprimitive = 4; // this is a primitive type

        //Integer two = 3; //no boxing
        assertEquals("intValue returns int 4", 4, four.intValue());
    }
    @Test
    public void integerExplorationToo(){
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());
    }

    @Test
    public void integerExplorationAutoBoxing(){
        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());
    }

    @Test
    public void elevenBecomesB(){
        Integer eleven = 11;
        assertEquals("Hex 11 returns b", "b", Integer.toHexString(eleven));
        assertEquals("hex 11 is b", "b",Integer.toHexString(11));
    }

    @Test
    public void tenBecomesA(){
        Integer ten = 10;
        assertEquals("Hex 10 returns a", "a", Integer.toHexString(ten));
        assertEquals("hex 10 is b", "a",Integer.toHexString(10));
    }

    @Test
    public void threeBecomesThree(){
        Integer three = 3;
        assertEquals("toHexString returns string", "3", Integer.toHexString(three));
        assertEquals("hex 3 is b", "3",Integer.toHexString(3));
    }

    @Test
    public void twentyOneBecomesFifteen(){
        Integer twentyone = 21;
        assertEquals("toHexString returns string", "15", Integer.toHexString(twentyone));
        assertEquals("hex 21 is b", "15",Integer.toHexString(21));
    }

    @Test
    public void minValueExploration(){
        int minimumInt = -2147483648;
        assertEquals("min value returns minus",minimumInt, Integer.MIN_VALUE );
    }

    @Test
    public void maxValueExploration(){
        int maximumInt = 2147483647;
        assertEquals("max value returns plus", maximumInt, Integer.MAX_VALUE );
    }
}
