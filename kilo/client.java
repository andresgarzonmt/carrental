//1.Creación de la entidad o modelo

package com.codigoFlecha.Rota.cme.kilo;

import java.util.List;
import java.io.Serializable;
import javax.persistence.*;
@Entity 
@Table(name="cliente")
public class client implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Integer idClient;
    private String name;
    private String email;
    private String password;
    private int    age;
    
    @OneToMany(cascade= {CascadeType.PERSIST},mappedBy="clientico")
    List<message>messageList;

    @OneToMany(cascade={CascadeType.PERSIST},mappedBy="clientico")
    List<reservation> reservationList;

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
