package com.chernenkiy.finansy_test_task_account_balance.enums;

import lombok.Getter;

@Getter
public enum TransactionType {
    DEPOSIT("deposit", "Deposit money into account"),
    WITHDRAW("withdraw", "Withdraw money from account"),
    TRANSFER("transfer", "Transfer money to account");

    private final String code;
    private final String description;

    TransactionType(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
