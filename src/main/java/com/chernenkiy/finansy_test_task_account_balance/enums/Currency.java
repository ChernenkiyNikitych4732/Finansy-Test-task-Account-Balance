package com.chernenkiy.finansy_test_task_account_balance.enums;

import lombok.Getter;

@Getter
public enum Currency {
    USD("USD", "$"),
    EUR("EUR", "€"),
    BYN("BYN", "Br"),
    RUB("RUB", "₽");

    private final String code;
    private final String symbol;

    Currency(String code, String symbol) {
        this.code = code;
        this.symbol = symbol;
    }
}
