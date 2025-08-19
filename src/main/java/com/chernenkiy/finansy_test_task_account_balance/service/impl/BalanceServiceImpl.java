package com.chernenkiy.finansy_test_task_account_balance.service.impl;

import com.chernenkiy.finansy_test_task_account_balance.dto.BalanceDto;
import com.chernenkiy.finansy_test_task_account_balance.dto.TransactionDto;
import com.chernenkiy.finansy_test_task_account_balance.dto.TransactionRequestDto;
import com.chernenkiy.finansy_test_task_account_balance.entity.BalanceEntity;
import com.chernenkiy.finansy_test_task_account_balance.service.BalanceService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BalanceServiceImpl implements BalanceService {

    private static final Map<Long, Double> accountBalances = new HashMap<>();

    @Override
    public double getBalance(Long accountId) {
        return accountBalances.getOrDefault(accountId, 0.0);
    }

    @Override
    public void deposit(Long accountId, BigDecimal amount) {

    }

    @Override
    public void withdraw(Long accountId, BigDecimal amount) {

    }

    @Override
    public List<BalanceDto> getAllBalances() {
        return List.of();
    }

    @Override
    public List<BalanceEntity> getAllAccounts() {
        return List.of();
    }

    @Override
    public List<BalanceDto> mapToDtoList(List<BalanceEntity> accounts) {
        return List.of();
    }

    @Override
    public BalanceEntity createAccount() {
        return null;
    }

    @Override
    public BalanceDto mapToDto(BalanceEntity newAccount) {
        return null;
    }

    @Override
    public BalanceEntity getAccount(Long accountId) {
        return null;
    }

    @Override
    public List<TransactionDto> getAllTransactionsForAccount(Long accountId) {
        return List.of();
    }

    @Override
    public BalanceDto deposit(Long accountId, TransactionRequestDto request) {
        return null;
    }

    @Override
    public BalanceDto withdraw(Long accountId, TransactionRequestDto request) {
        return null;
    }

    public void deposit(Long accountId, double amount) {
        accountBalances.put(accountId, getBalance(accountId) + amount);
    }

    public void withdraw(Long accountId, double amount) {
        double currentBalance = getBalance(accountId);
        if (currentBalance >= amount) {
            accountBalances.put(accountId, currentBalance - amount);
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }
}
