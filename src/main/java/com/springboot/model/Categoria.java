package com.springboot.model;

public class Categoria {
	private Integer idcategoria;
	private String nombrecategoria;
	
	public Categoria() {
		
	}
	
	public Categoria(Integer idcategoria, String nombrecategoria) {
		super();
		this.idcategoria = idcategoria;
		this.nombrecategoria = nombrecategoria;
	}
	public Integer getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getNombrecategoria() {
		return nombrecategoria;
	}
	public void setNombrecategoria(String nombrecategoria) {
		this.nombrecategoria = nombrecategoria;
	}

	@Override
	public String toString() {
		return "Categoria [idcategoria=" + idcategoria + ", nombrecategoria=" + nombrecategoria + "]";
	}
	
	
	
	
}
