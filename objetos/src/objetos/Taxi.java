package objetos;

public class Taxi {
	String matricula;
	String distrito; // sur, norte, etc
	String tipoMotor; // diésel, gasolina, eco
	
	// Creo el constructor normal con todos los atributos
	public Taxi(String matricula, String distrito, String tipoMotor) {
		this.matricula = matricula;
		this.distrito = distrito;
		this.tipoMotor = tipoMotor;
	}
	
	// Creo el constructor con un tipoMotor por defecto
	public Taxi(String matricula, String distrito) {
		this.matricula = matricula;
		this.distrito = distrito;
		this.tipoMotor = "eco";
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getDistrito() {
		return this.distrito;
	}
	
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	public String getTipoMotor() {
		return this.tipoMotor;
	}
	
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	
	public String informacionTaxi() {
		return "\nMatrícula: " + this.matricula +
				"\nDistrito: " + this.distrito +
				"\nTipo de motor: " + this.tipoMotor;
	}
	
	public boolean mismoDistrito(Taxi otroTaxi) {
		return this.distrito.equalsIgnoreCase(otroTaxi.getDistrito());
	}
	

	public static void main(String[] args) {
		Taxi taxi1 = new Taxi("1234ABC", "norte", "diésel");
		Taxi taxi2 = new Taxi("5678DEF", "sur", "gasolina");
		Taxi taxi3 = new Taxi("9012GHI", "NORTE");
		
		System.out.println("\t****Información taxis****");
		System.out.println("\nInformación taxi1:" + taxi1.informacionTaxi());
		System.out.println("\nInformación taxi2:" + taxi2.informacionTaxi());
		System.out.println("\nInformación taxi3:" + taxi3.informacionTaxi());

		System.out.println("\n====Comprobar distritos====");
		System.out.print("¿tax1 y taxi2 operan en el mismo distrito? ");
		System.out.println(taxi1.mismoDistrito(taxi2));
		
		System.out.print("¿tax1 y taxi3 operan en el mismo distrito? ");
		System.out.println(taxi1.mismoDistrito(taxi3));
	}

}
