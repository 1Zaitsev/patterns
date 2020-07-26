package abstractFactory.factory_implementations;

import abstractFactory.heroes.Hero;
import abstractFactory.heroes.Warrior;
import abstractFactory.factory_interfaces.HeroFactory;

public class WarriorFactory implements HeroFactory {

    @Override
    public Hero createHero(String name) {
        return new Warrior(name);
    }
}
