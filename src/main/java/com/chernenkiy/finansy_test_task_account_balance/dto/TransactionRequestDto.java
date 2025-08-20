package com.chernenkiy.finansy_test_task_account_balance.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class TransactionRequestDto {
    private String fromAccountId;
    private String toAccountId;
    private BigDecimal amount;

    public TransactionRequestDto(String fromAccountId, String toAccountId, BigDecimal amount) {
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.amount = amount;
    }

    public Object getCurrency() {
        return null;
    }
}
