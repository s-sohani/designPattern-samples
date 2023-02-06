package com.designpattern.test.designpattern.designpattern.adapter.ex1;

public class BankCustomer implements CreditCard{
    private Bank bank;

    public BankCustomer(Bank bank) {
        this.bank = bank;
    }

    public BankCustomer() {
        this.bank = new Bank();
    }

    @Override
    public void generateBankDetails() {
        bank.setBankName("Bank name");
        bank.setAccNumber(123);
        bank.setAccHolderName("AccHolderName");
    }

    @Override
    public String getCreditCard() {
        return "creditCard object";
    }
}
