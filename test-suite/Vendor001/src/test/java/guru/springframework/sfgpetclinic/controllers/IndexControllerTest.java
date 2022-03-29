package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void index() {
        String method = controller.index();
        Assertions.assertEquals("index", method);
        Assertions.assertNotEquals("wrong view", method);
    }

    @Test
    void oupsHandler() {
        String method = controller.oupsHandler();
        Assertions.assertEquals("notimplemented", method);
    }
}