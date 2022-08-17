package com.david.pruebatienda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bodegas")
public class Bodega implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String direccion;
	
	@Column
	private String ciudad;
	
	@ManyToOne
	@JoinColumn(name="tiendas_id")
	private Tienda idTienda;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Tienda getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(Tienda idTienda) {
		this.idTienda = idTienda;
	}

	@Override
	public String toString() {
		return "Bodega [id=" + id + ", direccion=" + direccion + ", ciudad=" + ciudad + ", idTienda=" + idTienda + "]";
	}
	
	
}