package com.springboot.model;

import java.util.Date;

public class Compra {
	private Integer idcompra;
	private Date fechacompra;
	private double total;
	private int idmetodopago;
	private int idcliente;
	
	public Compra() {
		
	}
	
	public Compra(Integer idcompra, Date fechacompra, double total, int idmetodopago, int idcliente) {
		super();
		this.idcompra = idcompra;
		this.fechacompra = fechacompra;
		this.total = total;
		this.idmetodopago = idmetodopago;
		this.idcliente = idcliente;
	}
	public Integer getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}
	public Date getFechacompra() {
		return fechacompra;
	}
	public void setFechacompra(Date fechacompra) {
		this.fechacompra = fechacompra;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getIdmetodopago() {
		return idmetodopago;
	}
	public void setIdmetodopago(int idmetodopago) {
		this.idmetodopago = idmetodopago;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	@Override
	public String toString() {
		return "Compra [idcompra=" + idcompra + ", fechacompra=" + fechacompra + ", total=" + total + ", idmetodopago="
				+ idmetodopago + ", idcliente=" + idcliente + "]";
	}
	
	
}
