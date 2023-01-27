package characters.mortys;

import characters.Person;
import props.IProp;

public class Morty extends Person {
 public Role role;
 public IProp prop;

    public Morty(String name, int healthValue, Role role, IProp prop) {
        super(name, healthValue);
        this.role = role;
        this.prop = prop;
    }

    public Morty(String name, int healthValue, IProp prop) {
        super(name, healthValue);
        this.prop = prop;
    }

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

    public IProp getProp() {
        return prop;
    }

    public void setProp(IProp prop) {
        this.prop = prop;
    }
}
