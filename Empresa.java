//Creado por Héctor Aparicio
package paqueteAlquilar;

public class Empresa {
	// Atributos
	protected String nombre;
	protected String cif;

	// Constructor
	public Empresa(String nombre, String CIF) {
		this.nombre = nombre;
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	} // De Getters & Setters
} // De la clase