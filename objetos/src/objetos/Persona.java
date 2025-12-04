package objetos;

public class Persona {
	String nombre;
	int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String mostrarDatos() {
		return this.nombre + ": " + this.edad + " años";
	}
	
	public static void mostrar_grupo(Persona[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i].mostrarDatos());
		}
	}
	

	public static void main(String[] args) {
		Persona[] personas = new Persona[5];
		
		personas[0] = new Persona("Pedro", 25);
		personas[1] = new Persona("Antonio", 18);
		personas[2] = new Persona("Ana", 19);
		personas[3] = new Persona("Elena", 22);
		personas[4] = new Persona("Raquel", 21);

		mostrar_grupo(personas);
	}

}
