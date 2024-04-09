package veterinarioPaquete;

public class Animal {
	//Atributos
	protected String nombre;
	protected int edad;
	
	//Constructor
	public Animal() {
		nombre = "";
		edad = 0;
	}
	
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	} //Del constructor

	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	} //De los Getters Setters

} //De la clase