package org.empleodigital.struts.Dia.actions;

import java.util.List;

import org.empleodigital.struts.Dia.controller.ControllerProductos;
import org.empleodigital.struts.Dia.jpa.Producto;

import com.opensymphony.xwork2.Action;

public class ProductosAction implements Action{
	private List<Producto> prod;
	private List<Producto> prodSlide;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		prodSlide=ControllerProductos.ListprodSlider();
		prod= ControllerProductos.Listprod();
		return SUCCESS;
	}

	public List<Producto> getProd() {
		return prod;
	}

	public void setProd(List<Producto> prod) {
		this.prod = prod;
	}

	public List<Producto> getProdSlide() {
		return prodSlide;
	}

	public void setProdSlide(List<Producto> prodSlide) {
		this.prodSlide = prodSlide;
	}
	

}