package Common;

public class cliente {
    private String Nombre;
    private String Apellido;
    private String Identificacion;
    private String Telefono;

    public cliente(){
        Nombre = "";
        Apellido = "";
        Identificacion = "";
        Telefono = "";
    }

    // metodo constructor
    public cliente(String name, String lastName, String id, String phone) {
        Nombre = name;
        Apellido = lastName;
        Identificacion = id;
        Telefono = phone;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String name) {
        Nombre = name;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String lastName) {
        Apellido = lastName;

    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String id) {
        Identificacion = id;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String phone) {
        Telefono = phone;
    }

    public String getInformacion() {
        return "Nombre: " + getNombre() + " Apellido: " + getApellido() + " Identificacion: " + getIdentificacion();
    }



}