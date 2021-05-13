package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.Pago;
import beans.Usuario;

public class Pagos {
	
	public ArrayList<Pago> gets() {
		ResultSet resultados = Conexion.EjecutarSentencia("SELECT * FROM pagos");
		ArrayList<Pago> pagos = new controlador.Helper().ResultSet2ArrayList(resultados);
		return pagos;
	}
	public void insertarPago(String idManga,String idUsuario) {
		Conexion.EjecutarUpdate("INSERT INTO pagos (IDMANGA,IDUSUARIO,TOTAL) VALUES ('"+idManga+"', '"+idUsuario+"','7.99');");
	}

}