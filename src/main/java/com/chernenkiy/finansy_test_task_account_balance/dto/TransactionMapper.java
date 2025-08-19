package com.chernenkiy.finansy_test_task_account_balance.dto;

import com.chernenkiy.finansy_test_task_account_balance.entity.TransactionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import javax.transaction.Transaction;

@Mapper
public interface TransactionMapper {
    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    TransactionDto toDto(Transaction transaction);
    TransactionEntity toEntity(TransactionDto transactionDto);
}
