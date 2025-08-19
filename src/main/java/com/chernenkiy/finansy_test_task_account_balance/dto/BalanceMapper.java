package com.chernenkiy.finansy_test_task_account_balance.dto;

import com.chernenkiy.finansy_test_task_account_balance.entity.BalanceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BalanceMapper {
    BalanceMapper INSTANCE = Mappers.getMapper(BalanceMapper.class);

    BalanceDto toDto (BalanceDto BalanceDto);
    BalanceEntity toEntity (BalanceDto BalanceDto);
}
