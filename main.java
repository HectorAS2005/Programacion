import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabras = "golondrina avetoro codorniz garcilla alcotan abubilla perdiz abejaruco vencejo gavilan papamoscas petirrojo colirrojo pechiazul lavandera mosquitero milano aguila roquero estornino treparriscos halcon buitre canastera picapinos gorrion verderon verdecillo buitron bigotudo ";
        int numPalabras = 29;
        int numeroAleatorio = (int) (Math.random() * numPalabras);
        int b = 0;
        String palabra = "";
        boolean compr = true;

        // Sacar palabra aleatoria
        for (int i = 0; i < palabras.length(); i++) {
            if (palabras.charAt(i) == ' ') {
                b++;
            }
            if (compr == true) {
                if (b == numeroAleatorio) {
                    int a = palabras.indexOf(' ', i + 1);
                    palabra = palabras.substring(i, a);
                    compr = false;
                }
            }
        }

        // Inicializar palabra oculta con guiones bajos
        String palabraOculta = palabra.replaceAll("[a-zA-Z]", "_");

        int intentos = 0;
        int fallos = 5;

        while (fallos >= 0 && palabraOculta.contains("_")) {
            System.out.println();
            System.out.println("Intenta adivinar la palabra misteriosa");
            System.out.println(palabraOculta);
            System.out.println("\nIntentos hechos: " + intentos + "; Fallos restantes: " + fallos);
            System.out.print("Introduce una letra: ");
            char letra = sc.next().charAt(0);
            boolean letraAdivinada = false;

            String nuevaPalabraOculta = "";
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra && palabraOculta.charAt(i) == '_') {
                    nuevaPalabraOculta += letra;
                    letraAdivinada = true;
                } else {
                    nuevaPalabraOculta += palabraOculta.charAt(i);
                }
            }

            if (!letraAdivinada) {
                fallos--;
            }

            intentos++;
            palabraOculta = nuevaPalabraOculta;
        }

        if (fallos < 0) {
            System.out.println("\nLa palabra secreta era: " + palabra);
            System.out.println("Lo siento, has fallado tras " + intentos + " intentos");
        } else {
            System.out.println("\n¡Felicidades! Has adivinado la palabra: " + palabra);
        }
    }
}
