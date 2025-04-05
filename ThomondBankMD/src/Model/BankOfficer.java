package Model;

import java.time.LocalDate;

public class BankOfficer extends BankStaff{
    BankOfficer(String firstName, String lastName, String address, LocalDate dob, int empNo, String jobTitle) {
        super(firstName, lastName, address, dob, empNo, jobTitle);
    }
    Customer createCustomer(String firstName, String lastName, String address, LocalDate dob, int custNo) {
        return new Customer(firstName, lastName, address, dob, custNo);
    }
    Account createAccount(Customer customer, String accountType) {
        return new Account(customer, accountType);
    }
}
