package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int magicsAbility = RPG_Game.random.nextInt(1,5);
        for (Hero hero : heroes) {
            hero.setDamage(hero.getDamage() + magicsAbility);
        }
    }
}
