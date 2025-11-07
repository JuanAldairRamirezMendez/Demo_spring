package com.utp.demo.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloControllerTest {
    @Test
    void testSaludo() {
        HelloController controller = new HelloController();
        assertEquals("Hola desde Spring Boot + CircleCI",
controller.saludo());
    }
}
