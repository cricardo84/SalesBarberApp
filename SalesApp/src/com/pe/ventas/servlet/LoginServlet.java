package com.pe.ventas.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pe.ventas.bean.Usuario;
import com.pe.ventas.service.UsuarioService;
import com.pe.ventas.service.impl.UsuarioServiceImpl;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Trying to login...!!!");
		
		Usuario usuario = new UsuarioServiceImpl().login(request.getParameter("usuario"), 
														 request.getParameter("password"));
		
		HttpSession session = request.getSession();
		session.setAttribute("usuario", usuario);
		
		request.getRequestDispatcher("registrarVenta.jsp").forward(request, response);
	}
	
	
	
}
