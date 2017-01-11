package org.empleodigital.struts.Dia.jpa;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {

	@Id
	@Column(name="ID", unique=true)
	private int id;
	
	@Column(name="nombre", nullable=false)
	private String nombre;
	
	@Column(name="user", nullable=false)
	private String user;
	
	@Column(name="password", nullable=false)
	private String password;

	//@OneToMany(mappedBy="cliente" )
	//private List<Pedido> pedidos;
	
	//public List<Pedido> getPedidos() {
		//return pedidos;
	//}

	//public void setPedidos(List<Pedido> pedidos) {
	//	this.pedidos = pedidos;
	//}

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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
