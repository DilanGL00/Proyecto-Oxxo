package com.springboot.model;

import java.util.Date;

public class Envio {
	private Integer idenvio;
	private String direccion_envio;
	private Date fechaentrega;
	private int idcompra;
	private int idtransportista;
	
	public Envio() {
		
	}
	
	public Envio(Integer idenvio, String direccion_envio, Date fechaentrega, int idcompra, int idtransportista) {
		super();
		this.idenvio = idenvio;
		this.direccion_envio = direccion_envio;
		this.fechaentrega = fechaentrega;
		this.idcompra = idcompra;
		this.idtransportista = idtransportista;
	}
	public Integer getIdenvio() {
		return idenvio;
	}
	public void setIdenvio(Integer idenvio) {
		this.idenvio = idenvio;
	}
	public String getDireccion_envio() {
		return direccion_envio;
	}
	public void setDireccion_envio(String direccion_envio) {
		this.direccion_envio = direccion_envio;
	}
	public Date getFechaentrega() {
		return fechaentrega;
	}
	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}
	public int getIdcompra() {
		return idcompra;
	}
	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
	}
	public int getIdtransportista() {
		return idtransportista;
	}
	public void setIdtransportista(int idtransportista) {
		this.idtransportista = idtransportista;
	}

	@Override
	public String toString() {
		return "Envio [idenvio=" + idenvio + ", direccion_envio=" + direccion_envio + ", fechaentrega=" + fechaentrega
				+ ", idcompra=" + idcompra + ", idtransportista=" + idtransportista + "]";
	}
	
	
}
