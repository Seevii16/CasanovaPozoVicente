package ficheros;

import java.io.*;
import java.util.Scanner;



public class CrearFichero{
   public static void crearFicherito(){
	   File fichero = new File(".\\src\\ficheros\\GraciasPorSuCompra.txt");
	   try {
           if(fichero.createNewFile()) {
               System.out.println("Fichero creado");
           } else {
               System.out.println("El fichero ya existia");
           }
       } catch(IOException e) {
           e.printStackTrace();
       }
	   try {
           Scanner sc = new Scanner(System.in);
           FileWriter writer = new FileWriter(".\\src\\ficheros\\GraciasPorSuCompra.txt");
           writer.write("Gracias por su compra :D  !\n");
           writer.flush();
           writer.write("Espero que disfrute \n");
           writer.close();
       } catch(IOException e) {
           e.printStackTrace();
       }
   }
}
	        
	    
   
