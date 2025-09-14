// Clase aplicacion, con un método Login, a través del cual el usuario se podrá identificar.

import java.util.Properties;

public class Aplicacion {
    // Este método recibe dos cadenas, username y password, y retorna una instancia de usuario
    // Los datos para validar la autenticación estarán en un fichero de propiedades propio de la clase Aplicacion. Su nombre será Aplicacion.properties
    // El método login verificará que los valores de las cadenas concuerden con las propiedades de lfichero, y retornará una instancia de Usuario (o null si no es correcto)
    public Usuario login(String username, String password) {
        // El método login tiene un error importante de diseño ya que solo consideramos dos posibles escenario:
        // El usuario de identifica correctamente (retorna instancia de Usuario)
        // El usuario no se puede identificar porque son incorrectos el username o password (retorna null)
        // ¿Qué valor debería retornar si Aplicacion.properties no existiese, estuviera corrupto o no incluyera una o ambas propiedades?
        // Pues que login debería finalizar abruptamente arrojando una excepción
        // Aprovechando la clase PropertiesUtil, codificaremos las clase Aplicacion y el método login
        try {
            // Leemos el fichero 
            Properties properties = PropertiesUtil.getProperties(Aplicacion.class);
            // Leemos el valor de la username y password
            String usr = properties.getProperty("username");
            String psw = properties.getProperty("password");

            Usuario usuario = null;
            if (usr.equals(username) && psw.equals(password)) {
                // Instanciamos un usuario y seteo los datos
                usuario = new Usuario();
                usuario.setUsername(usr);
                usuario.setNombre(properties.getProperty("nombre"));
                usuario.setEmail(properties.getProperty("email"));
            }
            return usuario;
        } catch (Exception e) {
            // Ante cualquier error "salimos por excepción"
            String mssg = "Error verificando los datos";
            // Usamos la palabra throw para arrojar una excepción no declarativa tipo RuntimeException, instanciándola con un mensaje y la excepción original
            throw new RuntimeException(mssg, e);
        }

        // Que podría salir mal?
        // Según la siguiente línea de código
        // String usr = properties.getProperty("username"); aquí pedimos a properties la property asociada a la clave username
        // Si en Aplicacion.properties, no estuviera definidad la property username, el método getProperty retonará null y la variable user será null
        // Cuando las intentemos usar con el equals, tendremos un NullPointerException
        // Una exception es una instancia de alguna clase que extiende a Exception, que a su vez es una subclase de Throwable
    }
}
