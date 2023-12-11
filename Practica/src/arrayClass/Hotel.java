package arrayClass;

public class Hotel {
    private static final int NUM_CLIENTES_MAX = 10;
    private String nombre;
    private String direccion;

    private Cliente[] misClientes;

    public Hotel(String nombre, String direccion, Cliente[] misClientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.misClientes = misClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente[] listaDeClientes(){
        Cliente[] copia;
        copia = new Cliente[NUM_CLIENTES_MAX];
        return copia;
    }

    public boolean add(Cliente nuevoCliente){
        boolean TrueOrFalse= true;
        //Buscar el hueco y solo entonces, asignar en ese hueco el objeto cliente y devolver true, sino devolverfalse

        for (int i=0; i<NUM_CLIENTES_MAX; i++){
            if (misClientes[i]==null){
                
            }
        }
        return TrueOrFalse;
}

}