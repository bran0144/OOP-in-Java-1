import java.math.BigDecimal;

public class Account {
    private boolean isVerified;
    private boolean isClosed;

    public void holderVerified() {
        this.isVerified = true;
    }
    public void deposit(BigDecimal amount) {
        if(this.isClosed)
            return;

    }
    public void withdraw(BigDecimal amount) {
        if (!this.isVerified)
            return;
    }
}
