package OpenClose;

public class CurrentAccount extends Account {
    public CurrentAccount(double balance, String name, String accountType) {
        super(balance, name, accountType);
    }

    @Override
    public double getBalance() {
        return balance * 0.2;
    }
}
