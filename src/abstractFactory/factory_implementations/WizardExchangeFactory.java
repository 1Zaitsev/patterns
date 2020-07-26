package abstractFactory.factory_implementations;

import abstractFactory.factory_interfaces.ExchangeFactory;
import abstractFactory.factory_interfaces.HeroFactory;
import abstractFactory.factory_interfaces.SpellFactory;
import abstractFactory.factory_interfaces.WeaponFactory;

public class WizardExchangeFactory implements ExchangeFactory {
    @Override
    public HeroFactory getHeroFactory() {
        return new WizardFactory();
    }

    @Override
    public WeaponFactory getWeaponFactory() {
        return new WizardWeaponFactory();
    }

    @Override
    public SpellFactory getSpellFactory() {
        return new WizardSpellFactory();
    }
}
