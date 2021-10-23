package com.codigoFlecha.Rota.cme.kilo;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosGama {

	@Autowired 
	private RepositorioGama metodosCrud;

	public List <gama> getAll(){
		
		return metodosCrud.getAll();
	}
	public Optional<gama> getGama(int id){
		
		return metodosCrud.getGama(id);
	}
	public gama save(gama gamita) {
		
		if(gamita.getId( )==null) {
			return metodosCrud.save(gamita);
		}
		else {
			Optional<gama> evt=metodosCrud.getGama(gamita.getId());
			if(evt.isEmpty()) {
				return metodosCrud.save(gamita);
			}
			else {
				return gamita;
			}
		}
		 
	}
	
}

