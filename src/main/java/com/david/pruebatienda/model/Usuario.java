package com.david.pruebatienda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@Column
	private String correo;
	
	@Column
	private String telefono;
	
	@Column
	private String numeroIdentificacion;
	
	@Column
	private String password;
	
	@ManyToOne
	@JoinColumn(name="tipoIdentificaciones_id")
	private TipoIdentificacion idTipo;
	
	@ManyToOne
	@JoinColumn(name="roles_id")
	private Rol idRol;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TipoIdentificacion getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(TipoIdentificacion idTipo) {
		this.idTipo = idTipo;
	}

	public Rol getIdRol() {
		return idRol;
	}

	public void setIdRol(Rol idRol) {
		this.idRol = idRol;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo
				+ ", telefono=" + telefono + ", numeroIdentificacion=" + numeroIdentificacion + ", password=" + password
				+ ", idTipo=" + idTipo + ", idRol=" + idRol + "]";
	}
	
	
}
