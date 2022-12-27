package kg.geektech.game.playes;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        setSavedDamage((boss.getDamage()*10) / 100 );
        for (int i = 0; i < heroes.length; i++) {
            if((heroes[i]) instanceof Berserk){
                heroes[i].setDamage(heroes[i].getDamage() + savedDamage);
            }
        }
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
}
