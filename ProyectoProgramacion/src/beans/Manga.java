package beans;

public class Manga {

  int idManga;
  String titulo;
  String descripcion;
  String genero;
  double precio;

  public int getIdManga() {
    return idManga;
  }

  public void setIdManga(int idManga) {
    this.idManga = idManga;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }
}
