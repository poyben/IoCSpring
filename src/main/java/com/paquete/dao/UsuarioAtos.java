package com.paquete.dao;

import org.springframework.stereotype.Service;

@Service
public class UsuarioAtos implements UsuarioService{

	@Override
	public String inserta() {
		return "Insertando usuario Atos";
		
	}

}
