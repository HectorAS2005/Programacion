package veterinarioPaquete;

public class Gato extends Animal{
	//Atributos
	protected String pelaje;
	
	//Constructor
	public Gato() {
		super();
	} //Del super
	
	public Gato(String pelaje, String nombre, int edad) {
		super(nombre, edad);
		this.pelaje = pelaje;
	}// Del constructor

	
	//Getters y Setters
	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	} //De los Getters Setters
	
} //De la clase