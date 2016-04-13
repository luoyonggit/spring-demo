package com.study.core.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.study.core.service.AopDemoService;
import com.study.core.service.BeanLifecycleDemoService;

public class BeanLifecycleDemoServiceImpl implements BeanLifecycleDemoService,BeanNameAware, InitializingBean, DisposableBean, BeanFactoryAware, ApplicationContextAware {

	private ApplicationContext applicationContext;
	
	private BeanFactory beanFactory;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("BeanLifecycleDemoService setApplicationContext method invoked");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		System.out.println("BeanLifecycleDemoService setBeanFactory method invoked");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("BeanLifecycleDemoService destroy method invoked");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("BeanLifecycleDemoService afterPropertiesSet method invoked");
	}

	private void desoryMethod(){
		System.out.println("BeanLifecycleDemoService desoryMethod method invoked");
	}
	
	private void initMethod(){
		System.out.println("BeanLifecycleDemoService initMethod method invoked");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanLifecycleDemoService setBeanName method invoked");
	}

	@Override
	public void testAop() {
		AopDemoService aopDemoService = (AopDemoService) this.beanFactory.getBean("aopDemoService");
		aopDemoService.testAop();
	}
}
