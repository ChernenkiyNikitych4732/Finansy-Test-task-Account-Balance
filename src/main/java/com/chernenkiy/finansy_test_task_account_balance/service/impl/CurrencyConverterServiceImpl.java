package com.chernenkiy.finansy_test_task_account_balance.service.impl;

import com.chernenkiy.finansy_test_task_account_balance.service.CurrencyConverterService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterServiceImpl implements CurrencyConverterService {

    @Override
    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        return amount;
    }
}
