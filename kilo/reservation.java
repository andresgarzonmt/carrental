//1.Creación de la entidad o modelo

package com.codigoFlecha.Rota.cme.kilo;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

import javax.persistence.*;
@Entity 
@Table(name="reserva")
public class reservation implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idReservation;
	
    private Date startDate;
    private Date devolutionDate;
    
    @ManyToOne
    @JoinColumn(name = "idCars")
    @JsonIgnoreProperties("reservation")
    private cars carrito1;
    
    @ManyToOne
    @JoinColumn(name="idClient")
    @JsonIgnoreProperties({"reservations","message"})
    private client clientico;
    
    private String score;

	public Integer getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Integer idReservation) {
		this.idReservation = idReservation;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDevolutionDate() {
		return devolutionDate;
	}

	public void setDevolutionDate(Date devolutionDate) {
		this.devolutionDate = devolutionDate;
	}

	public cars getCarrito1() {
		return carrito1;
	}

	public void setCarrito1(cars carrito1) {
		this.carrito1 = carrito1;
	}

	public client getClientico() {
		return clientico;
	}

	public void setClientico(client clientico) {
		this.clientico = clientico;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
    
}