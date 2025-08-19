package com.chernenkiy.finansy_test_task_account_balance.controller;

import com.chernenkiy.finansy_test_task_account_balance.dto.BalanceDto;
import com.chernenkiy.finansy_test_task_account_balance.entity.AccountEntity;
import com.chernenkiy.finansy_test_task_account_balance.entity.BalanceEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    private Map<String, Object> formatResponse(Object data) {
        return new LinkedHashMap<>();
    }

    @GetMapping()
    public ResponseEntity<Map<String, Object>> getAllAccounts() {
        AccountEntity accountEntity = new AccountEntity();
        List<Object> accounts = new ArrayList<>();
        return ResponseEntity.ok(formatResponse(accounts));
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<Map<String, Object>> getAccount(@PathVariable String accountId) {
        BalanceEntity balanceEntity = new BalanceEntity();
        Map<String, Object> account = new HashMap<>();
        account.put("accountId", accountId);
        return ResponseEntity.ok(formatResponse(account));
    }

    @GetMapping("/{accountId}/deposits")
    public ResponseEntity<Map<String, Object>> getDeposits(@PathVariable String accountId) {
        BalanceDto balanceDto = new BalanceDto();
        List<Object> deposits = new ArrayList<>();
        return ResponseEntity.ok(formatResponse(deposits));
    }

    @GetMapping("/{accountId}/wthdraws")
    public ResponseEntity<Map<String, Object>> getWithdraws(@PathVariable String accountId) {
        BalanceDto balanceDto = new BalanceDto();
        List<Object> withdraws = new ArrayList<>();
        return ResponseEntity.ok(formatResponse(withdraws));
    }

    @GetMapping("/{accountId}/transactions")
    public ResponseEntity<Map<String, Object>> getTransactions(@PathVariable String accountId) {
        BalanceDto balanceDto = new BalanceDto();
        List<Object> transactions = new ArrayList<>();
        return ResponseEntity.ok(formatResponse(transactions));
    }
}