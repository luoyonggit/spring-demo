package com.study.transaction.service.impl;

import com.study.transaction.dao.Table1Dao;
import com.study.transaction.dao.Table2Dao;
import com.study.transaction.model.Table1;
import com.study.transaction.model.Table2;
import com.study.transaction.service.TestAnnotationService;
import com.study.transaction.service.TestService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by yong.luo on 2016/4/13.
 */
@Scope("prototype")
@Service("testAnnotationService")
public class TestAnnotationServiceImpl implements TestAnnotationService {

    @Resource
    private TestService testService;

//    @Transactional
    @Override
    public void add() {
        this.testService.persist();
    }

    @Override
    public void update(Long table1Id, Long table2Id) {

    }

    @Override
    public void delete(Long table1Id, Long table2Id) {

    }
}
