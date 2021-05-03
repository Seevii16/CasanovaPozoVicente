package modelo;
import bbdd.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Usuario;

public class Usuarios {
	double idAleatorio = Math.floor(Math.random()*10);
	
	public ArrayList<Usuario> gets() {
		ResultSet resultados = Conexion.EjecutarSentencia("SELECT * FROM usuarios");
		ArrayList<Usuario> usuarios = new controlador.Helper().ResultSet2ArrayList(resultados);
		return usuarios;
	}
	
	public Usuario getUsuarioConNimbreYContrase�a(String nombre, String contrasenia) {
		ResultSet usuarioBD = Conexion.EjecutarSentencia("SELECT * FROM usuarios WHERE NOMBRE='"+nombre+"' AND CONTRASE�A='"+contrasenia+"'");
		Usuario usuario = new controlador.Helper().resultSet2Object(usuarioBD);
		return usuario;
	}
	
	public boolean checkUserAndPass(String nombre, String contrasenia) {
		ResultSet usuarioBD = Conexion.EjecutarSentencia("SELECT * FROM usuarios WHERE NOMBRE='"+nombre+"' AND CONTRASE�A='"+contrasenia+"'");
		
		try {
			return usuarioBD.next();
		} catch (SQLException e) {
			return false;
		}
	}
	
	public void insertarUsuario(String nombre, String contrasenia,String email) {
		Conexion.EjecutarUpdate("INSERT INTO usuarios (IDUSUARIO, NOMBRE, CONTRASE�A,EMAIL) VALUES ('"+idAleatorio+"', '"+nombre+"', '"+contrasenia+"', '"+email+"');");
	}
	
	public void actualizarUsuario(String nombre, String contrasenia) {
		Conexion.EjecutarUpdate("UPDATE usuarios SET CONTRASE�A='"+contrasenia+"' WHERE USER='"+nombre+"');");
	}
	
	public void eliminarUsuario(String nombre) {
		Conexion.EjecutarUpdate("DELETE FROM nombre WHERE USER = '"+nombre+"';");
	}
	
}