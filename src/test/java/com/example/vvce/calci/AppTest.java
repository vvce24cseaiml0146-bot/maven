package com.example.vvce.calci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAverage() {
        App app = new App();

        double result = app.average(3, 2);

        assertEquals(2.5, result);
    }
}

