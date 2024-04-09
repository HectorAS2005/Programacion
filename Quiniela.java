//Creado por Héctor Aparicio

package Programación.Practicas;

import java.util.Scanner;
import java.util.Random;

public class Quiniela {

    private final int LIMITE_QUINIELAS = 20;
    private Quiniela[] quinielasRealizadas;
    private int quinielaActivaIndex;

    private String[] partido;
    private char[] apuesta;
    private int NUMERO_PARTIDOS;

    // Constructores

    // Constructor sin parámetros
    public Quiniela() {
        NUMERO_PARTIDOS = 15;
        partido = new String[NUMERO_PARTIDOS * 2];
        for (int i = 0; i < partido.length; i++) {
            partido[i] = "";
        }
        apuesta = new char[NUMERO_PARTIDOS];
        quinielasRealizadas = new Quiniela[LIMITE_QUINIELAS];
        quinielaActivaIndex = 0;
    }

    // Constructor que acepte dos valores del mismo tipo que sus atributos array
    public Quiniela(String[] partido, char[] apuesta) {
        this.partido = partido;
        this.apuesta = apuesta;
    }

    // Getters
    public String[] getPartido() {
        return partido;
    }

    public char[] getApuesta() {
        return apuesta;
    }

    public int getNUMERO_PARTIDOS() {
        return NUMERO_PARTIDOS;
    }

    // Setters
    public void setPartido(String[] partido) {
        this.partido = partido;
    }

    public void setApuesta(char[] apuesta) {
        this.apuesta = apuesta;
    }

    public void setNUMERO_PARTIDOS(int nUMERO_PARTIDOS) {
        NUMERO_PARTIDOS = nUMERO_PARTIDOS;
    } // Fin Setters & Getters

    // Métodos
    /*
     * Método “pedirPartidos” que pide los emparejamientos uno a uno por teclado
     * para asignar valor al atributo partido. No devuelve nada.
     */
    public void pedirPartidos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Partidos");
        System.out.println("Introduce los emparejamientos");

        for (int contador = 0; contador < NUMERO_PARTIDOS; contador++) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Partido " + contador + ", Equipo " + (i + 1) + ": ");
                String equipo = sc.nextLine();
                partido[contador * 2 + i] = equipo;
            }
        }
    }

    /*
     * Método “mostrarPartidos” que muestra por pantalla los emparejamientos
     * contenidos en su atributo partido. No devuelve nada.
     */
    public void mostrarPartidos() {
        System.out.println("Emparejamientos:");
        for (int i = 0; i < partido.length; i++) {
            System.out.println("Partido " + (i / 2) + ", Equipo " + ((i % 2) + 1) + ": " + partido[i]);
        }
    }

    /*
     * Método “pedirApuestas” que muestra los emparejamientos uno a uno y pide
     * por teclado un pronóstico para cada uno que se asignará al atributo apuesta.
     * No devuelve nada.
     */
    public void pedirApuestas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Apuesta para cada partido:");

        for (int i = 0; i < NUMERO_PARTIDOS; i++) {
            System.out.println("Partido " + (i + 1) + ", Equipo 1: " + partido[i * 2]);
            System.out.println("Partido " + (i + 1) + ", Equipo 2: " + partido[i * 2 + 1]);
            System.out.print("Apuesta para el partido " + (i + 1) + ": ");
            char elegirApuesta = sc.next().charAt(0);
            if (elegirApuesta != '1' && elegirApuesta != 'X' && elegirApuesta != '2') {
                System.out.println("Lo siento, ingresa 1 (Gana Local), X (Empate) ó 2 (Gana Visitante)");
                i--; // Reintentar la apuesta para el mismo partido
            } else {
                apuesta[i] = elegirApuesta;
            }
        }
    }

    /*
     * Método “mostrarPartidosyApuestas” que muestra por pantalla uno a uno los
     * emparejamientos y la apuesta realizada en cada uno. Antecede un número
     * de orden a cada partido. No devuelve nada.
     */
    public void mostrarPartidosyApuestas() {
        System.out.println();
        for (int i = 0; i < NUMERO_PARTIDOS; i++) {
            System.out.println((i + 1) + ". " + partido[i * 2] + " vs " + partido[i * 2 + 1] + " : " + apuesta[i]);
        }
    }

    /*
     * . Método “generarApuestasAleatorias” que crea una apuesta aleatoria para
     * cada partido.
     */
    public void generarApuestasAleatorias() {
        Random rnd = new Random();
        apuesta = new char[NUMERO_PARTIDOS]; // Crear un nuevo array con la longitud correcta
        for (int i = 0; i < apuesta.length; i++) {
            int apuestaAle = (int) (rnd.nextDouble() * 3 + 1);
            switch (apuestaAle) {
                case 1:
                    apuesta[i] = '1';
                    break;
                case 2:
                    apuesta[i] = '2';
                    break;
                case 3:
                    apuesta[i] = 'X';
                    break;
            }
        }
    }

    /*
     * Método “copiarPartidos” que recibe una Quiniela como parámetro y copia
     * los partidos del parámetro. No devuelve nada
     */
    public void copiarPartidos(Quiniela otraQuiniela) {
        this.partido = otraQuiniela.getPartido();
    }

    /*
     * Método “copiarPartidos” que recibe un array de String como parámetro y
     * copia los partidos del parámetro. No devuelve nada. En caso de que el array
     * del parámetro tenga distinta longitud que el del atributo no copia nada y lo
     * indica con un mensaje.
     */
    public void copiarPartidos(String[] nuevosPartidos) {
        if (nuevosPartidos.length != partido.length) {
            System.out.println("ERROR, los números de partidos no corresponden");
        } else {
            for (int i = 0; i < partido.length; i++) {
                partido[i] = nuevosPartidos[i];
            }
        }
    }

    /*
     * Método “copiarApuestas” que recibe una Quiniela como parámetro y copia
     * las apuestas del parámetro. No devuelve nada.
     */
    public void copiarApuestas(Quiniela otraQuiniela) {
        char[] nuevasApuestas = otraQuiniela.getApuesta();
        if (nuevasApuestas.length != apuesta.length) {
            System.out.println("ERROR, los números de apuestas no corresponden");
        } else {
            for (int i = 0; i < apuesta.length; i++) {
                apuesta[i] = nuevasApuestas[i];
            }
        }
    }

    /*
     * Método “copiarApuestas” que recibe un array de caracteres como
     * parámetro y copia las apuestas del parámetro. No devuelve nada. En caso de
     * que el array del parámetro tenga distinta longitud que el del atributo no
     * copia nada y lo indica con un mensaje.
     */
    public void copiarApuestas(char[] nuevasApuestas) {
        if (nuevasApuestas.length != apuesta.length) {
            System.out.println("Copia no realizada, número de apuestas distinto");
        } else {
            for (int i = 0; i < apuesta.length; i++) {
                apuesta[i] = nuevasApuestas[i];
            }
        }
    }

    /*
     * Método “comprobarApuestas” que recibe una Quiniela como parámetro y
     * devuelve un entero que es el valor de las apuestas del parámetro
     * coincidentes con las apuestas del objeto que recibe el mensaje.
     */
    public int comprobarApuestas(Quiniela otraQuiniela) {
        int coincidencias = 0;
        for (int i = 0; i < apuesta.length; i++) {
            if (apuesta[i] == otraQuiniela.getApuesta()[i]) {
                coincidencias++;
            }
        }
        return coincidencias;
    }

    // Métodos relacionados con el menú
    // Método que muestra el Menú
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("==== Menú ====");
            System.out.println("1. Rellenar una quiniela nueva manualmente");
            System.out.println("2. Rellenar una quiniela nueva aleatoriamente");
            System.out.println("3. Seleccionar la quiniela activa");
            System.out.println("4. Comprobar los aciertos de la quiniela");
            System.out.println("5. Mostrar los partidos de la jornada");
            System.out.println("6. Mostrar los partidos y las apuestas de la quiniela activa");
            System.out.println("7. Salir de la aplicación");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    rellenarQuinielaManualmente();
                    break;
                case 2:
                    rellenarQuinielaAleatoriamente();
                    break;
                case 3:
                    seleccionarQuinielaActiva();
                    break;
                case 4:
                    comprobarAciertosQuiniela();
                    break;
                case 5:
                    mostrarPartidosJornada();
                    break;
                case 6:
                    mostrarPartidosApuestasQuinielaActiva();
                    break;
                case 7:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    /*
     * Método que pide al usuario una Quiniela
     * Y le pide las apuestas
     */
    public void rellenarQuinielaManualmente() {
        if (quinielasRealizadas[quinielasRealizadas.length - 1] != null) {
            System.out.println("¡Ya ha alcanzado el límite máximo de quinielas por jornada!");
            return;
        }

        Quiniela quinielaNueva = new Quiniela();
        quinielaNueva.pedirPartidos(); // Llamar primero a pedirPartidos()
        quinielaNueva.pedirApuestas();
        quinielasRealizadas[quinielaActivaIndex++] = quinielaNueva;
        System.out.println("Boleto rellenado.");
    }

    // Método que rellena una Quiniela Aleatoriamente
    public void rellenarQuinielaAleatoriamente() {
        if (quinielasRealizadas[quinielasRealizadas.length - 1] != null) {
            System.out.println("¡Ya ha alcanzado el límite máximo de quinielas por jornada!");
            return;
        }

        Quiniela quinielaNueva = new Quiniela();
        quinielaNueva.generarApuestasAleatorias();
        quinielasRealizadas[quinielaActivaIndex++] = quinielaNueva;
        System.out.println("Boleto rellenado.");
    }

    /*
     * Método que elige la quiniela a consultar
     * Si hay varias imprime una lista
     * Teclea el numero de la quiniela a elegir
     */
    public void seleccionarQuinielaActiva() {
        Scanner scanner = new Scanner(System.in);

        if (quinielasRealizadas[0] == null) {
            System.out.println("¡No ha rellenado ninguna quiniela todavía!");
            return;
        }

        System.out.println("Seleccione la quiniela activa:");
        for (int i = 0; i < quinielasRealizadas.length; i++) {
            if (quinielasRealizadas[i] != null) {
                System.out.println((i + 1) + ". Quiniela " + (i + 1));
            }
        }

        System.out.print("Seleccione una quiniela: ");
        int seleccion = scanner.nextInt();

        if (seleccion < 1 || seleccion > quinielasRealizadas.length || quinielasRealizadas[seleccion - 1] == null) {
            System.out.println("Opción inválida. La quiniela activa sigue siendo la quiniela oficial.");
        } else {
            quinielaActivaIndex = seleccion - 1;
            System.out.println("Quiniela " + seleccion + " seleccionada como quiniela activa.");
        }
    }

    // Método que comprueba la apuesta
    public void comprobarAciertosQuiniela() {
        if (quinielasRealizadas[0] == null) {
            System.out.println("¡No ha rellenado ninguna quiniela todavía!");
            return;
        }

        Quiniela quinielaOficial = quinielasRealizadas[0]; // La quiniela oficial es la primera
        int aciertos = quinielaOficial.comprobarApuestas(quinielasRealizadas[quinielaActivaIndex]);
        System.out.println("Aciertos en la quiniela activa: " + aciertos);
    }

    // Método que imprime los partidos dados por el usuario
    public void mostrarPartidosJornada() {
        if (quinielasRealizadas[0] == null) {
            System.out.println("¡No ha rellenado ninguna quiniela todavía!");
            return;
        }

        Quiniela quinielaOficial = quinielasRealizadas[0]; // La quiniela oficial es la primera
        quinielaOficial.mostrarPartidos();
    }

    // Método que imprime los partidos y la apuesta de la Quiniela Activa
    public void mostrarPartidosApuestasQuinielaActiva() {
        if (quinielasRealizadas[0] == null) {
            System.out.println("¡No ha rellenado ninguna quiniela todavía!");
            return;
        }

        quinielasRealizadas[quinielaActivaIndex].mostrarPartidosyApuestas();
    }

    public static void main(String[] args) {
        Quiniela quinielaApp = new Quiniela();
        quinielaApp.mostrarMenu();
    }

}