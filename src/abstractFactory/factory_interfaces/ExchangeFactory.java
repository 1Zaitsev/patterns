package abstractFactory.factory_interfaces;

public interface ExchangeFactory {
    HeroFactory getHeroFactory();
    WeaponFactory getWeaponFactory();
    SpellFactory getSpellFactory();
}
