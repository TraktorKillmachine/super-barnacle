public class WarriorBattle {

    private WarriorCard warrior1;
    private WarriorCard warrior2;

    public WarriorBattle(WarriorCard warrior1, WarriorCard warrior2) {
        this.warrior1 = warrior1;
        this.warrior2 = warrior2;
    }

    public void attack() {
        // Воин 1 атакует воина 2
        int damage1 = warrior1.getDamage();
        warrior2.takeDamage(damage1);
        System.out.println(warrior1.getName() + " атакует " + warrior2.getName()
