
public class Localidad {
    private int capacidad;
    private int boletosVendidos;

    public Localidad(int capacidad) {
        this.capacidad = capacidad;
        this.boletosVendidos = 0;
    }

    public void agregarVenta(int cantidad) {
        if (cantidad > 0 && boletosVendidos + cantidad <= capacidad) {
            boletosVendidos += cantidad;
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getBoletosVendidos() {
        return boletosVendidos;
    }
}


