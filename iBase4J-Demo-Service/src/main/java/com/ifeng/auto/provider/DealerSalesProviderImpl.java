/**
* ClassName : DealerSalesProviderImpl.java
* Create on : 2016年9月6日
* Author : guanfl
* Email : guanfl@ifeng.com
* Copyright 2016 ifeng.com All Rights Reserved
*/
package com.ifeng.auto.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifeng.auto.dao.DealerSalesMapper;
import com.ifeng.auto.model.DealerSales;

@Service
public class DealerSalesProviderImpl implements DealerSalesProvider {
    @Autowired
    private DealerSalesMapper dealerSalesMapper; 
  
    @Override   
    public void updateDealerSales(DealerSales dealerSales) {
        dealerSalesMapper.updateByPrimaryKey(dealerSales);
    }

    @Override
    public DealerSales queryDealerSalesUserId(Integer id) {
        return dealerSalesMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertDealerSales(DealerSales record) {
    }

    @Override
    public void deleteDealerSalesById(Integer userId) {
    }

}
