// Creado por Héctor Aparicio
public class Producto {

    // Atributos
    private String nombre;
    private double precio;
    private int cantidadTotal;

    // Constructor
    public Producto(String nombre, double precio, int cantidadTotal) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadTotal = cantidadTotal;
    } // Del constructor

    // Getters
    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    } // Fin Getters

    // Setters
    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }// Fin Setters
}