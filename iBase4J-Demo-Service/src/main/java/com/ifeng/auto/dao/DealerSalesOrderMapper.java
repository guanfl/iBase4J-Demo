package com.ifeng.auto.dao;

import com.ifeng.auto.model.DealerSalesOrder;

public interface DealerSalesOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DealerSalesOrder record);

    int insertSelective(DealerSalesOrder record);

    DealerSalesOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DealerSalesOrder record);

    int updateByPrimaryKey(DealerSalesOrder record);
}