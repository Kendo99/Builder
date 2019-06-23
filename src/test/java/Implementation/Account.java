package Implementation;

import org.joda.time.DateTime;

import java.math.BigDecimal;

public final class Account {
    private final Integer id;
    private final String name;
    private final Integer AccountType;
    private final BigDecimal balance;
    private final DateTime openDate;
    //private final Boolean Status;




    public Account(Integer id, String name, Integer AccountType,
                   BigDecimal balance, DateTime openDate) {
        this.id = id;
        this.name = name;
        this.AccountType  = AccountType;
        this.balance = balance;
        this.openDate = openDate;
        //this.status = AccountStatus;
    }

    public Integer getId() {
        return id;
    }

    //other getters, toString(), equals() and hashCode() omitted for brevity

    //no setters
}