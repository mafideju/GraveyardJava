package org.mafideju.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    Greeting saludo;

    @BeforeEach
    void setUp() {
        saludo = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(saludo.helloWorld());
        assertEquals(saludo.helloWorld(), "Hello World");
    }

    @Test
    void testHelloWorld() {
        System.out.println(saludo.helloWorld("Marcio"));
        assertEquals(saludo.helloWorld("Marcio"), "Hello Marcio");
    }
}
