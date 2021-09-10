package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class SingletonBean {

	@Autowired
	PrototypeBean proBean;
	
	public SingletonBean() {

		System.out.println("Singleton Bean instance created");
	}

}
