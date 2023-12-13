package com.springboot.model;

public class Proveedor {
	private Integer idproveedor;
	private String razonsocial;
	private String ruc;
	private String ciudad;
	private String direccion;
	private String telefono;
	
	public Proveedor() {
		
	}
	
	public Proveedor(Integer idproveedor, String razonsocial, String ruc, String ciudad, String direccion,
			String telefono) {
		super();
		this.idproveedor = idproveedor;
		this.razonsocial = razonsocial;
		this.ruc = ruc;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public Integer getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(Integer idproveedor) {
		this.idproveedor = idproveedor;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Proveedor [idproveedor=" + idproveedor + ", razonsocial=" + razonsocial + ", ruc=" + ruc + ", ciudad="
				+ ciudad + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}
	
	
	
	
}
