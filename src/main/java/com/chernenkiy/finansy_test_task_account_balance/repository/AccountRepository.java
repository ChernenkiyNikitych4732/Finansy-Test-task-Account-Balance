package com.chernenkiy.finansy_test_task_account_balance.repository;

import com.chernenkiy.finansy_test_task_account_balance.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

    Optional<AccountEntity> findByUserId(Long userId);

    Optional<AccountEntity> findByUserIdAndCurrencyId(Long userId, Long currencyId);
}
