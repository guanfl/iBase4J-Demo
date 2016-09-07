/**
* ClassName : DealerSalesProviderTest.java
* Create on : 2016年9月7日
* Author : guanfl
* Email : guanfl@ifeng.com
* Copyright 2016 ifeng.com All Rights Reserved
*/
package com.ifeng.auto.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ifeng.auto.model.DealerSales;
import com.ifeng.auto.provider.DealerSalesProvider;

public class DealerSalesProviderTest extends BaseTest{
    @Autowired
    private DealerSalesProvider provider;
    
    @Test
    public void testSelect(){
        DealerSales  dealerSales  = provider.queryDealerSalesUserId(50);
        System.out.println(dealerSales);
    }
}
