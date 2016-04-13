package com.study.core.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.study.core.service.AopDemoService;

/**
 * Created by yong.luo on 2016/1/26.
 */
@Service(value = "aopDemoService")
@Scope(value = "prototype")
public class AopDemoServiceImpl implements AopDemoService {

    @Override
    public String testAop() {
        return "testAop";
    }
}
