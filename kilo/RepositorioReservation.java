//3.

package com.codigoFlecha.Rota.cme.kilo;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioReservation {

	@Autowired
	private InterfaceReservation crud;
	
	
	public List<reservation>getAll(){
		return(List<reservation>)crud.findAll();
	}
	
	public Optional  <reservation> getReservation(int idReservation){
		return crud.findById(idReservation);
	}

	public reservation save(reservation reservacionita) {
		return  crud.save(reservacionita);
		
	}
}
	