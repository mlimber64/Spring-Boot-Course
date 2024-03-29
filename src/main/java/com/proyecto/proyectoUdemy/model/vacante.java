package com.proyecto.proyectoUdemy.model;

import java.util.Date;

public class vacante {
	
	private Integer id;
	private String nombre;
	private String descripcion;
	private Date fecha;
	private double salario;
	private int destacado;
	private String imagen = "no-image.png";
	private String status;
	private String detalle;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getDestacado() {
		return destacado;
	}
	public void setDestacado(int destacado) {
		this.destacado = destacado;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	@Override
	public String toString() {
		return "vacante [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", salario=" + salario + ", destacado=" + destacado + ", imagen=" + imagen + ", status=" + status
				+ ", detalle=" + detalle + ", getId()=" + getId() + ", getNombre()=" + getNombre()
				+ ", getDescripcion()=" + getDescripcion() + ", getFecha()=" + getFecha() + ", getSalario()="
				+ getSalario() + ", getDestacado()=" + getDestacado() + ", getImagen()=" + getImagen()
				+ ", getStatus()=" + getStatus() + ", getDetalle()=" + getDetalle() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
