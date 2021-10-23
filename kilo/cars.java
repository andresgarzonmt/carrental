//1.Creación de la entidad o modelo

package com.codigoFlecha.Rota.cme.kilo;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

import javax.persistence.*;
@Entity 
@Table(name="carro")
public class cars implements Serializable  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idCars;
    
    private String brand;
    private String name;
    private Integer year;
    private String description;
   
    
    @ManyToOne
    @JoinColumn(name="idGama")
    @JsonIgnoreProperties("cars")
    private gama gamita;
    
    @OneToMany(cascade= {CascadeType.PERSIST},mappedBy="carrito")
    @JsonIgnoreProperties({"cars","client"})
    private List<message>messageList;
    
    @OneToMany(cascade= {CascadeType.PERSIST},mappedBy="carrito1")
    @JsonIgnoreProperties({"cars","client"})
    private List<reservation> reservationList;

	public Integer getIdCars() {
		return idCars;
	}

	public void setIdCars(Integer idCars) {
		this.idCars = idCars;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public gama getGamita() {
		return gamita;
	}

	public void setGamita(gama gamita) {
		this.gamita = gamita;
	}

	public List<message> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<message> messageList) {
		this.messageList = messageList;
	}

	public List<reservation> getReservationList() {
		return reservationList;
	}

	public void setReservationList(List<reservation> reservationList) {
		this.reservationList = reservationList;
	}

	
  
}
