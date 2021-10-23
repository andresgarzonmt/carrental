package com.codigoFlecha.Rota.cme.kilo;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController 

@RequestMapping("/api/Car")
@CrossOrigin(origins =
"*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class controladorWebCar {
@GetMapping("/HolaMundo")
public String saludar() {
	return "Hola mundo tutoria";
	
}

@Autowired
private ServiciosCars servicios;
@GetMapping("/all")
public List <cars> getCars(){
	return servicios.getAll();
}
@GetMapping("/{id}")
public Optional <cars> getCars(@PathVariable("id") int idCars){
	return servicios.getCars(idCars);
}
@PostMapping("/save")

@ResponseStatus(HttpStatus.CREATED)
public cars save(@RequestBody cars carrito) {
 return servicios.save(carrito);	
}

}
