package ficheros;

import java.io.*;

public class CrearFichero{
   public static void crearFicherito(){
	   File fichero = new File("GraciasPorLaCompra.txt");
	    if (fichero.exists()) {
	        if (fichero.isFile()) {
	            System.out.println("#### " + fichero.getName() + " #####");
	            String line;
	        try {
	          Scanner fileReader = new Scanner(fichero);
	          while (fileReader.hasNextLine()) {
	            System.out.println(line);
	          }
	        } catch (FileNotFoundException e) {
	          System.out.println(e);
	        }
	        }
	    }
   }
}