package Ejercicio_10;

public class testerPunto {

	public static void main(String[] args) {
		Punto[] puntos = new Punto[4];
		
		puntos[0] = new Punto(3.0, 2.0);
		puntos[1] = new Punto(-1.0, -1.0);
		puntos[2] = new Punto3D(3.0, 2.0, 0.0);
		puntos[3] = new Punto3D(-1.0, -1.0, -1.0);
		
		System.out.print("Distancia entre los puntos " + puntos[0] + " y " + puntos[1] +": ");
		System.out.println(puntos[0].distance(puntos[1]));
		
		System.out.println();
		
		System.out.print("Distancia entre los puntos " + puntos[2] + " y " + puntos[3] +": ");
		System.out.println(puntos[2].distance(puntos[3]));
		
		System.out.println();
		
		System.out.println("Distancia entre los puntos " + puntos[2] + " y " + puntos[1] +": ");
		double p3D1 = puntos[2].distanceToZero();
		double p2 = puntos[1].distanceToZero();
		
		if (p3D1 > p2) {
			System.out.print(puntos[2] + " está más lejos de zero que " + puntos[1]);
		} else {
			System.out.print(puntos[1] + " está más lejos de zero que " + puntos[2]);
		}

	}

}
