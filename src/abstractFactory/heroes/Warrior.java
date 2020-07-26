package abstractFactory.heroes;

import abstractFactory.spells.Spell;
import abstractFactory.weapons.Weapon;

public class Warrior implements Hero{
    String name;
    Weapon weapon;
    Spell spell;
    public Warrior(String name) {
        this.name = name;
        this.weapon = null;
        this.spell = null;
    }

    @Override
    public void hit() {
        if(this.weapon == null){
            System.out.println("hit enemy with a fist");
        }
        else {
            weapon.hit();
        }
    }

    @Override
    public void cast() {
        if(this.spell == null){
            System.out.println("Hero doesn't know any spells");
        }
        else{
            this.spell.cast();
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
}
