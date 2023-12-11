package arrayClass;

public class Reserva {

    private Cliente cliente;
    private String fechaInicio;
    private String fechaFin;
    private int numeroHabitacion;

    public Reserva(Cliente cliente, int numeroHabitacion, String fechaInicio, String fechaFin) {
        this.cliente = cliente;
        this.numeroHabitacion = numeroHabitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }



}
