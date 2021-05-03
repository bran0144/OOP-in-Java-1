import java.math.BigDecimal;

public class Account {
    private boolean isVerified;
    private boolean isClosed;
    private BigDecimal balance;

    public void holderVerified() {
        this.isVerified = true;
    }

    public void closeAccount() {
        this.isClosed = true;
    }
    public void deposit(BigDecimal amount) {
        if(this.isClosed)
            return;
        this.balance = this.balance.add(amount);

    }
    public void withdraw(BigDecimal amount) {
        if (!this.isVerified)
            return;
        if (this.isClosed)
            return;
        this.balance = this.balance.subtract(amount);
    }
}
