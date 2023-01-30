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

    public void teleport(int fluid){
        portalGunFluidLevel -= fluid;
    }

    public void topUpFluid(int fluid){
        portalGunFluidLevel += fluid;
    }
}
