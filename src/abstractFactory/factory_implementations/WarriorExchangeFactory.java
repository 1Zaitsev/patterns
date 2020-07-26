package abstractFactory.factory_implementations;

import abstractFactory.factory_interfaces.ExchangeFactory;
import abstractFactory.factory_interfaces.HeroFactory;
import abstractFactory.factory_interfaces.SpellFactory;
import abstractFactory.factory_interfaces.WeaponFactory;

public class WarriorExchangeFactory implements ExchangeFactory {
    @Override
    public HeroFactory getHeroFactory() {
        return new WarriorFactory();
    }

    @Override
    public WeaponFactory getWeaponFactory() {
        return new WarriorWeaponFactory();
    }

    @Override
    public SpellFactory getSpellFactory() {
        return new WarriorSpellFactory();
    }
}
