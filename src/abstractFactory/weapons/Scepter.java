package abstractFactory.weapons;

public class Scepter implements Weapon {
    @Override
    public void hit() {
        System.out.println("Hit enemy with an scepter!");
    }
}
