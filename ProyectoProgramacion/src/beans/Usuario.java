package beans;

public class Usuario {

  int idUsuario;
  String nombre;
  String email;
  String contrasenia;

  public Usuario(int idUsuario, String nombre, String email, String contrasenia) {
    this.idUsuario = idUsuario;
    this.nombre = nombre;
    this.email = email;
    this.contrasenia = contrasenia;
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
  public String toString() {
	  return super.toString() + "Nombre :"+nombre+", Contraseņa :"+email+", Email: "+contrasenia;
  }
}
