package Model;

import java.time.LocalDate;

public class CurrentAccount extends Account {
    private static double AIR = 0.005;
    double overdraft;

    public CurrentAccount(int id, int custNo, double overdraft) {
        super(id, custNo);
        this.overdraft = overdraft;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }
}
