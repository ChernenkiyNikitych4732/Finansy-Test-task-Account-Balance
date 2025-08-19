package com.chernenkiy.finansy_test_task_account_balance.service;

public interface CurrencyConverterService {
    double convertCurrency(double amount, String fromCurrency, String toCurrency);
}
