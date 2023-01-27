package mortys;

import characters.mortys.Morty;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MortyTest {

    Morty morty;

    @Before
    public void before(){
        morty = new Morty("The one true Morty", 100, "The Mortytown Locos");
    }
    @Test
    public void hasGroup(){
        assertEquals("The Mortytown Locos", morty.getGroup());
    }
}
