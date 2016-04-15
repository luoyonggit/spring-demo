package com.study.transaction.service;

/**
 * Created by yong.luo on 2016/4/13.
 */
public interface TestHelperService {

    void add();

    void update(Long table1Id, Long table2Id);

    void delete(Long table1Id, Long table2Id);
}
