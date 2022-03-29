package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        Person person = new Person(001L, "Uncle", "Buck");

        assertAll("TESTE DE MULTIPLOS FUNÇÕES",
                () -> assertEquals("Uncle", person.getFirstName()),
                () -> assertEquals("Buck", person.getLastName()));
    }
}