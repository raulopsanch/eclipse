package Ejercicio_10;

public class Punto {
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setX(double newX) {
		this.x = newX;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setY(double newY) {
		this.y = newY;
	}
	
	public double distanceToZero() {
		return Math.sqrt(this.squareDistanceToZero());
	}
	
	public double distance(Punto other) {
		double dX = this.x - other.getX();
		double dY = this.y - other.getY();
		
		return Math.sqrt((dX * dX) + (dY * dY));
	}
	
	public double squareDistanceToZero() {
		return this.x * this.x + this.y * this.y;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
