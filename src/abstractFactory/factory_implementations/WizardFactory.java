package abstractFactory.factory_implementations;

import abstractFactory.heroes.Hero;
import abstractFactory.factory_interfaces.HeroFactory;
import abstractFactory.heroes.Wizard;

public class WizardFactory implements HeroFactory {
    @Override
    public Hero createHero(String name) {
        return new Wizard(name);
    }
}
