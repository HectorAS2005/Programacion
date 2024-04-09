//Creado por Héctor Aparicio
package paqueteAlquilar;

public class Moto extends Vehiculo {
	//Atributos
	protected boolean maletin;

	//Constructor
	public Moto(String matricula, String modelo, String marca, int caballos, boolean maletin) {
		super(matricula, modelo, marca, caballos);
		this.maletin = maletin;
	} //Del constructor

	//Getters & Setters
	public boolean isMaletin() {
		return maletin;
	}

	public void setMaletin(boolean maletin) {
		this.maletin = maletin;
	} //De Getters & Setters	
} //De la clase