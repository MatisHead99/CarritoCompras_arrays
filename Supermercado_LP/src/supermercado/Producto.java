package supermercado;

// Clase Producto
class Producto {

    // Atributos del producto
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getter del precio
    public double getPrecio() {
        return precio;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }
}