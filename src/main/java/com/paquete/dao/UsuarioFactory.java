package com.paquete.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fabrica")
public class UsuarioFactory {
	
	private final UsuarioEviden usr;
	
	
	@Autowired
	public UsuarioFactory(UsuarioEviden usr) {
		this.usr = usr;
	}

	public void getInserta() {
		usr.inserta();
	}
}
