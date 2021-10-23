//3.Repositorio

package com.codigoFlecha.Rota.cme.kilo;

import java.util.List;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioGama {

	@Autowired
	private InterfaceGama crud;
	
	public List<gama> getAll(){
		return (List<gama>) crud.findAll();
	}
	
	public Optional  <gama> getGama(int id){
		return crud.findById(id);
	}

	public gama save(gama gamita) {
		return  crud.save(gamita);
		
	}
}
	