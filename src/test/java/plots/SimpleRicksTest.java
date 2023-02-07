package plots;

import characters.Person;
import characters.ricks.Job;
import characters.ricks.Rick;
import org.junit.Before;
import org.junit.Test;
import props.IProp;
import props.PortalGun;
import props.Weapon;
import props.WeaponType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SimpleRicksTest {

    SimpleRicks simpleRicks;
    ArrayList<Person> charactersInFactory;
    ArrayList<Person> blenderDimension;
    ArrayList<IProp> j32props;
    ArrayList<IProp> swatTeamProps;
    ArrayList<IProp> simpleRickProps;
    Weapon truncheon;
    Weapon shield;
    Rick J32;
    Rick coolRick;
    Rick swat1;
    Rick swat2;
    Rick swat3;
    ArrayList<Person>swatRicks;
    Rick regionalManagerRick;
    Rick simpleRick;
    PortalGun portalGun;

    @Before
    public void before(){
        simpleRicks = new SimpleRicks("Simple Ricks", charactersInFactory);
        blenderDimension = new ArrayList<Person>();
        J32 = new Rick("J-32", 20, Job.FACTORY_WORKER, j32props);
        j32props = new ArrayList<IProp>();
        coolRick = new Rick("Cool Rick", 50, Job.FACTORY_WORKER, null);
        swatTeamProps = new ArrayList<IProp>();
        truncheon = new Weapon(WeaponType.TRUNCHEON);
        shield = new Weapon(WeaponType.SHIELD);
        swatTeamProps.add(truncheon);
        swatTeamProps.add(shield);
        swat1 = new Rick("Swat Team Rick 1", 50, Job.MODERATOR, swatTeamProps);
        swat2 = new Rick("Swat Team Rick 2", 50, Job.SOLDIER, swatTeamProps);
        swat3 = new Rick("Swat Team Rick 3", 50, Job.SOLDIER, swatTeamProps);
        regionalManagerRick = new Rick("Regional Manager Rick", 30, Job.FACTORY_WORKER, null);
        simpleRick = new Rick("Simple Rick", 20, Job.SIMPLE_RICK, simpleRickProps);
        portalGun = new PortalGun(400);
        swatRicks = new ArrayList<Person>();
        charactersInFactory = new ArrayList<Person>();
        swatRicks.add(swat1);
        swatRicks.add(swat2);
        swatRicks.add(swat3);
        charactersInFactory.addAll(swatRicks);
        charactersInFactory.add(J32);
        charactersInFactory.add(simpleRick);
        charactersInFactory.add(coolRick);
        charactersInFactory.add(regionalManagerRick);

    }
    @Test
    public void canAddAllSwatsToFactory(){
        assertEquals(7, charactersInFactory.size());
    }

    @Test
    public void simpleRickTests(){
        assertEquals("Simple Rick", simpleRick.getName());
        assertEquals(20, simpleRick.getHealthValue());
        assertEquals(Job.SIMPLE_RICK, simpleRick.getJob());
        assertEquals(simpleRickProps, simpleRick.getProps());
    }

    @Test
    public void portalSimpleRickToBlenderDimension(){
        j32props.add(portalGun);
        assertEquals(1, j32props.size());
        simpleRicks.flavorCoreStandOff(charactersInFactory, blenderDimension, simpleRick, j32props, portalGun);
        assertEquals(6, charactersInFactory.size());
        assertEquals(1, blenderDimension.size());
        assertEquals(0, simpleRick.getHealthValue());
        assertEquals(350, portalGun.getPortalGunFluidLevel());
    }


}
