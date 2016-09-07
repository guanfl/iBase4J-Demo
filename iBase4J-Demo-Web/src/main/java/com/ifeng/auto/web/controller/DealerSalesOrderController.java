/**
* ClassName : DealerSalesOrderController.java
* Create on : 2016年9月7日
* Author : guanfl
* Email : guanfl@ifeng.com
* Copyright 2016 ifeng.com All Rights Reserved
*/
package com.ifeng.auto.web.controller;

import org.ibase4j.core.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ifeng.auto.provider.DealerSalesOrderProvider;

@Controller
@RequestMapping(value="/test")
public class DealerSalesOrderController extends BaseController{
    @Autowired
    private DealerSalesOrderProvider provider; //dubbo 提供
    
    //toJson
    @RequestMapping(value="/get_info",method=RequestMethod.POST)
    public Object getSaleOrderInfo(@RequestParam("id")Integer id){
        return provider.queryDealerSalesOrderById(id);
    }
}
