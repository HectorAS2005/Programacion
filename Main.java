//Creado por Héctor Aparicio

package veterinarioPaquete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Lista de animales enfermos (inicialmente con un animal de cada tipo)
		ArrayList<Animal> animalesEnfermos = new ArrayList<>();
		// Lista de animales sanos (el resto de animales)
		ArrayList<Animal> animalesSanos = new ArrayList<>();

		// Creación de objetos Perro
		Perro kiko = new Perro("Yorkshire", "Kiko", 3);
		Perro chika = new Perro("Perro de Caza", "Chika", 8);
		Perro karlota = new Perro("Bull Terrier", "Karlota", 5);

		// Creación de objetos Gato
		Gato bilbo = new Gato("Largo", "Bilbo", 5);
		Gato frodo = new Gato("Mediano", "Frodo", 9);
		Gato nely = new Gato("Corto", "Nely", 10);

		// Creación de objetos Pájaro
		Pájaro azulejo = new Pájaro("Azul", "Azulejo", 6);
		Pájaro keylor = new Pájaro("Naranja", "Keylor", 5);
		Pájaro cibeles = new Pájaro("Blanco", "Cibeles", 3);

		// Agregar un animal de cada tipo a la lista de animales enfermos
		animalesEnfermos.add(kiko);
		animalesEnfermos.add(bilbo);
		animalesEnfermos.add(azulejo);

		// Agregar el resto de los animales a la lista de animales sanos
		animalesSanos.add(chika);
		animalesSanos.add(karlota);
		animalesSanos.add(frodo);
		animalesSanos.add(nely);
		animalesSanos.add(keylor);
		animalesSanos.add(cibeles);

		// Variable para almacenar la selección del usuario
		int seleccion;
		// Contador de días
		int dia = 1;

		// Bucle para simular los días en la consulta
		while (true) {
			System.out.println("DIA:");
			System.out.println(dia);
			System.out.println("Lista de animales enfermos:");
			for (int i = 0; i < animalesEnfermos.size(); i++) {
				System.out.println((i + 1) + ". " + animalesEnfermos.get(i).getNombre());
			}
			System.out
					.println("Seleccione el animal que se ha recuperado (-1 para cambiar de lista)");
			seleccion = sc.nextInt();
			if (seleccion == 0) {
				System.out.println("Fin del programa.");
				break;
			} else if (seleccion == -1) {
				// Cambiar de lista
				ArrayList<Animal> temp = animalesEnfermos;
				animalesEnfermos = animalesSanos;
				animalesSanos = temp;
				dia++;
				continue;
			} else if (seleccion > 0 && seleccion <= animalesEnfermos.size()) {
				Animal animalRecuperado = animalesEnfermos.remove(seleccion - 1);
				animalesSanos.add(animalRecuperado);
			}

			System.out.println("Lista de animales sanos:");
			for (int i = 0; i < animalesSanos.size(); i++) {
				System.out.println((i + 1) + ". " + animalesSanos.get(i).getNombre());
			}
			System.out.println("Seleccione el animal que ha caído enfermo (-1 para cambiar de lista)");
			seleccion = sc.nextInt();
			if (seleccion == 0) {
				System.out.println("Fin del programa.");
				break;
			} else if (seleccion == -1) {
				// Cambiar de lista
				ArrayList<Animal> temp = animalesEnfermos;
				animalesEnfermos = animalesSanos;
				animalesSanos = temp;
				dia++;
				continue;
			} else if (seleccion > 0 && seleccion <= animalesSanos.size()) {
				Animal animalEnfermo = animalesSanos.remove(seleccion - 1);
				animalesEnfermos.add(animalEnfermo);
			}
		}
	}
}
