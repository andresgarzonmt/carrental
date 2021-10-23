//3.Repositorio

package com.codigoFlecha.Rota.cme.kilo;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMessage {

	@Autowired
	private InterfaceMessage crud;
	
	public List<message> getAll(){
		return (List<message>) crud.findAll();
	}
	
	public Optional  <message> getMessage(int idMessage){
		return crud.findById(idMessage);
	}

	public message save(message mensajito) {
		return  crud.save(mensajito);
		
	}
}
	