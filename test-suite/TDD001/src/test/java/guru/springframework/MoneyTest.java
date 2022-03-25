package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplicator() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.getAmount());
    }

    @Test
    void testSummer() {
        Dollar five = new Dollar(5);
        five.plus(5);
        assertEquals(10, five.getAmount());
    }
}
