public class Card {
    private String name;
    private int healtpoint;
    private int damage;

    public Card(String setName, int setHealtpoint, int setDamage) {
        name = setName;
        healtpoint = setHealtpoint;
        damage = setDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealtpoint() {
        return healtpoint;
    }

    public void setHealtpoint(int healtpoint) {
        this.healtpoint = healtpoint;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Название: " + name + ", " +
                "Здоровье: " + healtpoint + ", " +
                "Урон: " + damage +
                "}";
    }
}