package characters.mortys;

import characters.Person;

public class Morty extends Person {
 public String group;

    public Morty(String name, int healthValue, String group) {
        super(name, healthValue);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
