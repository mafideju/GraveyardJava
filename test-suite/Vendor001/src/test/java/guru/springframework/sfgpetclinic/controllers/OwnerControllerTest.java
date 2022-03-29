package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerControllerTest {

    @DisplayName("OWNER CONTROLLER TESTING SUITE")
    @Test
    void dependantAssertions() {
        Owner owner = new Owner(002L, "Uncle", "Buck");
        owner.setCity("Lisboa");
        owner.setTelephone("+5511964395042");

        assertAll("TESTE DE PROPRIEDADES",
                () -> assertAll("PROPRIEDADES DE PERSON",
                        () -> assertEquals("Uncle", owner.getFirstName()),
                        () -> assertEquals("Buck", owner.getLastName())
                ),
                () -> assertAll("PROPRIEDADES DE OWNER",
                        () -> assertEquals("Lisboa", owner.getCity()),
                        () -> assertEquals("+5511964395042", owner.getTelephone())
                )
        );
    }

    @Test
    void setAllowedFields() {
    }

    @Test
    void findOwners() {
    }

    @Test
    void processFindForm() {
    }

    @Test
    void showOwner() {
    }

    @Test
    void initCreationForm() {
    }

    @Test
    void processCreationForm() {
    }

    @Test
    void initUpdateOwnerForm() {
    }

    @Test
    void processUpdateOwnerForm() {
    }
}