package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.Manga;

public class Mangas {
	

	
	public ArrayList<Manga> gets(){
		ResultSet resultados = Conexion.EjecutarSentencia("SELECT * FROM mangas");
		ArrayList<Manga> mangas = new controlador.Helper().MangasArrayList(resultados);
		return mangas;
	}
	public Manga getManga(String titulo) {
		ResultSet mangaBD = Conexion.EjecutarSentencia("SELECT * FROM mangas WHERE NOMBRE='"+titulo+"';");
		Manga manga = new controlador.Helper().resultadoSetObjeto(mangaBD);
		System.out.println(manga);
		return manga;
	}
	
	
}
