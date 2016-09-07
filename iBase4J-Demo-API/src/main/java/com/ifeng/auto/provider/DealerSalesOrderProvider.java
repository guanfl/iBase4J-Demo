/**
* ClassName : DealerSalesOrderProvider.java
* Create on : 2016年9月7日
* Author : guanfl
* Email : guanfl@ifeng.com
* Copyright 2016 ifeng.com All Rights Reserved
*/
package com.ifeng.auto.provider;

import com.ifeng.auto.model.DealerSalesOrder;

public interface DealerSalesOrderProvider {
    
    public void updateDealerSalesOrder(DealerSalesOrder dealerSalesOrders);

    public DealerSalesOrder queryDealerSalesOrderById(Integer userId);
    
    public void insertDealerSalesOrder(DealerSalesOrder dsealerSales);
    
    public void deleteDealerSalesOrderById(Integer userId);
}
