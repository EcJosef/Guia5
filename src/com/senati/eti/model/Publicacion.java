package com.senati.eti.model;

public class Publicacion {
	
	private String titulo;
	private String autor;
	private int tipo;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Publicacion() {
		super();
	}

	public Publicacion(String titulo, String autor, int tipo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.tipo = tipo;
	}
	
	public String MostrarTitulo() {
		return this.titulo;
	}
	
	public String MostrarAutor() {
		return this.autor;
	}
	
	public String MostrarTipo() {
		return (this.tipo == 1 ? "Libro" : "Revista");
	}
	
}