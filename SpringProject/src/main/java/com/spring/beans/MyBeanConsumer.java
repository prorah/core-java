package com.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class MyBeanConsumer {

	@Bean
	public SingletonBean getSingletonBean(){
		return new SingletonBean();
	}
	
	@Bean
	@Scope("prototype")
	public PrototypeBean getPrototypeBean(){
		return new PrototypeBean();
	}
	
	
}
