package com.paquete.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		UsuarioFactory obj = (UsuarioFactory) context.getBean("fabrica");
		obj.getInserta();
	}

}
