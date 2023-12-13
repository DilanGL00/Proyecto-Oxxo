package com.springboot.model;

public class Cuenta {
	private Integer idcuenta;
	private String usuario;
	private String contraseña;
	private int idcliente;
	
	public Cuenta() {
		
	}
	
	public Cuenta(Integer idcuenta, String usuario, String contraseña, int idcliente) {
		super();
		this.idcuenta = idcuenta;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.idcliente = idcliente;
	}
	public Integer getIdcuenta() {
		return idcuenta;
	}
	public void setIdcuenta(Integer idcuenta) {
		this.idcuenta = idcuenta;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	@Override
	public String toString() {
		return "Cuenta [idcuenta=" + idcuenta + ", usuario=" + usuario + ", contraseña=" + contraseña + ", idcliente="
				+ idcliente + "]";
	}
	
	
	
	
}
