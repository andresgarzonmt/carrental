package com.codigoFlecha.Rota.cme.kilo;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiciosReservation {

	@Autowired 
	private RepositorioReservation metodosCrud;

	public List <reservation> getAll(){
		
		return metodosCrud.getAll();
	}
	public Optional<reservation> getReservation(int idReservation){
		
		return metodosCrud.getReservation(idReservation);
	}
	public reservation save(reservation reservacionita) {
		
		if(reservacionita.getIdReservation( )==null) {
			return metodosCrud.save(reservacionita);
		}
		else {
			Optional<reservation> evt=metodosCrud.getReservation(reservacionita.getIdReservation());
			if(evt.isEmpty()) {
				return metodosCrud.save(reservacionita);
			}
			else {
				return reservacionita;
			}
		}
		 
	}
	
}

