import java.math.BigDecimal;

public interface AccountState {
    AccountState deposit(BigDecimal amount, Consumer<BigDecimal> addToBalance);
    AccountState withdraw(BigDecimal balance, BigDecimal amount, Consumer<BigDecimal> subtractFromBalance);
    AccountState freezeAccount();
    AccountState holderVerified();
    AccountState closeAccount();
}
