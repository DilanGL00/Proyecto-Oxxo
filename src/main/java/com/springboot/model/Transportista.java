package com.springboot.model;

public class Transportista {
	private Integer idtransportista;
	private String nombre_transportista;
	private int dni_transportista;
	private String direccion_transportista;
	
	public Transportista() {
		
	}
	
	public Transportista(Integer idtransportista, String nombre_transportista, int dni_transportista,
			String direccion_transportista) {
		super();
		this.idtransportista = idtransportista;
		this.nombre_transportista = nombre_transportista;
		this.dni_transportista = dni_transportista;
		this.direccion_transportista = direccion_transportista;
	}
	public Integer getIdtransportista() {
		return idtransportista;
	}
	public void setIdtransportista(Integer idtransportista) {
		this.idtransportista = idtransportista;
	}
	public String getNombre_transportista() {
		return nombre_transportista;
	}
	public void setNombre_transportista(String nombre_transportista) {
		this.nombre_transportista = nombre_transportista;
	}
	public int getDni_transportista() {
		return dni_transportista;
	}
	public void setDni_transportista(int dni_transportista) {
		this.dni_transportista = dni_transportista;
	}
	public String getDireccion_transportista() {
		return direccion_transportista;
	}
	public void setDireccion_transportista(String direccion_transportista) {
		this.direccion_transportista = direccion_transportista;
	}

	@Override
	public String toString() {
		return "Transportista [idtransportista=" + idtransportista + ", nombre_transportista=" + nombre_transportista
				+ ", dni_transportista=" + dni_transportista + ", direccion_transportista=" + direccion_transportista
				+ "]";
	}
	
	
	
}
