//1.Creación de la entidad o modelo

package com.codigoFlecha.Rota.cme.kilo;

import java.util.List;
import java.io.Serializable;
import javax.persistence.*;
@Entity 
@Table(name="gama")
public class gama implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @OneToMany(cascade= {CascadeType.PERSIST},mappedBy="gamita")
    List<cars>carsList;

    private String name;
    private String description;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<cars> getCarsList() {
		return carsList;
	}
	public void setCarsList(List<cars> carsList) {
		this.carsList = carsList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
	
	
    
}
