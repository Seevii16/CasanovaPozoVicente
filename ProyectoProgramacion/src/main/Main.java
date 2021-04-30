package main;

import bbdd.Conexion;
import vista.MainMenu;

public class Main {
	
	public static void main(String[] args) {
		
		Conexion.Conectar();
		MainMenu frame = new MainMenu();
		frame.setVisible(true);
	}

}
