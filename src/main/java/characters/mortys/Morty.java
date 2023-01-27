package characters.mortys;

import characters.Person;

public class Morty extends Person {
 public Role role;

    public Morty(String name, int healthValue, Role role) {
        super(name, healthValue);
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
