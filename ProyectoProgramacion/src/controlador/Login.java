package controlador;

import modelo.Usuarios;

import beans.Usuario;

public class Login {
	
	public void insertarUsuario(String nombre, String contrasenia,String email) {
		new modelo.Usuarios().insertarUsuario(nombre,contrasenia,email);
	}
	
	public void actualizarUsuario(String nombre, String contrasenia) {
		new modelo.Usuarios().actualizarUsuario(nombre,contrasenia);
	}
	
	public void eliminarUsuario(String nombre) {
		new modelo.Usuarios().eliminarUsuario(nombre);
	}
	

	
}