package AbstractClasses;

public abstract class Character {
    private String name;
    private int health;
    private int level;

    public Character(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void showStatusCharacter() {
        System.out.println(this.name + "tiene " + this.health + " puntos de vida y es nivel " + this.level);
    }

    public abstract void attack(Character enemy);

    public abstract void heal();

    public abstract void useSpecialAttack(Character enemy);
}
