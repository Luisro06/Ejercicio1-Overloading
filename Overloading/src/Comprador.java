
public class Comprador {
    private String nombre;
    private String email;
    private int boletosComprados;
    private int gastoTotal;

    public Comprador(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.boletosComprados = 0;
        this.gastoTotal = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getBoletosComprados() {
        return boletosComprados;
    }

    public int getGastoTotal() {
        return gastoTotal;
    }

    public void agregarCompra(int cantidadBoletos, int precioUnitario) {
        boletosComprados += cantidadBoletos;
        gastoTotal += cantidadBoletos * precioUnitario;
    }
}



