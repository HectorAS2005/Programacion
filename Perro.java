package veterinarioPaquete;

public class Perro extends Animal{
	//Atributos
	protected String raza;
	
	//Constructores
	public Perro() {
		super();
	} //Del super
	
	public Perro(String raza, String nombre, int edad) {
		super(nombre, edad);
		this.raza = raza;
	} //Del constructor

	
	//Getters y Setters
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	} //De los Getters Setters
} //De la clase