package com.chernenkiy.finansy_test_task_account_balance.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "balance_entities")
public class BalanceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id", nullable = false)
    private AccountEntity account;

    @Column(name = "amount_change", nullable = false)
    private BigDecimal amountChange;

    @Column(name = "balance_after", nullable = false)
    private BigDecimal balanceAfter;

    @Column(name = "change_date", nullable = false)
    private LocalDateTime changeDate;

    @Column(name = "description")
    private String description;
}
