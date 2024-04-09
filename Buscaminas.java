
//Héctor Aparicio
import java.util.Scanner;

public class Buscaminas {
    static final char MINA = '*';
    static final char OCULTO = '-';
    static final int ANCHO = 8;
    static final int ALTO = 8;
    static final int NUM_MINAS = 10;
    static char[][] tablero = new char[ANCHO][ALTO];

    public static void main(String[] args) {
        inicializarTablero();
        colocarMinas();
        mostrarTablero();
        jugar();
    }

    public static void inicializarTablero() {
        for (int i = 0; i < ANCHO; i++) {
            for (int j = 0; j < ALTO; j++) {
                tablero[i][j] = OCULTO;
            }
        }
    }

    public static void colocarMinas() {
        int minasColocadas = 0;
        while (minasColocadas < NUM_MINAS) {
            int x = (int) (Math.random() * ANCHO);
            int y = (int) (Math.random() * ALTO);
            if (tablero[x][y] != MINA) {
                tablero[x][y] = MINA;
                minasColocadas++;
            }
        }
    }

    public static void mostrarTablero() {
        System.out.print("  ");
        for (int i = 0; i < ANCHO; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < ANCHO; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < ALTO; j++) {
                if (tablero[i][j] == MINA) {
                    System.out.print(OCULTO + " ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void jugar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese la fila y la columna (Ejemplo: fila columna): ");
            int fila = scanner.nextInt() - 1;
            int columna = scanner.nextInt() - 1;

            if (fila < 0 || fila >= ANCHO || columna < 0 || columna >= ALTO) {
                System.out.println("Coordenadas fuera del rango. Inténtalo de nuevo.");
                continue;
            }

            if (tablero[fila][columna] == MINA) {
                System.out.println("¡Has perdido! Había una mina en esa posición.");
                break;
            } else {
                int minasAdyacentes = contarMinasAdyacentes(fila, columna);
                tablero[fila][columna] = (char) (minasAdyacentes + '0');
                mostrarTablero();
            }
        }
        scanner.close();
    }

    public static int contarMinasAdyacentes(int fila, int columna) {
        int contador = 0;
        for (int i = Math.max(0, fila - 1); i <= Math.min(fila + 1, ANCHO - 1); i++) {
            for (int j = Math.max(0, columna - 1); j <= Math.min(columna + 1, ALTO - 1); j++) {
                if (tablero[i][j] == MINA) {
                    contador++;
                }
            }
        }
        return contador;
    }
}