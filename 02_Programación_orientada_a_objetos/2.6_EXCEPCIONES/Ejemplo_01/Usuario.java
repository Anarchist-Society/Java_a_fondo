// La clase usuario representa el usuario único del sistema

public class Usuario {
    private String username;
    private String password;
    private String nombre;
    private String direccion;
    private String email;

    @Override
    public String toString() {
        return username + " " + password;
    }

    public void setUsername(String username) { this.username = username; }
    public String getUsername() { return username; }

    public void setPassword(String password) { this.password = password; }
    public String getPassword() { return password; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getDireccion() { return direccion; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }
}
