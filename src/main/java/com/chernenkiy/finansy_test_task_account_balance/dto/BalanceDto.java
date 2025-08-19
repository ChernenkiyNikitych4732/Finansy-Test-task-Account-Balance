package com.chernenkiy.finansy_test_task_account_balance.dto;

public class BalanceDto {
    private String name;
    private Double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
