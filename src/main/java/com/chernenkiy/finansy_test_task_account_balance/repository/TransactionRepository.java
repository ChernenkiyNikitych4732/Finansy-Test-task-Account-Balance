package com.chernenkiy.finansy_test_task_account_balance.repository;

import com.chernenkiy.finansy_test_task_account_balance.entity.TransactionEntity;
import com.chernenkiy.finansy_test_task_account_balance.entity.TransactionTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {

    List<TransactionEntity> findByAccountId(Long accountId);

    List<TransactionEntity> findByTransactionType(TransactionTypeEntity transactionType);

}