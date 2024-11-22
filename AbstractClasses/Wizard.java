package AbstractClasses;

public class Wizard extends Character {
    private String spell;

    public Wizard(String name, int health, int level, String spell) {
        super(name, health, level);
        this.spell = spell;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }
    @Override
    public void attack(Character enemy) {
        System.out.println("El mago " + getName() + " ataca a " + enemy.getName());
        int damage = (int)(Math.random()*30);
        int enemyHealth = enemy.getHealth();
        setHealth(enemyHealth - damage);
    }

    @Override
    public void heal() {
        int healing = (int)(Math.random()*20);
        int health = getHealth();
        System.out.println(getName() + " ha generado " + healing + " puntos de vida.");
    }

    @Override
    public void useSpecialAttack(Character enemy) {
        System.out.println("El mago " + getName() + "ataca a " + enemy.getName() + " con su habilidad especial. ");
        int damage = (int)(Math.random()*60);
        int enemyHealth = enemy.getHealth();
        enemy.setHealth(enemyHealth - damage);
    }
}

