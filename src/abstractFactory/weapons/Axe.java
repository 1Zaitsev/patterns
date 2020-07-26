package abstractFactory.weapons;

public class Axe implements Weapon {
    @Override
    public void hit() {
        System.out.println("Hit enemy with an axe!");
    }
}
