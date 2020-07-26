package abstractFactory.spells;

public class FireStorm implements Spell {
    @Override
    public void cast() {
        System.out.println("Firestorm rained down on the enemy");
    }
}
