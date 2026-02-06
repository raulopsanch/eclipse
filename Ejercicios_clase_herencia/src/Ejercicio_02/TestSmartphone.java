package Ejercicio_02;

public class TestSmartphone {

	public static void main(String[] args) {
		Dispositivo[] dispositivos = new Dispositivo[3];
		
		dispositivos[0] = new Smartphone("Apple", "iphone 15", "iOS 10");
		dispositivos[1] = new Smartphone("Samsung", "Galaxy", "Android 1.6 Donut");
		dispositivos[2] = new Smartphone("Xiaomi", "note 4 pro", "Android UI 5.1");
		
		for (Dispositivo d : dispositivos) {
			if ( d instanceof Smartphone) {
				Smartphone s = (Smartphone)d;
				System.out.println(s.encender());
			}
			System.out.println();
		}
	}

}
