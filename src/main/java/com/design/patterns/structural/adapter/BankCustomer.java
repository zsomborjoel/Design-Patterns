package com.design.patterns.structural.adapter;

public class BankCustomer extends BankDetails implements CreditCard {

    private BankDetails bankDetails;

    BankCustomer(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    @Override
    public void giveBankDetails(BankDetails bankDetails) {
        this.bankDetails.setBankName(bankDetails.getBankName());
        this.bankDetails.setAccountHolderName(bankDetails.getAccountHolderName());
        this.bankDetails.setAccountNumber(bankDetails.getAccountNumber());

        System.out.println("Given bank details are: " + bankDetails);
    }

    @Override
    public String getCreditCard() {
        return "CreditCard";
    }

}
