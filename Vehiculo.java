//Creado por Héctor Aparicio
package paqueteAlquilar;

import java.util.*;

public class Vehiculo {
	// Atributos
	protected String matricula;
	protected String modelo;
	protected String marca;
	protected int caballos;

	// Constructor
	public Vehiculo(String matricula, String modelo, String marca, int caballos) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.caballos = caballos;
	} // Del constructor

	public Vehiculo() {
		// Código del constructor (si es necesario)
	}

	// Getters & Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	} // De los Getters & Setters

	// Método Informe
	public void mostrarInforme(ArrayList<Vehiculo> cocheSinAlquilar, ArrayList<Vehiculo> furgonetaSinAlquilar,
			ArrayList<Vehiculo> motoSinAlquilar, ArrayList<Vehiculo> cocheAlquilados1,
			ArrayList<Vehiculo> cocheAlquilados2, ArrayList<Vehiculo> cocheAlquilados3,
			ArrayList<Vehiculo> cocheAlquilados4, ArrayList<Vehiculo> cocheAlquilados5,
			ArrayList<Vehiculo> cocheAlquilados6, ArrayList<Vehiculo> furgonetaAlquilados1,
			ArrayList<Vehiculo> furgonetaAlquilados2, ArrayList<Vehiculo> furgonetaAlquilados3,
			ArrayList<Vehiculo> furgonetaAlquilados4, ArrayList<Vehiculo> furgonetaAlquilados5,
			ArrayList<Vehiculo> furgonetaAlquilados6, ArrayList<Vehiculo> motoAlquilados1,
			ArrayList<Vehiculo> motoAlquilados2, ArrayList<Vehiculo> motoAlquilados3,
			ArrayList<Vehiculo> motoAlquilados4, ArrayList<Vehiculo> motoAlquilados5,
			ArrayList<Vehiculo> motoAlquilados6, int opcionDias1, int opcionDias2,
			int opcionDias3,
			int opcionDias4,
			int opcionDias5,
			int opcionDias6,
			int dia,
			Empresa empresa1, Empresa empresa2, Empresa empresa3,
			Empresa empresa4, Empresa empresa5, Empresa empresa6) {
		// Vehiculos sin alquilar
		System.out.println("\nCoches sin alquilar\n============================");
		for (int i = 0; i < cocheSinAlquilar.size(); i++) {
			System.out.println((i + 1) + ". " + cocheSinAlquilar.get(i).getMarca() + " "
					+ cocheSinAlquilar.get(i).getModelo() + " " + cocheSinAlquilar.get(i).getMatricula());
		}
		System.out.println("\nFurgonetas sin alquilar\n============================");
		for (int i = 0; i < furgonetaSinAlquilar.size(); i++) {
			System.out.println((i + 1) + ". " + furgonetaSinAlquilar.get(i).getMarca() + " "
					+ furgonetaSinAlquilar.get(i).getModelo() + " "
					+ furgonetaSinAlquilar.get(i).getMatricula());
		}
		System.out.println("\nMotos sin alquilar\n============================");
		for (int i = 0; i < motoSinAlquilar.size(); i++) {
			System.out.println((i + 1) + ". " + motoSinAlquilar.get(i).getMarca() + " "
					+ motoSinAlquilar.get(i).getModelo() + " " + motoSinAlquilar.get(i).getMatricula());
		}

		// Resumen Empresas
		System.out.println("\n\n" + empresa1.getNombre());
		for (int i = 0; i < cocheAlquilados1.size(); i++) {
			System.out.println(cocheAlquilados1.get(i).getMarca() + " "
					+ cocheAlquilados1.get(i).getModelo() + " " + cocheAlquilados1.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias1 + " día(s) de alquiler.");
		}
		for (int i = 0; i < furgonetaAlquilados1.size(); i++) {
			System.out.println(furgonetaAlquilados1.get(i).getMarca() + " "
					+ furgonetaAlquilados1.get(i).getModelo() + " "
					+ furgonetaAlquilados1.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias1 + " día(s) de alquiler.");
		}
		for (int i = 0; i < motoAlquilados1.size(); i++) {
			System.out.println(motoAlquilados1.get(i).getMarca() + " "
					+ motoAlquilados1.get(i).getModelo() + " " + motoAlquilados1.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias1 + " día(s) de alquiler.");
		}
		opcionDias1--;

		System.out.println("\n\n" + empresa2.getNombre());
		for (int i = 0; i < cocheAlquilados2.size(); i++) {
			System.out.println(cocheAlquilados2.get(i).getMarca() + " "
					+ cocheAlquilados2.get(i).getModelo() + " " + cocheAlquilados2.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias2 + " día(s) de alquiler.");
		}
		for (int i = 0; i < furgonetaAlquilados2.size(); i++) {
			System.out.println(furgonetaAlquilados2.get(i).getMarca() + " "
					+ furgonetaAlquilados2.get(i).getModelo() + " "
					+ furgonetaAlquilados2.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias2 + " día(s) de alquiler.");
		}
		for (int i = 0; i < motoAlquilados2.size(); i++) {
			System.out.println(motoAlquilados2.get(i).getMarca() + " "
					+ motoAlquilados2.get(i).getModelo() + " " + motoAlquilados2.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias2 + " día(s) de alquiler.");
		}
		opcionDias2--;

		System.out.println("\n\n" + empresa3.getNombre());
		for (int i = 0; i < cocheAlquilados3.size(); i++) {
			System.out.println(cocheAlquilados3.get(i).getMarca() + " "
					+ cocheAlquilados3.get(i).getModelo() + " " + cocheAlquilados3.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias3 + " día(s) de alquiler.");
		}
		for (int i = 0; i < furgonetaAlquilados3.size(); i++) {
			System.out.println(furgonetaAlquilados3.get(i).getMarca() + " "
					+ furgonetaAlquilados3.get(i).getModelo() + " "
					+ furgonetaAlquilados3.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias3 + " día(s) de alquiler.");
		}
		for (int i = 0; i < motoAlquilados3.size(); i++) {
			System.out.println(motoAlquilados3.get(i).getMarca() + " "
					+ motoAlquilados3.get(i).getModelo() + " " + motoAlquilados3.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias3 + " día(s) de alquiler.");
		}
		opcionDias3--;
		System.out.println("\n\n" + empresa4.getNombre());
		for (int i = 0; i < cocheAlquilados4.size(); i++) {
			System.out.println(cocheAlquilados4.get(i).getMarca() + " "
					+ cocheAlquilados4.get(i).getModelo() + " " + cocheAlquilados4.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias4 + " día(s) de alquiler.");
		}
		for (int i = 0; i < furgonetaAlquilados4.size(); i++) {
			System.out.println(furgonetaAlquilados4.get(i).getMarca() + " "
					+ furgonetaAlquilados4.get(i).getModelo() + " "
					+ furgonetaAlquilados4.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias4 + " día(s) de alquiler.");
		}
		for (int i = 0; i < motoAlquilados4.size(); i++) {
			System.out.println(motoAlquilados4.get(i).getMarca() + " "
					+ motoAlquilados4.get(i).getModelo() + " " + motoAlquilados4.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias4 + " día(s) de alquiler.");
		}
		opcionDias4--;
		System.out.println("\n\n" + empresa5.getNombre());
		for (int i = 0; i < cocheAlquilados5.size(); i++) {
			System.out.println(cocheAlquilados5.get(i).getMarca() + " "
					+ cocheAlquilados5.get(i).getModelo() + " " + cocheAlquilados5.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias5 + " día(s) de alquiler.");
		}
		for (int i = 0; i < furgonetaAlquilados5.size(); i++) {
			System.out.println(furgonetaAlquilados5.get(i).getMarca() + " "
					+ furgonetaAlquilados5.get(i).getModelo() + " "
					+ furgonetaAlquilados5.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias5 + " día(s) de alquiler.");
		}
		for (int i = 0; i < motoAlquilados5.size(); i++) {
			System.out.println(motoAlquilados5.get(i).getMarca() + " "
					+ motoAlquilados5.get(i).getModelo() + " " + motoAlquilados5.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias5 + " día(s) de alquiler.");
		}
		opcionDias5--;
		System.out.println("\n\n" + empresa6.getNombre());
		for (int i = 0; i < cocheAlquilados6.size(); i++) {
			System.out.println(cocheAlquilados6.get(i).getMarca() + " "
					+ cocheAlquilados6.get(i).getModelo() + " " + cocheAlquilados6.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias6 + " día(s) de alquiler.");
		}
		for (int i = 0; i < furgonetaAlquilados6.size(); i++) {
			System.out.println(furgonetaAlquilados6.get(i).getMarca() + " "
					+ furgonetaAlquilados6.get(i).getModelo() + " "
					+ furgonetaAlquilados6.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias6 + " día(s) de alquiler.");
		}
		for (int i = 0; i < motoAlquilados6.size(); i++) {
			System.out.println(motoAlquilados6.get(i).getMarca() + " "
					+ motoAlquilados6.get(i).getModelo() + " " + motoAlquilados6.get(i).getMatricula()
					+ "; " + " Quedan " + opcionDias6 + " día(s) de alquiler.");
		}
		opcionDias6--;
	}
}
// De la clase