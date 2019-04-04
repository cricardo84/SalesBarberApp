package com.pe.ventas.bean;

public class Usuario {

	private int id;
	private String usuario;
	private String password;
	private int idEmpleado;
	
	public Usuario() {
	}
	
	public Usuario(int id, String usuario, String password, int idEmpleado) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.idEmpleado = idEmpleado;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + usuario + ", password=" + password + ", idEmpleado=" + idEmpleado
				+ "]";
	}

}
