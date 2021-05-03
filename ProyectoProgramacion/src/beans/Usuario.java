package beans;

public class Usuario {

  int idUsuario;
  String nombre;
  String email;
  String contrasenia;

  public Usuario(int idUsuario2, String nombre2, String contrasenia, String email2) {
	// TODO Auto-generated constructor stub
}

public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getContrasenia() {
    return contrasenia;
  }

  public void setContrasenia(String contrasenia) {
    this.contrasenia = contrasenia;
  }
}
