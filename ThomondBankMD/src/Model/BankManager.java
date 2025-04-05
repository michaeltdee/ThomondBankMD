package Model;

import java.time.LocalDate;

public class BankManager extends BankStaff{
    BankManager(String firstName, String lastName, String address, LocalDate dob, int empNo, String jobTitle) {
        super(firstName, lastName, address, dob, jobTitle);
    }
    BankOfficer createOfficer(String firstName, String lastName, String address, LocalDate dob, int empNo, String jobTitle) {
        return new BankOfficer(firstName, lastName, address, dob, empNo, jobTitle);
    }
}
