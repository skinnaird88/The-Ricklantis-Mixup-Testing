package plots;

import characters.Person;

import java.util.ArrayList;
import java.util.Objects;

public class StandByMorty extends Plot{

    public StandByMorty(String name, ArrayList<Person> characters) {
        super(name, characters);
    }

    public void slickJumpsIntoWishingPortal(Person character){
        if(Objects.equals(character.name, "Slick")){
            characters.remove(character);
        }
    }
}
