package org.launchcode.java.demos.lsn6inheritance.Test2;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;
import static org.junit.Assert.assertEquals;

public class Test2 {
    HouseCat myCat;
    @Before
    public void createCat() {
        myCat = new HouseCat("Garfield", 13);
    }

    @Test
    public void testNoise() {
        myCat.setHungry(false);
        assertEquals("Meeeeeeooooowww!", myCat.noise());
    }
}
