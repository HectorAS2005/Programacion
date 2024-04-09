// Creado por Héctor Aparicio

import java.util.Scanner;

public class Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baseR = 0;
        int alturaR = 0;
        int baseT = 0;
        int alturaT = 0;
        int rombo = 0;
        int opcion = 0;
        int diagonal = 0;
        boolean compr1 = true;

        System.out.println("Elige una figura para dibujar");

        System.out.println("1. Rectángulo.");
        System.out.println("2. Triángulo.");
        System.out.println("3. Rombo.");
        System.out.println("");

        do {
            opcion = sc.nextInt();
            if (opcion == 1 || opcion == 2 || opcion == 3) {
                compr1 = true;
            } else {
                compr1 = false;
            }
        } while (compr1 == false);

        compr1 = true;

        switch (opcion) {
            case 1:
                System.out.print("Escribe la anchura del rectángulo: ");
                baseR = sc.nextInt();
                System.out.print("Escribe la altura del rectángulo: ");
                alturaR = sc.nextInt();

                for (int fila = 1; fila <= alturaR; fila++) {
                    for (int columna = 1; columna <= baseR; columna++) {
                        if (fila == 1 || fila == alturaR || columna == 1 || columna == baseR) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("Rectángulo terminado.");
                break;
            case (2):
                System.out.print("Introduce la base del triángulo: ");
                baseT = sc.nextInt();

                if (baseT < 1 || baseT % 2 == 0) {
                    System.out.print("No puede ser par o menor a 1");
                    compr1 = false;
                    break;
                }

                alturaT = (baseT - 1) / 2;

                for (int ladoT = 1; ladoT <= baseT; ladoT++) {
                    for (alturaT = 1; alturaT <= baseT - ladoT; alturaT++) {
                        System.out.print(" ");
                    }
                    for (alturaT = 1; alturaT <= 2 * ladoT - 1; alturaT++) {
                        if (alturaT == 1 || alturaT == 2 * ladoT - 1 || ladoT == baseT) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("Triangulo terminado");
                break;
            case (3):
                int baseRombo = 0;
                int ladoRombo = 0;
                int alturaRombo = 0;
                int ladoNegRombo = 0;
                int alturaNegRombo = 0;
                System.out.print("Introduce la horizontal del rombo: ");
                baseRombo = sc.nextInt();

                if (baseRombo < 1 || baseRombo % 2 == 0) {
                    System.out.println("No puede ser par o menor a 1");
                } else {
                    alturaRombo = (baseRombo - 1) / 2;

                    for (ladoRombo = 1; ladoRombo <= alturaRombo + 1; ladoRombo++) {
                        for (ladoNegRombo = 1; ladoNegRombo <= alturaRombo - ladoRombo + 1; ladoNegRombo++) {
                            System.out.print(" ");
                        }
                        for (alturaNegRombo = 1; alturaNegRombo <= 2 * ladoRombo - 1; alturaNegRombo++) {
                            if (alturaNegRombo == 1 || alturaNegRombo == 2 * ladoRombo - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }

                    for (ladoRombo = alturaRombo; ladoRombo >= 1; ladoRombo--) {
                        for (ladoNegRombo = 1; ladoNegRombo <= alturaRombo - ladoRombo + 1; ladoNegRombo++) {
                            System.out.print(" ");
                        }
                        for (alturaNegRombo = 1; alturaNegRombo <= 2 * ladoRombo - 1; alturaNegRombo++) {
                            if (alturaNegRombo == 1 || alturaNegRombo == 2 * ladoRombo - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                }
                System.out.println("Rombo terminado.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}