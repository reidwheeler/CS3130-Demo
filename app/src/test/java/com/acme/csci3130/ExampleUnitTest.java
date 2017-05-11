package com.acme.csci3130;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void integerTest() throws Exception {
        int x=3,y=3;
        assertEquals(x,y);
    }

    @Test
    public void integerTest2() throws Exception {
        int x=3,y=2;
        assertFalse(x==y);
    }

    @Test
    public void arrayTest() throws Exception {
        int a[]=new int[100];
        int b[]=new int[100];
        for(int i=0;i<100;i++){
            a[i]=i;
            b[i]=i;
        }
        assertArrayEquals(a,b);
    }


}