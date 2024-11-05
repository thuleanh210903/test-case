package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void testBasicPath1() {
        App app = new App();
        int[] values = {20, 30, -999};
        assertEquals(25, app.average(values, 10, 40));
    }

    @Test
    public void testBasicPath2() {
        App app = new App();
        int[] values = {5, 45, -999};
        assertEquals(-999, app.average(values, 10, 40));
    }

    @Test
    public void testBasicPath3() {
        App app = new App();
        int[] values = {-999};
        assertEquals(-999, app.average(values, 0, 100));
    }

    @Test
    public void testBasicPath4() {
        App app = new App();
        int[] values = {15, -999};
        assertEquals(15, app.average(values, 10, 20));
    }
}
