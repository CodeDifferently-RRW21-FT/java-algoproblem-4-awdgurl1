package com.codedifferently.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoProblem4Test {

    @Test
    public void testOne(){
        AlgoProblem4 algoProblem4 = new AlgoProblem4();

        String expected = "Wmxqn";
        String actual = algoProblem4.encrypt("Kaleb", 12);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        AlgoProblem4 algoProblem4 = new AlgoProblem4();

        String expected = "Yfwnv";
        String actual = algoProblem4.encrypt("Tariq", 5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        AlgoProblem4 algoProblem4 = new AlgoProblem4();

        String expected = "KhoorZruog";
        String actual = algoProblem4.encrypt("HelloWorld", 3);

        Assertions.assertEquals(expected,actual);
    }



}
