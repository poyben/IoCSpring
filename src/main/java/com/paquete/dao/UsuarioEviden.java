package com.paquete.dao;

import org.springframework.stereotype.Service;

@Service
public class UsuarioEviden implements UsuarioService{

	@Override
	public String inserta() {
		return "Insertando usuario Eviden";
		
	}

}
