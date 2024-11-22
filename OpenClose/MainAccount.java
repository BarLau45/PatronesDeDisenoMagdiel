package OpenClose;

public class MainAccount {
    public static void main(String[] args) {
        Account cur = new CurrentAccount(1000, "John Doe", "Current Account");
        Account sav = new SavingAccount(1000, "Jane Doe", "Saving Account");
        Account otra = new Other(1000, "Nose", "Otra");
        System.out.println("Current Account Balance: " + cur.getBalance());
        System.out.println("Saving Account Balance: " + sav.getBalance());
        System.out.println("Other Account Balance: " + otra.getBalance());
    }
}
