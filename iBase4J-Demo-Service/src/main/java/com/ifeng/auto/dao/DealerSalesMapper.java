package com.ifeng.auto.dao;

import com.ifeng.auto.model.DealerSales;
import com.ifeng.auto.model.DealerSalesWithBLOBs;

public interface DealerSalesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DealerSalesWithBLOBs record);

    int insertSelective(DealerSalesWithBLOBs record);

    DealerSalesWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DealerSalesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DealerSalesWithBLOBs record);

    int updateByPrimaryKey(DealerSales record);
}