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
	public ArrayList PagosArrayList(ResultSet resultados) {

		ArrayList<Pago> arraylistPago = new ArrayList<Pago>();
		try {
			while (resultados.next()) {
				int idPago = resultados.getInt("idPago");
				int idManga = resultados.getInt("idManga");
				int idUsuario = resultados.getInt("idUsuario");
				Double total = resultados.getDouble("total");
				arraylistPago.add(new Pago(idPago,idManga,idUsuario,total));
				
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de pagos");

		}

		return arraylistPago;

	}
	public ArrayList MangasArrayList(ResultSet resultados) {

		ArrayList<Manga> arraylistManga = new ArrayList<Manga>();
		try {
			while (resultados.next()) {
				int idManga = resultados.getInt("idManga");
				String titulo = resultados.getString("titulo");
				String descripcion = resultados.getString("descripcion");
				Double precio = resultados.getDouble("precio");
				String genero = resultados.getString("genero");
				arraylistManga.add(new Manga(idManga, titulo, descripcion, genero, precio));
				
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de mangas");

		}

		return arraylistManga;

	}

	public Manga resultadoSetObjeto(ResultSet resultado) {
		try {
			if (resultado.next()) {
				int idManga = resultado.getInt("idManga");
				String titulo = resultado.getString("titulo");
				String descripcion = resultado.getString("descripcion");
				Double precio = resultado.getDouble("precio");
				String genero = resultado.getString("genero");
				Manga manga = new Manga(idManga, titulo, descripcion, genero, precio);
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
				String contrasenia = resultado.getString("contraseña");
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