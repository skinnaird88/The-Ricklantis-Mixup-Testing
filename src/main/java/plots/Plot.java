package plots;

import characters.Person;

import java.util.ArrayList;

public abstract class Plot {

    public String name;

    ArrayList<Person> characters;

    public Plot(String name, ArrayList<Person> characters) {
        this.name = name;
        this.characters = characters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Person> characters) {
        this.characters = characters;
    }
}
