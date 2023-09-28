package org.cibertec.edu.pe.modelo;

import javax.persistence.*;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	private String IdCliente;
	private String Nombres;
	private String Descripcion;
	private Double Precio;
	private int Stock;
	
	public Producto() {
		
	}

	public Producto(String idCliente, String nombres, String descripcion, Double precio,
			int stock) {
		super();
		IdCliente = idCliente;
		Nombres = nombres;
		Descripcion = descripcion;
		Precio = precio;
		Stock = stock;
	}

	public String getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(String idCliente) {
		IdCliente = idCliente;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}


	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}
	
	
	
}
