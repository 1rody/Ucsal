package model;

public class Account {
    private String accountOnwer;
    private Integer accountID;
    private double accountBalance;

    public Account(String accountOnwer, Integer accountID, double accountBalance ) {
        this.accountBalance = accountBalance;
        this.accountID = accountID;
        this.accountOnwer = accountOnwer;
    }

    public void  saque(double minusValue) {
        accountBalance -= minusValue;
    }
    public void deposit(double depositValue) {
        accountBalance += depositValue;
    }
    public void accountData() {
        System.out.println("Account.Account ID: " + accountID);
        System.out.println("Owner: " + accountOnwer);
        System.out.println("Balance: " + accountBalance);
    }

    public String getAccountOnwer() {
        return accountOnwer;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountOnwer(String accountOnwer) {
        this.accountOnwer = accountOnwer;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}

