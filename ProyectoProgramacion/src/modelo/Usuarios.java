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
	
	public Usuario getUsuarioConNimbreYContraseña(String nombre, String contrasenia) {
		ResultSet usuarioBD = Conexion.EjecutarSentencia("SELECT * FROM usuarios WHERE NOMBRE='"+nombre+"' AND CONTRASEÑA='"+contrasenia+"'");
		Usuario usuario = new controlador.Helper().resultSet2Object(usuarioBD);
		return usuario;
	}
	
	public boolean checkUserAndPass(String nombre, String contrasenia) {
		ResultSet usuarioBD = Conexion.EjecutarSentencia("SELECT * FROM usuarios WHERE NOMBRE='"+nombre+"' AND CONTRASEÑA='"+contrasenia+"'");
		
		try {
			return usuarioBD.next();
		} catch (SQLException e) {
			return false;
		}
	}
	
	public void insertarUsuario(String nombre, String contrasenia,String email) {
		Conexion.EjecutarUpdate("INSERT INTO usuarios (IDUSUARIO, NOMBRE, CONTRASEÑA,EMAIL) VALUES ('"+idAleatorio+"', '"+nombre+"', '"+contrasenia+"', '"+email+"');");
	}
	
	public void actualizarUsuario(String nombre, String contrasenia) {
		Conexion.EjecutarUpdate("UPDATE usuarios SET CONTRASEÑA='"+contrasenia+"' WHERE USER='"+nombre+"');");
	}
	
	public void eliminarUsuario(String nombre) {
		Conexion.EjecutarUpdate("DELETE FROM nombre WHERE USER = '"+nombre+"';");
	}
	
}