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
@Table(name="facturas")
public class Factura implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private long total;
	
	@ManyToOne
	@JoinColumn(name="clientes_id")
	private Cliente idCliente;
	
	@Column
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(name="sucursales_id")
	private Sucursal sucursales;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public boolean Estado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Sucursal getSucursales() {
		return sucursales;
	}

	public void setSucursales(Sucursal sucursales) {
		this.sucursales = sucursales;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", total=" + total + ", estado=" + estado + "]";
	}
	
	
}
