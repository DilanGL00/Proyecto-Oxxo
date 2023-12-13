package com.springboot.model;

public class Compradetalle {
	private Integer idcompradetalle;
	private double subtotal;
	private int idproducto;
	private int idcompra;
	
	public Compradetalle() {
		
	}
	
	public Compradetalle(Integer idcompradetalle, double subtotal, int idproducto, int idcompra) {
		super();
		this.idcompradetalle = idcompradetalle;
		this.subtotal = subtotal;
		this.idproducto = idproducto;
		this.idcompra = idcompra;
	}
	public Integer getIdcompradetalle() {
		return idcompradetalle;
	}
	public void setIdcompradetalle(Integer idcompradetalle) {
		this.idcompradetalle = idcompradetalle;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
	}

	@Override
	public String toString() {
		return "Compradetalle [idcompradetalle=" + idcompradetalle + ", subtotal=" + subtotal + ", idproducto="
				+ idproducto + ", idcompra=" + idcompra + "]";
	}
	
	
	
	
}
