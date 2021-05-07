package controlador;

import beans.*;

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
			while (resultados.next()) {
				int idUsuario = resultados.getInt("idUsuario");
				String nombre = resultados.getString("nombre");
				String contrasenia = resultados.getString("contraseña");
				String email = resultados.getString("email");
				arraylist.add(new Usuario(idUsuario, nombre, contrasenia, email));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de usuarios");
		}

		return arraylist;
	}

	public ArrayList MangasArrayList(ResultSet resultados) {

		ArrayList<Manga> arraylist = new ArrayList<Manga>();
		try {
			while (resultados.next()) {
				int idManga = resultados.getInt("idManga");
				String titulo = resultados.getString("titulo");
				String descripcion = resultados.getString("descripcion");
				Double precio = resultados.getDouble("precio");
				arraylist.add(new Manga(idManga, titulo, descripcion, precio));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de mangas");

		}

		return arraylist;

	}

	public Manga resultadoSetObjeto(ResultSet resultado) {
		try {
			if (resultado.next()) {
				int idManga = resultado.getInt("idManga");
				String titulo = resultado.getString("titulo");
				String descripcion = resultado.getString("descripcion");
				Double precio = resultado.getDouble("precio");
				Manga manga = new Manga(idManga, titulo, descripcion, precio);
				return manga;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de mangas");
		}
		return null;
	}
	

	public Usuario resultSet2Object(ResultSet resultado) {
		try {
			if (resultado.next()) {
				int idUsuario = resultado.getInt("idUsuario");
				String nombre = resultado.getString("nombre");
				String contrasenia = resultado.getString("contrase�a");
				String email = resultado.getString("email");
				Usuario usuario = new Usuario(idUsuario, nombre, contrasenia, email);
				return usuario;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de usuarios");
		}
		return null;
	}

}