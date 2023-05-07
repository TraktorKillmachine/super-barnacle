public class Hero extends Warrior {
    public Hero(String name, int healthPoints, int damage) {
        super(name, healthPoints, damage);
    }

    @Override
    public void attack(Warrior other) {
        other.setHealthPoints(other.getHealthPoints() - getDamage());
    }
}
