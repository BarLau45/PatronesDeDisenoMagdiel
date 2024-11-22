package AbstractClasses;

public class Warrior extends Character {
    private String weapon;

    public Warrior(String name, int health, int level, String weapon) {
        super(name, health, level);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void upgradeWeapon() {
        System.out.println("El guerrero " + getName() + "ha mejorado su " + this.weapon);
        int level = getLevel();
        setLevel(++level);
    }

    @Override
    public void attack(Character enemy) {
        System.out.println("El guerrero " + getName() + " ataca a " + enemy.getName());
        int damage = (int)(Math.random()*20);
        int enemyHealth = enemy.getHealth();
        setHealth(enemyHealth - damage);
    }

    @Override
    public void heal() {
        int healing = (int)(Math.random()*15);
        int health = getHealth();
        System.out.println(getName() + " ha generado " + healing + " puntos de vida.");
    }

    @Override
    public void useSpecialAttack(Character enemy) {
        System.out.println("El guerrero " + getName() + "ataca a " + enemy.getName() + " con su habilidad especial. ");
        int damage = (int)(Math.random()*45);
        int enemyHealth = enemy.getHealth();
        enemy.setHealth(enemyHealth - damage);
    }
}
