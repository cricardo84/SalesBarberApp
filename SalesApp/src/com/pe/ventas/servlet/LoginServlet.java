package com.pe.ventas.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pe.ventas.bean.Usuario;
import com.pe.ventas.service.impl.UsuarioServiceImpl;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Trying to login...!!!");
		
		System.out.println(request.getParameter("usuario"));
		System.out.println(request.getParameter("password"));
		
		Usuario usuario = new UsuarioServiceImpl().login(request.getParameter("usuario"), 
														 request.getParameter("password"));
		if(usuario != null){
			HttpSession session = request.getSession();
			session.setAttribute("usuario", usuario);
			session.setAttribute("nombreEmpleado", usuario.getEmpleado().getNombre().concat(" ").concat(usuario.getEmpleado().getApellido()));
			
			request.getRequestDispatcher("registrarVenta.jsp").forward(request, response);
		}else{
			String error = "Usuario y/o password inválidos";
			request.setAttribute("mensajeError", error);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}
	
	
	
}
