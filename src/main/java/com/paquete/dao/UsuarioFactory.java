package com.paquete.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fabrica")
public class UsuarioFactory {
	
	@Autowired
	UsuarioEviden usr;
	
	public void getInserta() {
		usr.inserta();
	}
}
