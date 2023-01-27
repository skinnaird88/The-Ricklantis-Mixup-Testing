package mortys;

import characters.mortys.Morty;
import characters.mortys.Role;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MortyTest {

    Morty copMorty;

    @Before
    public void before(){
        copMorty = new Morty("Cop Morty", 100, Role.COP);
    }
    @Test
    public void testMortyProperties(){
        assertEquals(Role.COP, copMorty.getRole());
        assertEquals("Cop Morty", copMorty.getName());
        assertEquals(100, copMorty.getHealthValue());
    }
}
