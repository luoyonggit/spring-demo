package com.study.transaction.dao;

import com.study.transaction.model.Table1;

public interface Table1Dao {

    int deleteByPrimaryKey(Long id);

    int insert(Table1 record);

    int insertSelective(Table1 record);

    Table1 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Table1 record);

    int updateByPrimaryKey(Table1 record);
}