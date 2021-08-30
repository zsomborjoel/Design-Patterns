package com.design.patterns.structural.adapter;

public class DemoAd {

    public static void main(String[] args) {
        BankDetails bankDetails = new BankDetails();
        bankDetails.setAccountNumber(1L);
        bankDetails.setBankName("BankOne");
        bankDetails.setAccountHolderName("Joel");
        CreditCard creditCard = new BankCustomer(bankDetails);

        creditCard.giveBankDetails(bankDetails);
        System.out.println(creditCard.getCreditCard());
    }

}
