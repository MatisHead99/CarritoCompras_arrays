package supermercado;
import java.util.ArrayList;
import java.util.List;
//Clase Carrito
class Carrito {

 // Lista donde se guardan los productos
 private List<Producto> productos = new ArrayList<>();

 // Método para agregar productos
 public void agregarProducto(Producto p) {
     productos.add(p);
 }

 // Método para calcular el total
 public double calcularTotal() {

     double total = 0;

     // Recorremos todos los productos
     for (Producto p : productos) {

         // Sumamos el precio de cada producto
         total += p.getPrecio();
     }

     return total;
 }

 // Método para mostrar productos
 public void mostrarProductos() {

     System.out.println("\n--- PRODUCTOS EN EL CARRITO ---");

     for (Producto p : productos) {
         System.out.println(
             "Producto: " + p.getNombre() +
             " | Precio: $" + p.getPrecio()
         );
     }
 }
}