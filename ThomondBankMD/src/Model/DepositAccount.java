package Model;

import java.time.LocalDate;

public class DepositAccount extends Account {
    private static double AIR = 0.02;

    public DepositAccount(int id, int custNo, double balance, LocalDate dateCreated) {
        super(id, custNo, balance, dateCreated);
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }
}
