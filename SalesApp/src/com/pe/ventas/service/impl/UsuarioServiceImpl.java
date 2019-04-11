package com.pe.ventas.service.impl;

import com.pe.ventas.bean.Usuario;
import com.pe.ventas.dao.UsuarioDao;
import com.pe.ventas.dao.impl.UsuarioDaoImpl;
import com.pe.ventas.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioDao usuarioDao;
	
	@Override
	public Usuario login(String usuario, String password) {
		usuarioDao = new UsuarioDaoImpl();
		return usuarioDao.login(usuario, password);
	}

}
