package com.paquete.dao;

import org.springframework.stereotype.Service;

@Service
public class UsuarioAtos implements UsuarioService{

	@Override
	public void inserta() {
		System.out.println("Insertando usuario Atos");
		
	}

}
