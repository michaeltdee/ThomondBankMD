package Model;

import java.time.LocalDate;
import java.util.List;

public class Customer extends Person {
    protected int custNo;
    protected List<Account> accounts;
    Customer(String firstName, String lastName, String address, LocalDate dob, int custNo) {
        super(firstName, lastName, address, dob);
        this.dob = dob;
        this.custNo = custNo;
    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
