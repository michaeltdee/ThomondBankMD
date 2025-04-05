package Model;

import java.time.LocalDate;

public abstract class Account {
    private int id;
    private int custNo;
    protected double balance;
    private LocalDate dateCreated;

    public Account(int id, int custNo) {
        this.id = id;
        this.custNo = custNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

}

