package com.chernenkiy.finansy_test_task_account_balance.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AccountAlreadyExistException extends RuntimeException {
    public AccountAlreadyExistException(Long accountId) {
        super("Счет уже существует c ID: " + accountId);
    }
}
