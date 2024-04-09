//Creado por Héctor Aparicio
package paqueteAlquilar;

public class Coche extends Vehiculo {
	//Atributos
	protected int numeroPuertas;

	//Constructor
	public Coche(String matricula, String modelo, String marca, int caballos, int numeroPuertas) {
		super(matricula, modelo, marca, caballos);
		this.numeroPuertas = numeroPuertas;
	} //Del constructor

	//Getters & Setters
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	} //De Getters & Setters
} //De la clase