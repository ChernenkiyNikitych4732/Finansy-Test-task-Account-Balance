package com.chernenkiy.finansy_test_task_account_balance.enums;

public enum Currency {
    USD("USD", "$"),
    EUR("EUR", "€"),
    BYN("BYN", "Br"),
    RUB("RUB", "₽");

    private final String code;  // Код валюты (например, USD)
    private final String symbol;  // Символ валюты (например, $)

    Currency(String code, String symbol) {
        this.code = code;
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }
}
