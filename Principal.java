// Creado por Héctor Aparicio
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Objetos clase Producto
        Producto pr1 = new Producto("Mascarillas (50uds)", 7.99, 0);
        Producto pr2 = new Producto("Gel hidroalcohólico 500ml", 2.50, 0);
        Producto pr3 = new Producto("Pantalla facial", 4.99, 0);
        Producto pr4 = new Producto("Termómetro sin contacto", 14.99, 0);
        Producto pr5 = new Producto("Guantes de nitrilo (100 uds)", 4.99, 0);
        Producto pr6 = new Producto("Toallitas desinfectantes (50 uds)", 1.99, 0);
        Producto pr7 = new Producto("Pulverizador de alcohol 500ml", 4.99, 0);
        Producto pr8 = new Producto("Lámpara UV estilizadora portátil", 27.99, 0);
        Producto pr9 = new Producto("Mantas desinfectantes para el calzado", 8.99, 0);
        Producto pr10 = new Producto("Ropa de protección (batas, cubrezapatos)", 12.99, 0);

        // Objetos clase Tienda
        Tienda[] tiendas = new Tienda[] {
                new Tienda("Mercadona"),
                new Tienda("Ahorramas"),
                new Tienda("Día"),
                new Tienda("Carrefour"),
                new Tienda("Aldi")
        };

        // Variables
        int opcion = 0;
        int cantidadPR1 = 0;
        int cantidadPR2 = 0;
        int cantidadPR3 = 0;
        int cantidadPR4 = 0;
        int cantidadPR5 = 0;
        int cantidadPR6 = 0;
        int cantidadPR7 = 0;
        int cantidadPR8 = 0;
        int cantidadPR9 = 0;
        int cantidadPR10 = 0;
        double precioTotalPR1 = 0.0;
        double precioTotalPR2 = 0.0;
        double precioTotalPR3 = 0.0;
        double precioTotalPR4 = 0.0;
        double precioTotalPR5 = 0.0;
        double precioTotalPR6 = 0.0;
        double precioTotalPR7 = 0.0;
        double precioTotalPR8 = 0.0;
        double precioTotalPR9 = 0.0;
        double precioTotalPR10 = 0.0;
        int indiceTienda = 0;
        double precioTotalTodosProductos = 0.0;

        // Ejercicio
        while (indiceTienda < tiendas.length) {
            System.out.println("\nTienda " + (indiceTienda + 1) + ": " + tiendas[indiceTienda].getNombre());
            do {
                System.out.print("¿Qué producto desea? (1-10) ");
                opcion = sc.nextInt();

                // Si el usuario introduce un numero del 1 al 10 elijirá un producto
                if (opcion < 1 && opcion > 10) {
                    continue;
                }

                // Si el usuario introduce -1 pasa a la siguiente tienda
                if (opcion == -1) {
                    break;
                }

                // Switch para cada producto
                switch (opcion) {
                    case 1:
                        System.out.println(pr1.getNombre());
                        System.out.println("¿Qué cantidad desea?");
                        cantidadPR1 = sc.nextInt();
                        System.out.println();
                        precioTotalPR1 = cantidadPR1 * pr1.getPrecio();
                        break;
                    case 2:
                        System.out.println(pr2.getNombre());
                        System.out.println("¿Qué cantidad desea?");
                        cantidadPR2 = sc.nextInt();
                        System.out.println();
                        precioTotalPR2 = cantidadPR2 * pr2.getPrecio();
                        break;
                    case 3:
                        System.out.println(pr3.getNombre());
                        System.out.println("¿Qué cantidad desea?");
                        cantidadPR3 = sc.nextInt();
                        System.out.println();
                        precioTotalPR3 = cantidadPR3 * pr3.getPrecio();
                        break;
                    case 4:
                        System.out.println(pr4.getNombre());
                        System.out.println("¿Qué cantidad desea?");
                        cantidadPR4 = sc.nextInt();
                        System.out.println();
                        precioTotalPR4 = cantidadPR4 * pr4.getPrecio();
                        break;
                    case 5:
                        System.out.println(pr5.getNombre());
                        System.out.println("¿Qué cantidad desea?");
                        cantidadPR5 = sc.nextInt();
                        System.out.println();
                        precioTotalPR5 = cantidadPR5 * pr5.getPrecio();
                        break;
                    case 6:
                        System.out.println(pr6.getNombre());
                        System.out.println("¿Qué cantidad desea?");
                        cantidadPR6 = sc.nextInt();
                        System.out.println();
                        precioTotalPR6 = cantidadPR6 * pr6.getPrecio();
                        break;
                    case 7:
                        System.out.println(pr7.getNombre());
                        System.out.println("¿Qué cantidad desea?");
                        cantidadPR7 = sc.nextInt();
                        System.out.println();
                        precioTotalPR7 = cantidadPR7 * pr7.getPrecio();
                        break;
                    case 8:
                        System.out.println(pr8.getNombre());
                        System.out.println("¿Qué cantidad desea?");
                        cantidadPR8 = sc.nextInt();
                        System.out.println();
                        precioTotalPR8 = cantidadPR8 * pr8.getPrecio();
                        break;
                    case 9:
                        System.out.println(pr9.getNombre());
                        System.out.println("¿Qué cantidad desea?");
                        cantidadPR9 = sc.nextInt();
                        System.out.println();
                        precioTotalPR9 = cantidadPR9 * pr9.getPrecio();
                        break;
                    case 10:
                        System.out.println(pr10.getNombre());
                        System.out.println("¿Qué cantidad desea?");
                        cantidadPR10 = sc.nextInt();
                        System.out.println();
                        precioTotalPR10 = cantidadPR10 * pr10.getPrecio();
                        break;
                    default:
                        break;
                }
            } while (opcion != 0);
            indiceTienda++; // Aumentamos para poder cambiar de tienda
        }

        sc.close(); // No usamos mas el escaner

        // Resumen Final
        System.out.println("\nRESUMEN PRODUCTOS ENCARGADOS");
        System.out.println("\n" + pr1.getNombre() + ":");
        System.out.println("Cantidad: " + cantidadPR1);
        System.out.println("Precio por productos: " + precioTotalPR1);

        System.out.println("\n" + pr2.getNombre() + ":");
        System.out.println("Cantidad: " + cantidadPR2);
        System.out.println("Precio por productos: " + precioTotalPR2);

        System.out.println("\n" + pr3.getNombre() + ":");
        System.out.println("Cantidad: " + cantidadPR3);
        System.out.println("Precio por productos: " + precioTotalPR3);

        System.out.println("\n" + pr4.getNombre() + ":");
        System.out.println("Cantidad: " + cantidadPR4);
        System.out.println("Precio por productos: " + precioTotalPR4);

        System.out.println("\n" + pr5.getNombre() + ":");
        System.out.println("Cantidad: " + cantidadPR5);
        System.out.println("Precio por productos: " + precioTotalPR5);

        System.out.println("\n" + pr6.getNombre() + ":");
        System.out.println("Cantidad: " + cantidadPR6);
        System.out.println("Precio por productos: " + precioTotalPR6);

        System.out.println("\n" + pr7.getNombre() + ":");
        System.out.println("Cantidad: " + cantidadPR7);
        System.out.println("Precio por productos: " + precioTotalPR7);

        System.out.println("\n" + pr8.getNombre() + ":");
        System.out.println("Cantidad: " + cantidadPR8);
        System.out.println("Precio por productos: " + precioTotalPR8);

        System.out.println("\n" + pr9.getNombre() + ":");
        System.out.println("Cantidad: " + cantidadPR9);
        System.out.println("Precio por productos: " + precioTotalPR9);

        System.out.println("\n" + pr10.getNombre() + ":");
        System.out.println("Cantidad: " + cantidadPR10);
        System.out.println("Precio por productos: " + precioTotalPR10);

        precioTotalTodosProductos = precioTotalPR1 + precioTotalPR2 + precioTotalPR3 + precioTotalPR4 + precioTotalPR5 + precioTotalPR6 + precioTotalPR7 + precioTotalPR8 + precioTotalPR9 + precioTotalPR10;

        System.out.println("\nIMPORTE TOTAL: " + precioTotalTodosProductos);
    } // Del main
} // De la clase