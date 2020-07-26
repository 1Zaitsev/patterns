package abstractFactory.factory_implementations;

import abstractFactory.factory_interfaces.WeaponFactory;
import abstractFactory.weapons.Axe;
import abstractFactory.weapons.Scepter;
import abstractFactory.weapons.Weapon;

public class WizardWeaponFactory implements WeaponFactory {
    @Override
    public Weapon getWeapon() {
        return new Scepter();
    }
}
