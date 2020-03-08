package com.interview.anzyaccount.entity;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @Column(name="account_number")
    private Integer accountNumber;

    @Column(name = "account_name", nullable = false)
    private String accountName;

    @Column(name = "account_type", nullable = false)
    private String accountType;

    @Column(name = "balance_date", nullable = false)
    private String balance_Date;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "balance_amount", nullable = false)
    private  double balanceAmount;

    public Account() {
    }

    public Account(Integer accountNumber, String accountName, String accountType, String balance_Date, String currency, double balanceAmount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balance_Date = balance_Date;
        this.currency = currency;
        this.balanceAmount = balanceAmount;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBalance_Date() {
        return balance_Date;
    }

    public void setBalance_Date(String balance_Date) {
        this.balance_Date = balance_Date;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Float balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance_Date='" + balance_Date + '\'' +
                ", currency='" + currency + '\'' +
                ", balanceAmount=" + balanceAmount +
                '}';
    }
}
