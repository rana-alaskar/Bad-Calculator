package edu.pnu.badcalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void calculatorIsCreated() {
        Calculator c = new Calculator();
        assertNotNull(c);
    }
}
