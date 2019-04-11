package com.pe.ventas.dao;

import com.pe.ventas.bean.Usuario;

public interface UsuarioDao {

	public Usuario login(String user, String password);
}
