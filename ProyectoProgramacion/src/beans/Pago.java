package beans;

public class Pago {

  int idPago;
  Manga idManga;
  Usuario idUsuario;
  double total;
  

  public Pago(int idPago, Manga idManga, Usuario idUsuario, Double total) {
    this.idPago = idPago;
    this.idManga = idManga;
    this.idUsuario = idUsuario;
    this.total = total;
  }

  public Pago(int idPago2, int idManga2, int idUsuario2, Double total2) {
	// TODO Auto-generated constructor stub
}

public int getIdPago() {
    return idPago;
  }

  public void setIdPago(int idPago) {
    this.idPago = idPago;
  }

  public Manga getIdManga() {
    return idManga;
  }

  public void setIdManga(Manga idManga) {
    this.idManga = idManga;
  }

  public Usuario getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Usuario idUsuario) {
    this.idUsuario = idUsuario;
  }



  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }
}
