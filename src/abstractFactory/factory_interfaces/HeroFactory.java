package abstractFactory.factory_interfaces;

import abstractFactory.heroes.Hero;

public interface HeroFactory {
    Hero createHero(String name);
}
