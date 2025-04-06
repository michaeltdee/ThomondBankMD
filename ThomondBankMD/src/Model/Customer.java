package Model;

import java.time.LocalDate;

public class Customer extends Person{
    private int custNo;

    public Customer(String firstName, String lastName, int custNo, String address, LocalDate dob) {
        super(firstName, lastName, address, dob);
        this.custNo = custNo;
    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }
}
