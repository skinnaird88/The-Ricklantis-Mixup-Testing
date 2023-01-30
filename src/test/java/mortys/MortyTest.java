package mortys;

import characters.mortys.Morty;
import characters.mortys.Role;
import org.junit.Before;
import org.junit.Test;
import props.Weapon;
import props.WeaponType;

import static org.junit.Assert.assertEquals;

public class MortyTest {

    Morty copMorty;
    Morty mortyTownLoco4;
    Weapon knife;

    @Before
    public void before(){
        copMorty = new Morty("Cop Morty", 100, Role.COP);
        knife = new Weapon(WeaponType.KNIFE);
        mortyTownLoco4 = new Morty("Slick", 20, Role.STUDENT, knife);
    }
    @Test
    public void testMortyProperties(){
        assertEquals(Role.COP, copMorty.getRole());
        assertEquals("Cop Morty", copMorty.getName());
        assertEquals(100, copMorty.getHealthValue());
    }
    @Test
    public void canAssignWeaponToMorty(){
        assertEquals(knife, mortyTownLoco4.getProp());
        assertEquals(WeaponType.KNIFE, knife.getWeaponType());
    }
}
