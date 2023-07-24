package Common;

public class Mesa {
    private int numeroDeMesa;
    private int cantidadDeSillas;
    public String estado;
    private cliente vgCliente;
    private String fecha;
    private String hora;

    public Mesa() {
        numeroDeMesa = 0;
        cantidadDeSillas = 0;
    }

    public Mesa(int tableNumber, int numberOfChairs) {
        numeroDeMesa = tableNumber;
        cantidadDeSillas = numberOfChairs;
        estado = "Disponible";

    }

    public int getNumeroDeMesa() {
        return numeroDeMesa;
    }

    public void setNumeroDeMesa(int tableNumber) {
        this.numeroDeMesa = tableNumber;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidadDeSillas() {
        return cantidadDeSillas;
    }

    public void setCantidadDeSillas(int cantidadDeSillas) {
        this.cantidadDeSillas = cantidadDeSillas;
    }

    public cliente getVgCliente() {
        return vgCliente;
    }

    public void setVgCliente(cliente vgCliente) {
        this.vgCliente = vgCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
