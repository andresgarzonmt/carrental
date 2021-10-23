package com.codigoFlecha.Rota.cme.kilo;






import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/Client")
public class controladorWebClient {
@GetMapping("/HolaClient")
public String saludar() {
	return "Hola mundo Client";
	
}
@Autowired
private ServiciosClient servicios;
@GetMapping("/all")
public List <client> getClient(){
	return servicios.getAll();
}
@GetMapping("/id")
public Optional <client> getClient(@PathVariable("id") int idClient){
	return servicios.getClient(idClient);
}
@PostMapping("/save")

@ResponseStatus(HttpStatus.CREATED)
public client save(@RequestBody client clientico) {
 return servicios.save(clientico);	
}

}
