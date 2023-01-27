package props;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon laserGun;

    @Before
    public void before(){
        laserGun = new Weapon(WeaponType.LASER_GUN);
    }

    @Test
    public void weaponTests(){
        assertEquals(WeaponType.LASER_GUN, laserGun.getWeaponType());
    }
}
