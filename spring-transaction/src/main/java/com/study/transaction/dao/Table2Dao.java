package com.study.transaction.dao;

import com.study.transaction.model.Table2;

public interface Table2Dao {

    int deleteByPrimaryKey(Long id);

    int insert(Table2 record);

    int insertSelective(Table2 record);


    Table2 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Table2 record);

    int updateByPrimaryKey(Table2 record);
}