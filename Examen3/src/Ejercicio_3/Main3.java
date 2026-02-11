package Ejercicio_3;

public class Main3 {
	public static void main(String[] args) {
		Equipo[] integrantes = new Equipo[6];
		
		integrantes[0] = new Jugador("Manuel Suárez", 21, "portero");
		integrantes[1] = new Jugador("Raúl Santos", 19, "delantero");
		integrantes[2] = new Jugador("Joan Garles", 25, "defensa");
		integrantes[3] = new Jugador("Pedor Sanz", 27, "defensa");
		integrantes[4] = new Jugador("Aritz Contreras", 24, "medio");
		integrantes[5] = new Entrenador("Salguero", 47, 5, 9);
		
		
		System.out.println("====Información de todo el equipo y entrenador====");
		for(Equipo e : integrantes) {
			if (e instanceof Jugador) {
				Jugador j = (Jugador)e;
				System.out.println(j.infoJugador());
			} else if (e instanceof Entrenador) {
				Entrenador en = (Entrenador)e;
				System.out.println(en.infoEntrenador());
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("====Defensas del equipo====");
		
		for (Equipo e : integrantes) {
			if (e instanceof Jugador) {
				Jugador j = (Jugador)e;
				
				if(j.getPosicion().equalsIgnoreCase("defensa")) {
					System.out.println(j.infoJugador());
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		Entrenador en = (Entrenador)integrantes[5];
		
		if (!en.comprobarEntrenador()) {
			en.setNombre("Juaquín");
		}
		
		System.out.println("Nuevo entrenador: " + en.getNombre());

	}

}
