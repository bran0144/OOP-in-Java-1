package accountstates;

public class Closed implements AccountState{
    @Override
    public AccountState deposit() {
        return this;
    }
    @Override
    public AccountState withdraw(){
        return this;
    }

    @Override
    public AccountState freezeAccount() {
        return this;
    }

    @Override
    public AccountState holderVerified() {
        return this;
    }
    @Override
    public AccountState closeAccount() {
        return.this;
    }
}
