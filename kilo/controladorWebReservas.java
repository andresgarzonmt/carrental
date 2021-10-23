package com.codigoFlecha.Rota.cme.kilo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/Reservation")
public class controladorWebReservas {
	@GetMapping("/HolaReservation")
	public String saludar() {
		return "Hola mundo Reserva";
		
	}
	@Autowired
	private ServiciosReservation servicios;
	@GetMapping("/all")
	public List <reservation> getReservation(){
		return servicios.getAll();
	}
	@GetMapping("/id")
	public Optional <reservation> getReservation(@PathVariable("id") int idReservation){
		return servicios.getReservation(idReservation);
	}
	@PostMapping("/save")

	@ResponseStatus(HttpStatus.CREATED)
	public reservation save(@RequestBody reservation reservacionita) {
	 return servicios.save(reservacionita);	
	}

}
