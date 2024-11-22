package AbstractClasses;

public class MainJuego {
    public static void main(String[] args) {
        Character guerrero = new Warrior("Mag", 100, 5,"Mata dragones");
        Character mago = new Warrior("Merlin", 80, 5,"Python");

        guerrero.showStatusCharacter();
        mago.showStatusCharacter();

        guerrero.attack(mago);
        mago.showStatusCharacter();

        mago.attack(guerrero);
        guerrero.showStatusCharacter();
    }
}
