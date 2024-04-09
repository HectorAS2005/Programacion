import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] letrasMayusculas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        char[] letrasMinusculas = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] numeros = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        char[] caracteresEspeciales = { '*', '+', '-', '/', '#', '$', '%', '&', '_', '!' };

        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            Menu();
            opcion = Opcion(sc);

            switch (opcion) {
                case 1:
                    ContraseñaDebil(letrasMinusculas, numeros);
                    break;
                case 2:
                    ContraseñaFuerte(letrasMayusculas, letrasMinusculas, numeros, caracteresEspeciales);
                    break;
                case 3:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opción incorrecta. Inténtalo de nuevo.");
            }
        } while (opcion != 3);
    }

    // Función Menu
    public static void Menu() {
        System.out.println("\nMenú:");
        System.out.println("1. Generar e imprimir una contraseña débil.");
        System.out.println("2. Generar e imprimir una contraseña fuerte.");
        System.out.println("3. Salir del programa.");
    }

    // Funcion Opcion
    public static int Opcion(Scanner sc) {
        System.out.print("Seleccione una opción: ");
        return sc.nextInt();
    }

    // Funcion contraseña debil
    public static void ContraseñaDebil(char[] letrasMinusculas, char[] numeros) {
        char[] contrasena = new char[8];
        for (int i = 0; i < 8; i++) {
            if (Math.random() < 0.5) {
                int index = (int) (Math.random() * letrasMinusculas.length);
                contrasena[i] = letrasMinusculas[index];
            } else {
                int index = (int) (Math.random() * numeros.length);
                contrasena[i] = numeros[index];
            }
        }
        System.out.println("Contraseña débil generada: " + new String(contrasena));
    }

    // Funcion contraseña fuerte
    public static void ContraseñaFuerte(char[] letrasMayusculas, char[] letrasMinusculas,
            char[] numeros, char[] caracteresEspeciales) {
        char[] contrasena = new char[13];
        char caracterEspecial = caracteresEspeciales[(int) (Math.random() * caracteresEspeciales.length)];
        char letraMayuscula = letrasMayusculas[(int) (Math.random() * letrasMayusculas.length)];

        contrasena[0] = caracterEspecial;
        contrasena[1] = letraMayuscula;

        int index = 2;
        while (index < 13) {
            char character;
            int type = (int) (Math.random() * 3);
            if (type == 0) {
                character = letrasMinusculas[(int) (Math.random() * letrasMinusculas.length)];
            } else if (type == 1) {
                character = numeros[(int) (Math.random() * numeros.length)];
            } else {
                character = caracteresEspeciales[(int) (Math.random() * caracteresEspeciales.length)];
            }

            boolean exists = false;
            for (int i = 0; i < index; i++) {
                if (contrasena[i] == character) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                contrasena[index] = character;
                index++;
            }
        }

        System.out.println("Contraseña fuerte generada: " + new String(contrasena));
    }
}