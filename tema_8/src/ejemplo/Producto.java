package ejemplo;

public class Producto {
	public int id;
    public String nombre;
    public int precio;
	
	
	public Producto(int id, String nombre, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
	
    @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
			return true;
	}


	@Override
	public String toString() {
		return super.toString();
	}


	


    



}
