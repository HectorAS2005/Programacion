package veterinarioPaquete;

public class Pájaro extends Animal{
	//Atributos
	protected String color;
	
	//Constructor
	public Pájaro() {
		super();
	} //Del super
	
	public Pájaro(String color, String nombre, int edad) {
		super(nombre, edad);
		this.color = color;
	}

	
	//Getters y Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	} //De los Getters Setters
}//De la clase
