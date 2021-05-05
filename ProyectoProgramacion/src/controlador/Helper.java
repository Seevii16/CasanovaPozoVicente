package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.Usuario;

public class Helper {
	
	public ArrayList ResultSet2ArrayList(ResultSet resultados) {
	
		// Transformar la informacion a objeto
		
		ArrayList<Usuario> arraylist = new ArrayList<Usuario>();
		try {
			while(resultados.next()) {
				int idUsuario = resultados.getInt("idUsuario");
				String nombre = resultados.getString("nombre");
				String contrasenia = resultados.getString("contraseña");
				String email = resultados.getString("email");
				arraylist.add(new Usuario(idUsuario, nombre, contrasenia,email));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de usuarios");
		}
		
		return arraylist;
	}
	
	public Usuario resultSet2Object(ResultSet resultado){
		try {
			if(resultado.next()) {
				int idUsuario = resultado.getInt("idUsuario");
				String nombre = resultado.getString("nombre");
				String contrasenia = resultado.getString("contraseña");
				String email = resultado.getString("email");
				Usuario usuario = new Usuario(idUsuario,nombre,contrasenia,email);
				return usuario;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de usuarios");
		}
		return null;
	}

}