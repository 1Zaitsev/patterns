package abstractFactory.factory_implementations;

import abstractFactory.spells.Spell;
import abstractFactory.spells.UltimateDefense;
import abstractFactory.factory_interfaces.SpellFactory;

public class WarriorSpellFactory  implements SpellFactory {
    @Override
    public Spell getSpell() {
        return new UltimateDefense();
    }
}
