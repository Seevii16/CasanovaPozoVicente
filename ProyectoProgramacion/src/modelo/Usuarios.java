package modelo;
import bbdd.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Manga;
import beans.Usuario;

public class Usuarios {

	
	public ArrayList<Usuario> gets() {
		ResultSet resultados = Conexion.EjecutarSentencia("SELECT * FROM usuarios");
		ArrayList<Usuario> usuarios = new controlador.Helper().ResultSet2ArrayList(resultados);
		return usuarios;
	}
	
	public Usuario getNombreContrasenia(String nombre, String contrasenia) {
		ResultSet usuarioBD = Conexion.EjecutarSentencia("SELECT * FROM usuarios WHERE NOMBRE='"+nombre+"' AND CONTRASEÑA='"+contrasenia+"' ;");
		Usuario usuario = new controlador.Helper().resultSet2Object(usuarioBD);
		System.out.println(usuario);
		return usuario;
	}
	
	public Usuario getNombre(String nombre) {
		ResultSet usuarioBD = Conexion.EjecutarSentencia("SELECT * FROM mangas WHERE NOMBRE='"+nombre+"';");
		Usuario usuario = new controlador.Helper().resultSet2Object(usuarioBD);
		System.out.println(usuario);
		return usuario;
	}
	
	public Usuario mostrarUsuario(){
		ResultSet usuarioBD = Conexion.EjecutarSentencia("SELECT * FROM usuarios;");
		Usuario usuario = new controlador.Helper().resultSet2Object(usuarioBD);
		System.out.println(usuario);
		return usuario;
	}
	
	public boolean checkNombreContrasenia(String nombre, String contrasenia) {
		System.out.println("SELECT * FROM usuarios WHERE NOMBRE='"+nombre+"' AND CONTRASEÑA='"+contrasenia+"';");
		ResultSet usuarioBD = Conexion.EjecutarSentencia("SELECT * FROM usuarios WHERE NOMBRE='"+nombre+"' AND CONTRASEÑA='"+contrasenia+"';");
		System.out.println(usuarioBD);
		try {
			return usuarioBD.next();
		} catch (SQLException e) {
			return false;
		}
	}
	
	public void insertarUsuario(String nombre, String contrasenia,String email) {
		Conexion.EjecutarUpdate("INSERT INTO usuarios (NOMBRE, CONTRASEÑA,EMAIL) VALUES ('"+nombre+"', '"+contrasenia+"', '"+email+"');");
	}
	
	public void actualizarUsuario(String nombre, String contrasenia) {
		Conexion.EjecutarUpdate("UPDATE usuarios SET CONTRASEÑA='"+contrasenia+"' WHERE USER='"+nombre+"');");
	}
	
	public void eliminarUsuario(String nombre) {
		Conexion.EjecutarUpdate("DELETE FROM nombre WHERE USER = '"+nombre+"';");
	}
	
}