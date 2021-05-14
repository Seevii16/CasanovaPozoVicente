package main;

import java.io.FileNotFoundException;

import bbdd.Conexion;
import ficheros.CrearFichero;
import vista.MainMenu;
import vista.Menu1;

public class Main {
	
	public static void main(String[] args) {
		
		Conexion.Conectar();
		Menu1 frame = new Menu1();
		frame.setVisible(true);
		
	}

}
