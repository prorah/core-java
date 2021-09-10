package com.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.beans.MyBeanConsumer;

@ComponentScan(basePackages = "com.spring.beans")
public class MySpringApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(MyBeanConsumer.class);
		applicationContext.refresh();

		/*PrototypeBean p1 = applicationContext.getBean(PrototypeBean.class);
		System.out.println(p1.hashCode());

		PrototypeBean p2 = applicationContext.getBean(PrototypeBean.class);
		System.out.println(p2.hashCode());*/

		applicationContext.close();

	}

}
