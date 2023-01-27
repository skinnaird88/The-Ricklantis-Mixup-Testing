package ricks;

import characters.ricks.Rick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RickTest {

    Rick rick;

    @Before
    public void before(){
        rick = new Rick("C137", 50, "Rickest Rick");
    }

    @Test
    public void hasName(){
        assertEquals("C137", rick.getName());
    }
}
