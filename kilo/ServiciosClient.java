package com.codigoFlecha.Rota.cme.kilo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiciosClient {

	@Autowired 
	private RepositorioClient metodosCrud;

	public List <client> getAll(){
		
		return metodosCrud.getAll();
	}
	public Optional<client> getClient(int idClient){
		
		return metodosCrud.getClient(idClient);
	}
	public client save(client clientico) {
		
		if(clientico.getIdClient( )==null) {
			return metodosCrud.save(clientico);
		}
		else {
			Optional<client> evt=metodosCrud.getClient(clientico.getIdClient());
			if(evt.isEmpty()) {
				return metodosCrud.save(clientico);
			}
			else {
				return clientico;
			}
		}
		 
	}
	
}

