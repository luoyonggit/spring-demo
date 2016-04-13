package com.study.core.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Service;

import com.study.core.service.BeanLifecycleDemoService;
import com.study.core.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private BeanLifecycleDemoService beanLifecycleDemoService;

	@Override
	public String testMethod() {
		this.beanLifecycleDemoService.testAop();
		return "spring ioc";
	}


}
