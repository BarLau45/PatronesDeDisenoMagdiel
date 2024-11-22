package OpenClose;

public abstract class Account {
    protected double balance;
    protected String name;
    protected String accountType;

    public Account(double balance, String name, String accountType) {
        this.balance = balance;
        this.name = name;
        this.accountType = accountType;
    }

    public abstract double getBalance();

    public double calculateInterest() {
        switch (accountType) {
            case "current":
                return balance * 0.2;
            case "saving":
                return balance * 0.3;
            case "other":
                return balance * 10;
            default:
                return 0;
        }
    }
}
