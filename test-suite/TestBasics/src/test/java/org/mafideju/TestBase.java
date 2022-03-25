package org.mafideju;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestBase {

    @Test
    void getStatus() {
        Base base = new Base();
        String result = base.getStatus();
        assertEquals("Searching for", result);
    }

    @Test
    void getSum() {
        Base base = new Base();
        int result = base.getSum();
        assertEquals(5, result);
    }

    @Test
    void getDynamicSum() {
        Base base = new Base();
        int result = base.getDynamicSum(1, 1);
        assertEquals(2, result);
    }
}
