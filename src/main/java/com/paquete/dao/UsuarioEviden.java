package com.paquete.dao;

import org.springframework.stereotype.Service;

@Service
public class UsuarioEviden implements UsuarioService{

	@Override
	public void inserta() {
		System.out.println("Insertando usuario Eviden");
		
	}

}
