package com.coveros.demo.helloworld;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestClass {

    @Test
    public void testConcatenate() {
        HelloWorld myUnit = new HelloWorld();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);
    }
}