package Implementation;

import org.joda.time.DateTime;

import java.math.BigDecimal;

public class AccountBuilder {

    //account fields with default values
    Integer id = 1;
    String name = "default account name";
    Boolean status = false;
    int AccountType =0;

    //AccountType type = AccountType.CHECKING;
    BigDecimal balance = new BigDecimal(0);
    DateTime openDate = new DateTime(2013, 01, 01, 0, 0, 0);


    public AccountBuilder() {}

    public AccountBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public AccountBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AccountBuilder withType(int AccountType ) {
        this.AccountType = AccountType;
        return this;
    }

    public AccountBuilder withBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public AccountBuilder withOpenDate(DateTime openDate) {
        this.openDate = openDate;
        return this;
    }

    /*
    public AccountBuilder withStatus(Boolean status) {
        this.status = status;
        return this;
    }
*/
    public Account build() {
        return new Account(id, name, AccountType, balance, openDate);
    }


}
