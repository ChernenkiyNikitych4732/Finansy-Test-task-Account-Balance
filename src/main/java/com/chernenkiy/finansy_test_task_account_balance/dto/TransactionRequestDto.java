package com.chernenkiy.finansy_test_task_account_balance.dto;

import java.math.BigDecimal;

public class TransactionRequestDto {
    private String fromAccountId;
    private String toAccountId;
    private BigDecimal amount;

    public TransactionRequestDto(String fromAccountId, String toAccountId, BigDecimal amount) {
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.amount = amount;
    }

    public String getFromAccountId() {
        return fromAccountId;
    }

    public void setFromAccountId(String fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

    public String getToAccountId() {
        return toAccountId;
    }

    public void setToAccountId(String toAccountId) {
        this.toAccountId = toAccountId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Object getCurrency() {
        return null;
    }
}
