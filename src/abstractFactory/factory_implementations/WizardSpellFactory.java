package abstractFactory.factory_implementations;

import abstractFactory.factory_interfaces.SpellFactory;
import abstractFactory.spells.FireStorm;
import abstractFactory.spells.Spell;
import abstractFactory.spells.UltimateDefense;

public class WizardSpellFactory implements SpellFactory {
    @Override
    public Spell getSpell() {
        return new FireStorm();
    }
}
