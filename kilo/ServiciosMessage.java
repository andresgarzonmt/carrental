package com.codigoFlecha.Rota.cme.kilo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosMessage {

	@Autowired 
	private RepositorioMessage metodosCrud;

	public List <message> getAll(){
		
		return metodosCrud.getAll();
	}
	public Optional<message> getMessage(int idMessage){
		
		return metodosCrud.getMessage(idMessage);
	}
	public message save(message mensajito) {
		
		if(mensajito.getIdMessage( )==null) {
			return metodosCrud.save(mensajito);
		}
		else {
			Optional<message> evt=metodosCrud.getMessage(mensajito.getIdMessage());
			if(evt.isEmpty()) {
				return metodosCrud.save(mensajito);
			}
			else {
				return mensajito;
			}
		}
		 
	}
	
}

