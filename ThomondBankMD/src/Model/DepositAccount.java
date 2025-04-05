package Model;

import java.time.LocalDate;

public class DepositAccount extends Account {
    private static double AIR = 0.02;

    public DepositAccount(int id, int custNo) {
        super(id, custNo);
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
        balance-=amount;
    }

    public static double getAIR() {
        return AIR;
    }

    public static void setAIR(double AIR) {
        DepositAccount.AIR = AIR;
    }
}
