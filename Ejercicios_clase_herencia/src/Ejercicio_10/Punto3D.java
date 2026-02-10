package Ejercicio_10;

public class Punto3D extends Punto {
	private double z;
	
	public Punto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	public double getZ() {
		return this.z;
	}
	
	public void setZ(double newZ) {
		this.z = newZ;
	}
	
	@Override
	public double distanceToZero() {
		return Math.sqrt(this.squareDistanceToZero());
	}
	
	@Override
	public double distance(Punto other) {
		if (other instanceof Punto3D) {
			Punto3D other3D = (Punto3D)other;
			
			double dX = this.getX() - other.getX();
			double dY = this.getY() - other.getY();
			double dZ = this.z - other3D.getZ();
			
			return Math.sqrt(dX * dX + dY * dY + dZ * dZ);
		}
		double dX = this.getX() - other.getX();
		double dY = this.getY() - other.getY();
		
		return Math.sqrt(dX * dX + dY * dY);	
	}
	
	@Override
	public double squareDistanceToZero() {
		return super.squareDistanceToZero() + this.z * this.z;
	}
	
	@Override
	public String toString() {
		return "(" + this.getX() + ", " + this.getY() + ", " + this.z +")";
	}
}
