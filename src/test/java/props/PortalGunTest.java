package props;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PortalGunTest {

    PortalGun portalGun1;

    @Before
    public void before(){
        portalGun1 = new PortalGun(300);
    }

    @Test
    public void hasFluidLevel(){
        assertEquals(300, portalGun1.getPortalGunFluidLevel());
    }

    @Test
    public void canReduceFluidLevel(){
        portalGun1.teleport(50);
        assertEquals(250, portalGun1.getPortalGunFluidLevel());
    }

    @Test
    public void canIncreaseFluidLevel(){
        portalGun1.topUpFluid(50);
        assertEquals(350, portalGun1.getPortalGunFluidLevel());
    }
}
