package com.designpattern.test.designpattern.designpattern.adapter.ex1;

public class Main {

    public static void main(String[] args) {
        var bankCustomer = new BankCustomer();
        bankCustomer.generateBankDetails();
        System.out.println(bankCustomer.getCreditCard());
    }
}
