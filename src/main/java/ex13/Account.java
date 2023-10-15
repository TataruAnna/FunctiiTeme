package ex13;

import java.util.List;

public class Account {
    private String accountNumber;
    private int balance;
    private List<Transaction> transactionList;

    public Account(String accountNumber, int balance, List<Transaction> transactionList) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionList = transactionList;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", transactionList=" + transactionList +
                '}';
    }
}
