package org.empleodigital.struts.Dia.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="productos")
public class Producto implements Serializable{

		@Id
		
		@Column(name="ID", unique=true)
		private String id;
		
		@Column(name="nombre", nullable=true)
		private String nombre;
		
		@Column(name="peso", nullable=true)
		private int peso;
		
		@Column(name="precio", nullable=true)
		private int precio;
		
		@Column(name="imagen", nullable=true)
		private String imagen;
		
		@Column(name="descripcion", nullable=true)
		private String descripcion;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		public int getPrecio() {
			return precio;
		}

		public void setPrecio(int precio) {
			this.precio = precio;
		}

		public String getImagen() {
			return imagen;
		}

		public void setImagen(String imagen) {
			this.imagen = imagen;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
}
