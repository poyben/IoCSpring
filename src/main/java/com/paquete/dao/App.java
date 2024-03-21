package com.paquete.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		UsuarioService usrAtos = context.getBean("atos", UsuarioService.class);
		UsuarioService usrEviden = context.getBean("eviden", UsuarioService.class);
		System.out.println(usrAtos.inserta());
		System.out.println(usrEviden.inserta());
		usrAtos.inserta();
		usrEviden.inserta();
		context.close();
	}
}
