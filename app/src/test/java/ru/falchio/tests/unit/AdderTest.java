package ru.falchio.tests.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdderTest {
    private Adder adder;

    @Before
    public void start(){
        adder = new Adder();
    }

    @Test
    public void addition_isCorrect() {
        Assert.assertEquals(4, adder.add(2,2));
    }

    @Test
    public void addition_isNotCorrect() {
        Assert.assertNotEquals(5, adder.add(2,2));
    }

    @Test
    public void addition_isCorrect1() {
        Assert.assertEquals(-2, adder.add(-7,5));
    }

    @Test
    public void addition_isCorrect2() {
        Assert.assertNotEquals(null, adder.add(8,5));
    }

}