package abstractFactory.factory_implementations;

import abstractFactory.weapons.Axe;
import abstractFactory.weapons.Weapon;
import abstractFactory.factory_interfaces.WeaponFactory;

public class WarriorWeaponFactory implements WeaponFactory {
    @Override
    public Weapon getWeapon() {
        return new Axe();
    }
}
