package com.study.transaction.service.impl;

import com.study.transaction.dao.Table1Dao;
import com.study.transaction.dao.Table2Dao;
import com.study.transaction.model.Table1;
import com.study.transaction.model.Table2;
import com.study.transaction.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by yong.luo on 2016/4/13.
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private Table1Dao table1Dao;

    @Resource
    private Table2Dao table2Dao;

    @Resource
    private TransactionTemplate transactionTemplate;

    @Override
    public void excuteWithoutTransaction() {
        this.persist();
    }

    @Override
    public void excuteInTransaction() {
       this.persist();
    }

    @Override
    public void testTransactionTemplate() {
        this.transactionTemplate.execute(new TransactionCallback<Void>() {
            @Override
            public Void doInTransaction(TransactionStatus status) {
                return null;
            }
        });
    }

    @Override
    public void persist(){
        Table1 table1 = new Table1();
        table1.setColumn1("table1-column1");
        table1.setColumn2("table1-column2");
        table1.setCreateTime(new Date());
        this.table1Dao.insert(table1);

        Table2 table2 = new Table2();
        table2.setColumn3("table2-column3");
        table2.setColumn4("table2-column4");
        table2.setCreateTime(new Date());
        this.table2Dao.insert(table2);
    }
}
