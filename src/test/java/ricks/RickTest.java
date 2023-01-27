package ricks;

import characters.ricks.Job;
import characters.ricks.Rick;
import org.junit.Before;
import org.junit.Test;

import static characters.ricks.Job.NEWS_ANCHOR;
import static org.junit.Assert.assertEquals;

public class RickTest {

    Rick D716;

    @Before
    public void before(){
        D716 = new Rick("D716", 50, NEWS_ANCHOR);
    }

    @Test
    public void hasName(){
        assertEquals("D716", D716.getName());
    }

    @Test
    public void hasJob(){
        assertEquals(NEWS_ANCHOR, D716.getJob());
    }
}
