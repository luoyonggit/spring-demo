package com.study.core.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Service;

/**
 * Created by yong.luo on 2016/1/26.
 */
@Service
public class BeanPostProcessorDemo implements PriorityOrdered, BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization" + "---------" + beanName);
        System.out.println(beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization" + "---------" + beanName);
        return bean;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
