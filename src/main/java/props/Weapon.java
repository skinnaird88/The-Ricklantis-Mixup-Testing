package props;

import characters.Person;

public class Weapon implements IProp{

    WeaponType weaponType;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void attack(Person person, int damage){
        person.healthValue -= damage;
    }
}
