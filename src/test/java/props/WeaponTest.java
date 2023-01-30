package props;

import characters.ricks.Job;
import characters.ricks.Rick;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WeaponTest {


    Weapon laserGun;
    Weapon knife;
    Rick copRick;
    ArrayList <IProp> copRickProps = new ArrayList<IProp>(){
        @Override
        public boolean add(IProp iProp) {
            return super.add(iProp);
        }
    };

    @Before
    public void before(){
        copRickProps = new ArrayList<IProp>();
        laserGun = new Weapon(WeaponType.LASER_GUN);
        knife = new Weapon(WeaponType.KNIFE);
        copRick = new Rick("Cop Rick", 50, Job.COP, copRickProps);
        copRickProps.add(laserGun);
    }

    @Test
    public void weaponTests(){
        assertEquals(WeaponType.LASER_GUN, laserGun.getWeaponType());
        System.out.println(copRickProps);
        assertEquals(1, copRickProps.size());
    }

    @Test
    public void weaponCanDamage(){
        knife.attack(copRick, 10);
        assertEquals(40, copRick.getHealthValue());
    }
}
