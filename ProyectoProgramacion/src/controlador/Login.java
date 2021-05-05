package controlador;

import modelo.Usuarios;
import vista.FalloInicioSesion;
import vista.LoginCompletado;
import vista.RegistroCompletado;

import javax.swing.JOptionPane;

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
	public boolean iniciarSesion(String nombre, String contrasenia) {
		// Recoger los usuarios
		Usuario usuario = new modelo.Usuarios().getNombreContrasenia(nombre, contrasenia);
		if(usuario != null) {
			LoginCompletado frame = new LoginCompletado();
			frame.setVisible(true);
			return true;
		}else { // Sino error
			FalloInicioSesion frame = new FalloInicioSesion();
			frame.setVisible(true);
			return false;
		}
	}
}

	
