package com.chernenkiy.finansy_test_task_account_balance.enums;

public enum TransactionType {
    DEPOSIT("deposit", "Deposit money into account"),
    WITHDRAW("withdraw", "Withdraw money from account");

    private final String code;  // Код типа транзакции (например, "deposit")
    private final String description;  // Описание типа транзакции

    TransactionType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
