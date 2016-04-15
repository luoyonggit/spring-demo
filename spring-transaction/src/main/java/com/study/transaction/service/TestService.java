package com.study.transaction.service;

/**
 * Created by yong.luo on 2016/4/13.
 */
public interface TestService {

    void excuteWithoutTransaction();

    void excuteInTransaction();

    void testTransactionTemplate();

    void persist();
}
