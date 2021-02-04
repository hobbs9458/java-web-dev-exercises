package org.launchcode.java.demos.lsn6inheritance.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.Cat;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Testing {
    public Cat myCat;

    @Before
    public void createCat() {
        myCat = new HouseCat("Garfield",13);
    }

    @Test
    public void testing() {
        assertEquals("Hello my name is Garfield!", myCat.noise());
    }

    @Test
    public void anotherTest() {
        assertEquals("I'm a HouseCat", ((HouseCat) myCat).purr());
    }
}
