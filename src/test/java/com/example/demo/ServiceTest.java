package com.example.demo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ServiceTest {
    @Test
    public void whenNequalOneShouldReturnITCLNA() {
        Service service = new Service();
        assertEquals("ITCLNA", service.candidatura("ITCLiNicAl", 1));

    }

    @Test
    public void whenNequalTwoShouldReturnTLN() {
        Service service = new Service();
        assertEquals("TLN", service.candidatura("ITCLiNicAl", 2));

    }

    @Test
    public void whenNequalThreeShouldReturnCNA() {
        Service service = new Service();
        assertEquals("CNA", service.candidatura("ITCLiNicAl", 3));

    }

    @Test
    public void whenNequalHundredShouldReturnEmpty() {
        Service service = new Service();
        assertEquals("", service.candidatura("ITCLiNicAl", 100));

    }

    @Test
    public void whenNequalMinusOneShouldReturnEmpty() {
        Service service = new Service();
        assertEquals("", service.candidatura("ITCLiNicAl", -1));

    }


    @Test
    public void shouldReturnUppercaseNumbersOrSpecialChars() {
        Service service = new Service();
        assertEquals("!CL1N", service.candidatura("!tCL1Nical", 1));
    }

    @Test
    public void shouldReturnCountOfReturnedChars() {
        Service service = new Service();
        assertEquals("I = 2\nC = 2\nL = 2\nN = 1\nA = 1\n", service.candidatura("ItCLINiCAL", 1));

    }

}
