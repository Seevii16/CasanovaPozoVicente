package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.Manga;

public class Mangas {
	

	/*Hago un arraylist que recoge los mangas de la BBDD */
	public ArrayList<Manga> gets(){
		ResultSet resultados = Conexion.EjecutarSentencia("SELECT * FROM mangas");
		ArrayList<Manga> mangas = new controlador.Helper().MangasArrayList(resultados);
		return mangas;
	}
	/* Recojo el manga que quiera mediante el titulo */ 
	public Manga getManga(String titulo) {
		ResultSet mangaBD = Conexion.EjecutarSentencia("SELECT * FROM mangas WHERE TITULO='"+titulo+"';");
		Manga manga = new controlador.Helper().resultadoSetObjeto(mangaBD);
		System.out.println(manga);
		return manga;
	}
	
	
}
