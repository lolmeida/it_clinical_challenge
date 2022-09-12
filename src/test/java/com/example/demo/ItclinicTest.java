package com.example.demo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ItclinicTest {
    @Test
    public void whenNequalOneShouldReturnITCLNA(){
        ItClinic problem = new ItClinic();
        assertEquals("ITCLNA",problem.problem("ITCLiNicAl", 1) );

    }

    @Test
    public void whenNequalTwoShouldReturnTLN(){
        ItClinic problem = new ItClinic();
        assertEquals("TLN",problem.problem("ITCLiNicAl", 2) );

    }
    @Test
    public void whenNequalThreeShouldReturnCNA(){
        ItClinic problem = new ItClinic();
        assertEquals("CNA",problem.problem("ITCLiNicAl", 3) );

    }
    @Test
    public void whenNequalHundredShouldReturnEmpty(){
        ItClinic problem = new ItClinic();
        assertEquals("",problem.problem("ITCLiNicAl", 100) );

    }
    @Test
    public void whenNequalMinusOneShouldReturnEmpty(){
        ItClinic problem = new ItClinic();
        assertEquals("",problem.problem("ITCLiNicAl", -1) );

    }
    @Test
    public void shouldReturnUppercaseNumbersOrSpecialChars(){
        ItClinic problem = new ItClinic();
        assertEquals("!CL1N",problem.problem("!tCL1Nical", 1) );

    }

    @Test
    public void shouldReturnCountOfReturnedChars(){
        ItClinic problem = new ItClinic();
        assertEquals("I = 2\nC = 2\nL = 2\nN = 1\nA = 1\n",problem.problem("ItCLINiCAL", 1) );

    }

}
