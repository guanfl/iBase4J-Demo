/**
* ClassName : DealerSalesProvider.java
* Create on : 2016年9月6日
* Author : guanfl
* Email : guanfl@ifeng.com
* Copyright 2016 ifeng.com All Rights Reserved
*/
package com.ifeng.auto.provider;

import com.ifeng.auto.model.DealerSales;

public interface DealerSalesProvider {
    public void updateDealerSales(DealerSales dealerSales);

    public DealerSales queryDealerSalesUserId(Integer userId);
    
    public void insertDealerSales(DealerSales dsealerSales);
    
    public void deleteDealerSalesById(Integer userId);

}
