package com.chernenkiy.finansy_test_task_account_balance.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class TransactionDto {
    private String id;
    private String type;
    private Double amount;
    private String currency;
    private LocalDateTime timestamp;
}
