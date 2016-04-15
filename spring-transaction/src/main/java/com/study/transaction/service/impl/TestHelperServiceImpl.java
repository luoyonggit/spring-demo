package com.study.transaction.service.impl;

import com.study.transaction.service.TestAnnotationService;
import com.study.transaction.service.TestHelperService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * Created by yong.luo on 2016/4/13.
 */
@Service
public class TestHelperServiceImpl implements TestHelperService, ApplicationContextAware{

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void add() {
        this.getTestAnnotationService().add();
    }

    @Override
    public void update(Long table1Id, Long table2Id) {
        this.getTestAnnotationService().update(table1Id, table2Id);
    }

    @Override
    public void delete(Long table1Id, Long table2Id) {
        this.getTestAnnotationService().delete(table1Id, table2Id);
    }

    private TestAnnotationService getTestAnnotationService() {
        TestAnnotationService testAnnotationService = (TestAnnotationService)this.applicationContext.getBean("testAnnotationService");
        return testAnnotationService;
    }
}
