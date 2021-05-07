package beans;

public class Pago {

  int idPago;
  Manga idManga;
  Usuario idUsuario;
  String fechaPago;
  double total;
  

  public Pago(int idPago, Manga idManga, Usuario idUsuario, String fechaPago, double total) {
    this.idPago = idPago;
    this.idManga = idManga;
    this.idUsuario = idUsuario;
    this.fechaPago = fechaPago;
    this.total = total;
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

  public String getFechaPago() {
    return fechaPago;
  }

  public void setFechaPago(String fechaPago) {
    this.fechaPago = fechaPago;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }
}
