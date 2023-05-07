public abstract class Warrior {
    private String name;
    private int healthPoints;
    private int damage;

    public Warrior(String name, int healthPoints, int damage) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
    }

    public abstract void attack(Warrior other);

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDamage() {
        return damage;
    }
}
