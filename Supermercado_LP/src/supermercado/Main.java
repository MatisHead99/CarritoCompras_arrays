package supermercado;
import java.util.Scanner; // Permite leer datos desde consola
public class Main {

    public static void main(String[] args) {

        // Scanner permite leer información escrita por el usuario
        Scanner sc = new Scanner(System.in);

        // Creamos el carrito
        Carrito carrito = new Carrito();

        // Variable para controlar el ciclo
        String continuar;

        do {

            // Pedimos el nombre del producto
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = sc.nextLine();

            // Pedimos el precio
            System.out.print("Ingrese el precio del producto: ");
            double precio = sc.nextDouble();

            // Limpiamos el buffer del scanner
            sc.nextLine();

            // Creamos el producto con los datos ingresados
            Producto producto = new Producto(nombre, precio);

            // Agregamos el producto al carrito
            carrito.agregarProducto(producto);

            // Preguntamos si desea continuar
            System.out.print("¿Desea agregar otro producto? (si/no): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        // Mostramos los productos
        carrito.mostrarProductos();

        // Mostramos el total
        System.out.println("\nTOTAL A PAGAR: $" + carrito.calcularTotal());

        // Cerramos el scanner
        sc.close();
    }
}