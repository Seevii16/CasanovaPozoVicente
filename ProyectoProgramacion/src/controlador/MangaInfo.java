package controlador;
import java.sql.ResultSet;
import java.sql.SQLException;

import bbdd.Conexion;
import beans.Manga;
import modelo.Mangas;

public class MangaInfo {
	
	public Manga getMangaInfo (String titulo) {
		return new modelo.Mangas().getManga(titulo);
	}
	public boolean checkMangaInfo(String titulo) {
		System.out.println("SELECT * FROM mangas WHERE NOMBRE='"+titulo+"';");
		ResultSet mangaBD = Conexion.EjecutarSentencia("SELECT * FROM mangas WHERE TITULO='"+titulo+"';");
		System.out.println(mangaBD);
		try {
			return mangaBD.next();
		} catch (SQLException e) {
			return false;
		}
	}
	

}
