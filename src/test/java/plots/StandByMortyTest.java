package plots;

import characters.Person;
import characters.mortys.Morty;
import characters.mortys.Role;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StandByMortyTest{

    StandByMorty standByMorty;
    ArrayList<Person> characters;
    Morty slick;
    Morty lizardMorty;
    Morty glassesMorty;
    Morty leftHandedMorty;
    Morty bigMorty;


    @Before
    public void before(){
        standByMorty = new StandByMorty("Stand By Morty", characters);
        slick = new Morty("Slick", 40, Role.STUDENT);
        lizardMorty = new Morty("Lizard Morty", 50, Role.STUDENT);
        glassesMorty = new Morty("Glasses Morty", 50, Role.STUDENT);
        leftHandedMorty = new Morty("Left Handed Morty", 45, Role.STUDENT);
        bigMorty = new Morty("Big Morty", 30, Role.MOBSTER);
        characters = new ArrayList<Person>();
        characters.add(slick);
        characters.add(lizardMorty);
        characters.add(glassesMorty);
        characters.add(leftHandedMorty);
    }

    @Test
    public void canAddCharactersToPlot(){
        assertEquals(4, characters.size());
    }

    @Test
    public void canKillSlickInWishingPortal(){
        standByMorty.slickJumpsIntoWishingPortal(slick, characters);
        assertEquals(3, characters.size());
    }

    @Test
    public void removesNoneIfNotInList(){
        standByMorty.slickJumpsIntoWishingPortal(bigMorty, characters);
        assertEquals(4, characters.size());
    }
}
