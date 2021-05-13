package controlador;

import modelo.Pagos;

public class Pagar {
	
	
	public void insertarPago(String idUsuario,String idManga) {
		new modelo.Pagos().insertarPago(idUsuario,idManga);
	}

}
