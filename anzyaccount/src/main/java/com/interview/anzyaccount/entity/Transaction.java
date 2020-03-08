package com.interview.anzyaccount.entity;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="transaction_id")
    private Integer trID;

    @Column(name="account_number")
    private Integer accountNumber;

    @Column(name = "account_name", nullable = false)
    private String accountName;

    @Column(name = "value_date", nullable = false)
    private String valueDate;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "debit_amount", nullable = true)
    private  double debitAmount;

    @Column(name = "credit_amount", nullable = true)
    private  double creditAmount;

    @Column( name = "transaction_type", nullable = false)
    private String transactionType;

    @Column( name = "transaction_narrative", nullable = true)
    private String transactionNarrative;

    public Transaction() {
    }

    public Transaction(Integer trID, Integer accountNumber, String accountName, String valueDate, String currency,
                       double debitAmount, double creditAmount, String transactionType, String transactionNarrative) {
        this.trID = trID;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.valueDate = valueDate;
        this.currency = currency;
        this.debitAmount = debitAmount;
        this.creditAmount = creditAmount;
        this.transactionType = transactionType;
        this.transactionNarrative = transactionNarrative;
    }

    public Integer getTrID() {
        return trID;
    }

    public void setTrID(Integer trID) {
        this.trID = trID;
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

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(Float debitAmount) {
        this.debitAmount = debitAmount;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Float creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionNarrative() {
        return transactionNarrative;
    }

    public void setTransactionNarrative(String transactionNarrative) {
        this.transactionNarrative = transactionNarrative;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trID=" + trID +
                ", accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", valueDate='" + valueDate + '\'' +
                ", currency='" + currency + '\'' +
                ", debitAmount=" + debitAmount +
                ", creditAmount=" + creditAmount +
                ", transactionType='" + transactionType + '\'' +
                ", transactionNarrative='" + transactionNarrative + '\'' +
                '}';
    }
}
