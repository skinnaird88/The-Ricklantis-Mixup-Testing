package plots;

import characters.Person;
import props.IProp;
import props.PortalGun;

import java.util.ArrayList;

public class SimpleRicks extends Plot{

    public SimpleRicks(String name, ArrayList<Person> characters) {
        super(name, characters);
    }

    public void flavorCoreStandOff(ArrayList<Person> factoryCharacters, ArrayList<Person> blenderCharacters,
                                   Person simpleRick,
                                   ArrayList<IProp> props,
                                   PortalGun portalGun){
        portalGun.teleport(50);
        if(props.contains(portalGun)){
        factoryCharacters.remove(simpleRick);
        blenderCharacters.add(simpleRick);
        simpleRick.setHealthValue(0);}
    }
}
