public class LesserGem extends Gem{
    private static int damage;

    public LesserGem(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int getDamage() {
        return 5;
    }
}
