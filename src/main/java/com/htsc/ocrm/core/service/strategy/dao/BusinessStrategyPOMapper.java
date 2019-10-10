package com.htsc.ocrm.core.service.strategy.dao;

import com.htsc.ocrm.core.service.strategy.entity.BusinessStrategyPO;

public interface BusinessStrategyPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(BusinessStrategyPO record);

    int insertSelective(BusinessStrategyPO record);

    BusinessStrategyPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BusinessStrategyPO record);

    int updateByPrimaryKey(BusinessStrategyPO record);
}