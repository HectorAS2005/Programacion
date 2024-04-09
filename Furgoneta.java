//Creado por Héctor Aparicios
package paqueteAlquilar;

public class Furgoneta extends Vehiculo {
	//Atributos
	protected double espacio;

	//Constructor
	public Furgoneta(String matricula, String modelo, String marca, int caballos, double espacio) {
		super(matricula, modelo, marca, caballos);
		this.espacio = espacio;
	} //Del constructor	

	//Setters & Getters
	public double getEspacio() {
		return espacio;
	}

	public void setEspacio(double espacio) {
		this.espacio = espacio;
	} //De Getters & Setters
} //De la clase