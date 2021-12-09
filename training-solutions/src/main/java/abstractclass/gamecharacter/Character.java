package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {
    private static final int MAX_DAMAGE = 10;
    private static final int MAX_DEFENCE = 10;
    private Point position;
    private int hitPoint = 100;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public boolean isAlive(){
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage(){
        return random.nextInt(1,11);
    }

    private int getActualDefence(){
        return random.nextInt(0,6);
    }

    protected void hit(Character enemy, int damage){
        if(getActualDefence() < damage){
            decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy){
        hit(enemy,getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff){
        hitPoint -= diff;
    }

    public abstract void secondaryAttack(Character enemy);

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }
}
