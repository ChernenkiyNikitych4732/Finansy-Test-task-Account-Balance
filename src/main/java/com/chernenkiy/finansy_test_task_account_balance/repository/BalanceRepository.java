package com.chernenkiy.finansy_test_task_account_balance.repository;

import com.chernenkiy.finansy_test_task_account_balance.entity.BalanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BalanceRepository extends JpaRepository<BalanceEntity, Long> {
    Optional<Object> findByAccountId(Long accountId);
}
