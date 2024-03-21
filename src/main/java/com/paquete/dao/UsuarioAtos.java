package com.paquete.dao;

import org.springframework.stereotype.Service;
import java.util.logging.Logger;

@Service
public class UsuarioAtos implements UsuarioService{

	Logger logger = Logger.getLogger(getClass().getName());
	
	@Override
	public void inserta() {
		logger.info("Insertando usuario Atos");
		
	}

}
