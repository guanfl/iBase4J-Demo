/**
* ClassName : BaseTest.java
* Create on : 2016年8月8日
* Author : guanfl
* Email : guanfl@ifeng.com
* Copyright 2016 ifeng.com All Rights Reserved
*/
package com.ifeng.auto.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring/applicationContext.xml"})
public abstract class BaseTest {
    protected Logger logger = LoggerFactory.getLogger(BaseTest.class);
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        //org.springframework.core.annotation.AnnotationUtils
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }
}
