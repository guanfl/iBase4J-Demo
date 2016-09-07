/**
* ClassName : DealerSalesOrderProviderImpl.java
* Create on : 2016年9月7日
* Author : guanfl
* Email : guanfl@ifeng.com
* Copyright 2016 ifeng.com All Rights Reserved
*/
package com.ifeng.auto.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifeng.auto.dao.DealerSalesOrderMapper;
import com.ifeng.auto.model.DealerSalesOrder;

@Service
public class DealerSalesOrderProviderImpl implements DealerSalesOrderProvider {
    @Autowired
    private DealerSalesOrderMapper dealerSalesOrderMapper;

    @Override
    public void updateDealerSalesOrder(DealerSalesOrder dealerSalesOrders) {
        dealerSalesOrderMapper.updateByPrimaryKey(dealerSalesOrders);
    }

    @Override
    public DealerSalesOrder queryDealerSalesOrderById(Integer userId) {
        return dealerSalesOrderMapper.selectByPrimaryKey(userId);
    }

    @Override
    public void insertDealerSalesOrder(DealerSalesOrder dsealerSales) {
        dealerSalesOrderMapper.insert(dsealerSales);
    }

    @Override
    public void deleteDealerSalesOrderById(Integer userId) {
        dealerSalesOrderMapper.deleteByPrimaryKey(userId);
    }

}
