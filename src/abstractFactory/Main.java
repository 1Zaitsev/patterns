package abstractFactory;

import abstractFactory.factory_interfaces.ExchangeFactory;
import abstractFactory.factory_interfaces.HeroFactory;
import abstractFactory.heroes.Hero;
import abstractFactory.weapons.Weapon;

public class Main {
    public static void main(String[] args) {
        ExchangeFactory exchangeFactory = Factory.getInstance().getFactory(Factory.Type.WIZARD);
        Hero hero = exchangeFactory.getHeroFactory().createHero("Sirius");
        hero.cast();
        hero.setWeapon(exchangeFactory.getWeaponFactory().getWeapon());
        hero.setSpell(exchangeFactory.getSpellFactory().getSpell());
        hero.cast();
    }
}
