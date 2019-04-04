package com.pe.ventas.service.impl;

import com.pe.ventas.bean.Usuario;
import com.pe.ventas.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

	@Override
	public Usuario login(String usuario, String password) {
		return new Usuario(1, "Carlos", "Barrantes", 123);
	}

}
