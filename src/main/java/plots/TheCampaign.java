package plots;

import characters.Person;
import characters.mortys.Morty;
import characters.ricks.Rick;
import props.IProp;
import props.Weapon;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TheCampaign extends Plot{

    public TheCampaign(String name, ArrayList<Person> characters) {
        super(name, characters);
    }


    public Person debate(ArrayList<Person> debateCandidates, Person morty){
        Person winner = null;
        if(debateCandidates.contains(morty)){
            winner = morty;
        }
        return winner;
    }

    public void campaignManagerMortyAttacksCandidateMorty(Morty campaignManager, Morty candidate, Rick security, Weapon mortyGun){
        

    }
}
