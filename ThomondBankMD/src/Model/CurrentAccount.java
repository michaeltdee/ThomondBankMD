package Model;

import java.time.LocalDate;

public class CurrentAccount extends Account {
    private static double AIR = 0.005;

    public CurrentAccount(int id, int custNo, double balance, LocalDate dateCreated) {
        super(id, custNo, balance, dateCreated);
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }
}
