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

    public static double getAIR() {
        return AIR;
    }

    public static void setAIR(double AIR) {
        CurrentAccount.AIR = AIR;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
