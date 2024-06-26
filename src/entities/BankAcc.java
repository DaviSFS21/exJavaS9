package entities;

public class BankAcc {
    private final int accId;
    private String accHolder;
    private double balance;

    public BankAcc(int accId, String accHolder, double balance) {
        this.accId = accId;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public String toString() {
        return "%nAccount data:%nAccount "
                + accId
                + ", Holder: "
                + accHolder
                + ", Balance: "
                + String.format("%.2f",balance);
    }
}
