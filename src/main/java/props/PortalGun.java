package props;

public class PortalGun implements IProp{

    int portalGunFluidLevel;

    public PortalGun(int portalGunFluidLevel) {
        this.portalGunFluidLevel = portalGunFluidLevel;
    }

    public int getPortalGunFluidLevel() {
        return portalGunFluidLevel;
    }

    public void setPortalGunFluidLevel(int portalGunFluidLevel) {
        this.portalGunFluidLevel = portalGunFluidLevel;
    }
}
