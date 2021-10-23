//1.Creación de la entidad o modelo

package com.codigoFlecha.Rota.cme.kilo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.io.Serializable;
@Entity 
@Table(name="mensaje")
public class message implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idMessage;
	
    private String messageText;
    
    @ManyToOne
    @JoinColumn(name="idCars")
    @JsonIgnoreProperties({"message","client","reservation"})
    private cars carrito;
    
    @ManyToOne
    @JoinColumn(name="idClient")
    @JsonIgnoreProperties({"message","reservation",})
    private client clientico;

	public Integer getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(Integer idMessage) {
		this.idMessage = idMessage;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public cars getCarrito() {
		return carrito;
	}

	public void setCarrito(cars carrito) {
		this.carrito = carrito;
	}

	public client getClientico() {
		return clientico;
	}

	public void setClientico(client clientico) {
		this.clientico = clientico;
	}

    
}
