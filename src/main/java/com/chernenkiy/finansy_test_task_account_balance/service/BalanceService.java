package com.chernenkiy.finansy_test_task_account_balance.service;

import com.chernenkiy.finansy_test_task_account_balance.dto.BalanceDto;
import com.chernenkiy.finansy_test_task_account_balance.dto.TransactionDto;
import com.chernenkiy.finansy_test_task_account_balance.dto.TransactionRequestDto;
import com.chernenkiy.finansy_test_task_account_balance.entity.BalanceEntity;

import java.math.BigDecimal;
import java.util.List;

public interface BalanceService {
    double getBalance(Long accountId);
    void deposit(Long accountId, BigDecimal amount);
    void withdraw(Long accountId, BigDecimal amount);

    List<BalanceDto> getAllBalances();

    List<BalanceEntity> getAllAccounts();

    List<BalanceDto> mapToDtoList(List<BalanceEntity> accounts);

    BalanceEntity createAccount();

    BalanceDto mapToDto(BalanceEntity newAccount);

    BalanceEntity getAccount(Long accountId);

    List<TransactionDto> getAllTransactionsForAccount(Long accountId);

    BalanceDto deposit(Long accountId, TransactionRequestDto request);

    BalanceDto withdraw(Long accountId, TransactionRequestDto request);
}
