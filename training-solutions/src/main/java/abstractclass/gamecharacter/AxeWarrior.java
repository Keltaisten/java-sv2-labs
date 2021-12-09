package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character{

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    private int  getActualSecondaryDamage(){
        return getActualPrimaryDamage() * 2;
    }

    public void secondaryAttack(Character enemy){
        if(enemy.getPosition().getDistance(this.getPosition()) < 2){
            hit(enemy,getActualSecondaryDamage());
        }
    }
}
