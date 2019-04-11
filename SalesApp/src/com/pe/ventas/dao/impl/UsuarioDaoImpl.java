package com.pe.ventas.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pe.ventas.bean.Empleado;
import com.pe.ventas.bean.Usuario;
import com.pe.ventas.dao.UsuarioDao;

public class UsuarioDaoImpl implements UsuarioDao {

	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    String url = "jdbc:mysql://localhost:3306/chopchop_db";
    String username = "ch0pch0pb4rb3r";
    String password = "ch0pch0pb4rb3r";
	
    private void inicializarConexion() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        connect = DriverManager.getConnection(url, username, password);
    }
    
	@Override
	public Usuario login(String usuario, String password) {
		Usuario usuarioBean = null;
		try {
			inicializarConexion();
			String consulta = "select us.idUser, us.userName, us.lastLogin, us.idEmployee, emp.name, emp.lastName " +
				              "from user us inner join employee emp on us.idEmployee = emp.idEmployee " +
							  "where username=? and password=?";
			preparedStatement = connect.prepareStatement(consulta);
			preparedStatement.setString(1, usuario);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				usuarioBean = new Usuario();
				usuarioBean.setId(resultSet.getInt("idUser"));
				usuarioBean.setUsuario(resultSet.getString("userName"));
				usuarioBean.setLastLogin(resultSet.getTimestamp("lastLogin"));
				
				Empleado empleado = new Empleado();
				empleado.setId(resultSet.getInt("idEmployee"));
				empleado.setNombre(resultSet.getString("name"));
				empleado.setApellido(resultSet.getString("lastName"));
				
				usuarioBean.setEmpleado(empleado);
				
				//UPDATE LAST LOGIN
			}
			
			connect.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuarioBean;
	}

}
