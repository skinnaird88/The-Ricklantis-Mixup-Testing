package ricks;

import characters.ricks.Job;
import characters.ricks.Rick;
import org.junit.Before;
import org.junit.Test;
import props.IProp;
import props.PortalGun;
import props.Weapon;
import props.WeaponType;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static characters.ricks.Job.FACTORY_WORKER;
import static characters.ricks.Job.NEWS_ANCHOR;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RickTest {

    Rick D716;
    Rick factoryRick;
    PortalGun portalGun1;
    Weapon laserGun;
    ArrayList <IProp> factoryRickProps = new ArrayList<>();

    @Before
    public void before(){
        D716 = new Rick("D716", 30, NEWS_ANCHOR, null);
        factoryRick = new Rick("Factory line Rick", 35, FACTORY_WORKER, factoryRickProps);
        portalGun1 = new PortalGun(30);
        factoryRickProps = new ArrayList<IProp>();
        laserGun = new Weapon(WeaponType.LASER_GUN);
    }

    @Test
    public void hasName(){
        assertEquals("D716", D716.getName());
    }

    @Test
    public void hasJob(){
        assertEquals(NEWS_ANCHOR, D716.getJob());
    }

    @Test
    public void propsStartsNull(){
        assertNull(D716.getProps());
    }

    @Test
    public void canAssignProps(){
        factoryRick.setProps(factoryRickProps);
        factoryRick.addProp(portalGun1);
        assertEquals(1, factoryRickProps.size());
        assertEquals(portalGun1, factoryRickProps.get(0));
    }
}
