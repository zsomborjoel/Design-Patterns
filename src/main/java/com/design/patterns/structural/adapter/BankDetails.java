package com.design.patterns.structural.adapter;

public class BankDetails {

    private String bankName;
    private String accountHolderName;
    private long accountNumber;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankDetails{" +
                "bankName='" + bankName + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }

}
