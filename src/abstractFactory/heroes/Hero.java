package abstractFactory.heroes;

import abstractFactory.spells.Spell;
import abstractFactory.weapons.Weapon;

public interface Hero {
    void hit();
    void cast();
    void setWeapon(Weapon weapon);
    void setSpell(Spell spell);
}
