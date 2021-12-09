package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character{

    public static final int SECONDARY_DAMAGE_MULTIPLIER = 2;

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    private int  getActualSecondaryDamage(){
        return (int)(Math.random() * getActualPrimaryDamage() * 2);
    }

    public void secondaryAttack(Character enemy){
        if(enemy.getPosition().getDistance(this.getPosition()) < 2){
            hit(enemy,getActualSecondaryDamage());
        }
    }
}
