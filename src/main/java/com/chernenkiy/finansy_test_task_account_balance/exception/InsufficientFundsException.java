package com.chernenkiy.finansy_test_task_account_balance.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigDecimal;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InsufficientFundsException extends RuntimeException {

    public InsufficientFundsException(Long accountId, BigDecimal currentBalance, BigDecimal requiredAmount) {
        super(String.format("На вашем счёте %s недостаточно средств. Текущий ваш счёт: %s USD, Требуется: %s USD",
                accountId, currentBalance, requiredAmount));
    }
}
