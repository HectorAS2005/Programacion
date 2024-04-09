//Creado por Héctor Aparicio
package paqueteAlquilar;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ArrayLists
		ArrayList<Vehiculo> cocheSinAlquilar = new ArrayList<>();
		ArrayList<Vehiculo> furgonetaSinAlquilar = new ArrayList<>();
		ArrayList<Vehiculo> motoSinAlquilar = new ArrayList<>();

		ArrayList<Vehiculo> cocheAlquilados1 = new ArrayList<>();
		ArrayList<Vehiculo> cocheAlquilados2 = new ArrayList<>();
		ArrayList<Vehiculo> cocheAlquilados3 = new ArrayList<>();
		ArrayList<Vehiculo> cocheAlquilados4 = new ArrayList<>();
		ArrayList<Vehiculo> cocheAlquilados5 = new ArrayList<>();
		ArrayList<Vehiculo> cocheAlquilados6 = new ArrayList<>();

		ArrayList<Vehiculo> furgonetaAlquilados1 = new ArrayList<>();
		ArrayList<Vehiculo> furgonetaAlquilados2 = new ArrayList<>();
		ArrayList<Vehiculo> furgonetaAlquilados3 = new ArrayList<>();
		ArrayList<Vehiculo> furgonetaAlquilados4 = new ArrayList<>();
		ArrayList<Vehiculo> furgonetaAlquilados5 = new ArrayList<>();
		ArrayList<Vehiculo> furgonetaAlquilados6 = new ArrayList<>();

		ArrayList<Vehiculo> motoAlquilados1 = new ArrayList<>();
		ArrayList<Vehiculo> motoAlquilados2 = new ArrayList<>();
		ArrayList<Vehiculo> motoAlquilados3 = new ArrayList<>();
		ArrayList<Vehiculo> motoAlquilados4 = new ArrayList<>();
		ArrayList<Vehiculo> motoAlquilados5 = new ArrayList<>();
		ArrayList<Vehiculo> motoAlquilados6 = new ArrayList<>();

		// Objetos
		Coche coche1 = new Coche("9385LMN", "M3", "BMW", 330, 2);
		Coche coche2 = new Coche("7234FBC", "A4", "Audi", 250, 4);
		Coche coche3 = new Coche("2678LYZ", "Civic", "Honda", 200, 4);
		Coche coche4 = new Coche("3876HRS", "Mustang", "Ford", 450, 2);
		Coche coche5 = new Coche("6567DEF", "Carrera", "Porsche", 350, 2);
		Coche coche6 = new Coche("5210MVW", "Corolla", "Toyota", 180, 4);
		Coche coche7 = new Coche("1987DQR", "Golf", "Volkswagen", 150, 2);

		Furgoneta furgoneta1 = new Furgoneta("6586MNJ", "Transit", "Ford", 500, 700);
		Furgoneta furgoneta2 = new Furgoneta("5234ABC", "Sprinter", "Mercedes", 450, 1000);
		Furgoneta furgoneta3 = new Furgoneta("7678XYZ", "Partner", "Peugeot", 500, 600);

		Moto moto1 = new Moto("1648KML", "Ninja", "Kawasaki", 200, true);
		Moto moto2 = new Moto("4531JBC", "Panigale", "Ducati", 220, false);

		Empresa empresa1 = new Empresa("IKEA", "A12345678");
		Empresa empresa2 = new Empresa("Amazon Logistics", "B87654321");
		Empresa empresa3 = new Empresa("DHL Express", "C19283746");
		Empresa empresa4 = new Empresa("UPS", "D98765432");
		Empresa empresa5 = new Empresa("FedEx", "E56473829");
		Empresa empresa6 = new Empresa("Correos", "F38475692");

		Vehiculo vehiculo = new Vehiculo();

		// Añadir vehiculos a vehiculoSinAlquilar
		cocheSinAlquilar.add(coche1);
		cocheSinAlquilar.add(coche2);
		cocheSinAlquilar.add(coche3);
		cocheSinAlquilar.add(coche4);
		cocheSinAlquilar.add(coche5);
		cocheSinAlquilar.add(coche6);
		cocheSinAlquilar.add(coche7);

		furgonetaSinAlquilar.add(furgoneta1);
		furgonetaSinAlquilar.add(furgoneta2);
		furgonetaSinAlquilar.add(furgoneta3);

		motoSinAlquilar.add(moto1);
		motoSinAlquilar.add(moto2);

		// Declaración de variables
		int dia = 1;
		int opcionEmpresa = 0;
		int opcionVehiculo = 0;
		int opcionDias1 = 0;
		int opcionDias2 = 0;
		int opcionDias3 = 0;
		int opcionDias4 = 0;
		int opcionDias5 = 0;
		int opcionDias6 = 0;
		boolean seleccionValida = true;

		while (true) {
			System.out.println("Día: " + dia + "\n");
			System.out.print("¿Qué empresa desea alquilar un vehiculo? ");
			opcionEmpresa = sc.nextInt();
			switch (opcionEmpresa) {
				case 1:
					seleccionValida = false;
					while (!seleccionValida) {
						System.out.println("\n" + empresa1.getNombre());
						System.out.println("¿Qué vehículo desea alquilar? ");
						System.out.println("1: Coche\n2: Furgoneta\n3: Moto");
						opcionVehiculo = sc.nextInt();
						if (opcionVehiculo >= 1 && opcionVehiculo <= 3) {
							switch (opcionVehiculo) {
								case 1:
									Coche cocheNoAlquilado = (Coche) cocheSinAlquilar.get(0);
									cocheSinAlquilar.remove(0);
									cocheAlquilados1.add(cocheNoAlquilado);
									break;
								case 2:
									Furgoneta furgonetaNoAlquilada = (Furgoneta) furgonetaSinAlquilar.get(0);
									furgonetaSinAlquilar.remove(0);
									furgonetaAlquilados1.add(furgonetaNoAlquilada);
									break;
								case 3:
									Moto motoNoAlquilada = (Moto) motoSinAlquilar.get(0);
									motoSinAlquilar.remove(0);
									motoAlquilados1.add(motoNoAlquilada);
									break;
							}
							// Una vez que se ha seleccionado y movido el vehículo, establece
							// seleccionValida en true para salir del bucle
							seleccionValida = true;
						} else {
							System.out.println("Opción inválida");
						}
					}
					System.out.print("Durante cuántos días? ");
					opcionDias1 = sc.nextInt();
					break;
				case 2:
					seleccionValida = false;
					while (!seleccionValida) {
						System.out.println("\n" + empresa2.getNombre());
						System.out.println("¿Qué vehículo desea alquilar? ");
						System.out.println("1: Coche\n2: Furgoneta\n3: Moto");
						opcionVehiculo = sc.nextInt();
						if (opcionVehiculo >= 1 && opcionVehiculo <= 3) {
							switch (opcionVehiculo) {
								case 1:
									Coche cocheNoAlquilado = (Coche) cocheSinAlquilar.get(0);
									cocheSinAlquilar.remove(0);
									cocheAlquilados2.add(cocheNoAlquilado);
									break;
								case 2:
									Furgoneta furgonetaNoAlquilada = (Furgoneta) furgonetaSinAlquilar.get(0);
									furgonetaSinAlquilar.remove(0);
									furgonetaAlquilados2.add(furgonetaNoAlquilada);
									break;
								case 3:
									Moto motoNoAlquilada = (Moto) motoSinAlquilar.get(0);
									motoSinAlquilar.remove(0);
									motoAlquilados2.add(motoNoAlquilada);
									break;
							}
							// Una vez que se ha seleccionado y movido el vehículo, establece
							// seleccionValida en true para salir del bucle
							seleccionValida = true;
						} else {
							System.out.println("Opción inválida");
						}
					}
					System.out.print("Durante cuántos días? ");
					opcionDias2 = sc.nextInt();
					break;
				case 3:
					seleccionValida = false;
					while (!seleccionValida) {
						System.out.println("\n" + empresa3.getNombre());
						System.out.println("¿Qué vehículo desea alquilar? ");
						System.out.println("1: Coche\n2: Furgoneta\n3: Moto");
						opcionVehiculo = sc.nextInt();
						if (opcionVehiculo >= 1 && opcionVehiculo <= 3) {
							switch (opcionVehiculo) {
								case 1:
									Coche cocheNoAlquilado = (Coche) cocheSinAlquilar.get(0);
									cocheSinAlquilar.remove(0);
									cocheAlquilados3.add(cocheNoAlquilado);
									break;
								case 2:
									Furgoneta furgonetaNoAlquilada = (Furgoneta) furgonetaSinAlquilar.get(0);
									furgonetaSinAlquilar.remove(0);
									furgonetaAlquilados3.add(furgonetaNoAlquilada);
									break;
								case 3:
									Moto motoNoAlquilada = (Moto) motoSinAlquilar.get(0);
									motoSinAlquilar.remove(0);
									motoAlquilados3.add(motoNoAlquilada);
									break;
							}
							// Una vez que se ha seleccionado y movido el vehículo, establece
							// seleccionValida en true para salir del bucle
							seleccionValida = true;
						} else {
							System.out.println("Opción inválida");
						}
					}
					System.out.print("Durante cuántos días? ");
					opcionDias3 = sc.nextInt();
					break;
				case 4:
					seleccionValida = false;
					while (!seleccionValida) {
						System.out.println("\n" + empresa4.getNombre());
						System.out.println("¿Qué vehículo desea alquilar? ");
						System.out.println("1: Coche\n2: Furgoneta\n3: Moto");
						opcionVehiculo = sc.nextInt();
						if (opcionVehiculo >= 1 && opcionVehiculo <= 3) {
							switch (opcionVehiculo) {
								case 1:
									Coche cocheNoAlquilado = (Coche) cocheSinAlquilar.get(0);
									cocheSinAlquilar.remove(0);
									cocheAlquilados4.add(cocheNoAlquilado);
									break;
								case 2:
									Furgoneta furgonetaNoAlquilada = (Furgoneta) furgonetaSinAlquilar.get(0);
									furgonetaSinAlquilar.remove(0);
									furgonetaAlquilados4.add(furgonetaNoAlquilada);
									break;
								case 3:
									Moto motoNoAlquilada = (Moto) motoSinAlquilar.get(0);
									motoSinAlquilar.remove(0);
									motoAlquilados4.add(motoNoAlquilada);
									break;
							}
							// Una vez que se ha seleccionado y movido el vehículo, establece
							// seleccionValida en true para salir del bucle
							seleccionValida = true;
						} else {
							System.out.println("Opción inválida");
						}
					}
					System.out.print("Durante cuántos días? ");
					opcionDias4 = sc.nextInt();
					break;
				case 5:
					seleccionValida = false;
					while (!seleccionValida) {
						System.out.println("\n" + empresa5.getNombre());
						System.out.println("¿Qué vehículo desea alquilar? ");
						System.out.println("1: Coche\n2: Furgoneta\n3: Moto");
						opcionVehiculo = sc.nextInt();
						if (opcionVehiculo >= 1 && opcionVehiculo <= 3) {
							switch (opcionVehiculo) {
								case 1:
									Coche cocheNoAlquilado = (Coche) cocheSinAlquilar.get(0);
									cocheSinAlquilar.remove(0);
									cocheAlquilados5.add(cocheNoAlquilado);
									break;
								case 2:
									Furgoneta furgonetaNoAlquilada = (Furgoneta) furgonetaSinAlquilar.get(0);
									furgonetaSinAlquilar.remove(0);
									furgonetaAlquilados5.add(furgonetaNoAlquilada);
									break;
								case 3:
									Moto motoNoAlquilada = (Moto) motoSinAlquilar.get(0);
									motoSinAlquilar.remove(0);
									motoAlquilados5.add(motoNoAlquilada);
									break;
							}
							// Una vez que se ha seleccionado y movido el vehículo, establece
							// seleccionValida en true para salir del bucle
							seleccionValida = true;
						} else {
							System.out.println("Opción inválida");
						}
					}
					System.out.print("Durante cuántos días? ");
					opcionDias5 = sc.nextInt();
					break;
				case 6:
					seleccionValida = false;
					while (!seleccionValida) {
						System.out.println("\n" + empresa6.getNombre());
						System.out.println("¿Qué vehículo desea alquilar? ");
						System.out.println("1: Coche\n2: Furgoneta\n3: Moto");
						opcionVehiculo = sc.nextInt();
						if (opcionVehiculo >= 1 && opcionVehiculo <= 3) {
							switch (opcionVehiculo) {
								case 1:
									Coche cocheNoAlquilado = (Coche) cocheSinAlquilar.get(0);
									cocheSinAlquilar.remove(0);
									cocheAlquilados6.add(cocheNoAlquilado);
									break;
								case 2:
									Furgoneta furgonetaNoAlquilada = (Furgoneta) furgonetaSinAlquilar.get(0);
									furgonetaSinAlquilar.remove(0);
									furgonetaAlquilados6.add(furgonetaNoAlquilada);
									break;
								case 3:
									Moto motoNoAlquilada = (Moto) motoSinAlquilar.get(0);
									motoSinAlquilar.remove(0);
									motoAlquilados6.add(motoNoAlquilada);
									break;
							}
							// Una vez que se ha seleccionado y movido el vehículo, establece
							// seleccionValida en true para salir del bucle
							seleccionValida = true;
						} else {
							System.out.println("Opción inválida");
						}
					}
					System.out.print("Durante cuántos días? ");
					opcionDias6 = sc.nextInt();
					break;
				case -1:
					vehiculo.mostrarInforme(cocheSinAlquilar, furgonetaSinAlquilar, motoSinAlquilar, cocheAlquilados1,
							cocheAlquilados2, cocheAlquilados3, cocheAlquilados4, cocheAlquilados5, cocheAlquilados6,
							furgonetaAlquilados1, furgonetaAlquilados2, furgonetaAlquilados3, furgonetaAlquilados4,
							furgonetaAlquilados5, furgonetaAlquilados6, motoAlquilados1, motoAlquilados2,
							motoAlquilados3,
							motoAlquilados4, motoAlquilados5, motoAlquilados6, opcionDias1, opcionDias2,
							opcionDias3,
							opcionDias4,
							opcionDias5,
							opcionDias6,
							dia, empresa1, empresa2,
							empresa3, empresa4, empresa5, empresa6);
					dia++;
					break;
				default:
					System.out.println("Opción inválida");
			}
			System.out.println("\n\n");
		}
	} // Del main
} // De la clase