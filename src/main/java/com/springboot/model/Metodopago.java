package com.springboot.model;

import java.util.Date;

public class Metodopago {
	private Integer idmetodopago;
	private String numerotarjeta;
	private Date fechavencimiento;
	
	public Metodopago() {
		
	}
	
	public Metodopago(Integer idmetodopago, String numerotarjeta, Date fechavencimiento) {
		super();
		this.idmetodopago = idmetodopago;
		this.numerotarjeta = numerotarjeta;
		this.fechavencimiento = fechavencimiento;
	}
	public Integer getIdmetodopago() {
		return idmetodopago;
	}
	public void setIdmetodopago(Integer idmetodopago) {
		this.idmetodopago = idmetodopago;
	}
	public String getNumerotarjeta() {
		return numerotarjeta;
	}
	public void setNumerotarjeta(String numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}
	public Date getFechavencimiento() {
		return fechavencimiento;
	}
	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}

	@Override
	public String toString() {
		return "Metodopago [idmetodopago=" + idmetodopago + ", numerotarjeta=" + numerotarjeta + ", fechavencimiento="
				+ fechavencimiento + "]";
	}
	
	
	
}
