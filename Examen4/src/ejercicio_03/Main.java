package ejercicio_03;

import java.time.Duration;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		Triatleta[] tri = new Triatleta[5];
		
		
		tri[0] = new Triatleta("345", LocalTime.of(11, 54, 45));
	
	}
	
	
	public static double calcularTiempo(Triatleta tri) {
		Duration duracion = Duration.between(tri.getHoraSalida(), tri.getHoraLlegada());
		double minutos = duracion.toSeconds();
		
		return minutos;
	}
	
	
	public static void ganador(Triatleta[] array) {
		Triatleta tiempo = array[0];
		
		for (Triatleta t : array) {
			if (t.getTiempo() < tiempo.getTiempo()) {
				tiempo = t;
			}
		}
		
		System.out.println("El ganador de la carrera es el dorsal " + tiempo.getDorsal());
	}
	
	
	public static void Podium(Triatleta[] array) {
		Triatleta tiempo1 = array[0];
		Triatleta tiempo2 = array[0];
		Triatleta tiempo3 = array[0];
		
		for (Triatleta t : array) {
			if (t.getTiempo() > tiempo1.getTiempo()) {
				tiempo1 = t;
			} else if (t.getTiempo() > tiempo2.getTiempo() & t.getTiempo() < tiempo1.getTiempo()) {
				tiempo2 = t;
			} else if (t.getTiempo() < tiempo2.getTiempo() & t.getTiempo() > tiempo3.getTiempo()) {
				tiempo3 = t;
			}
		}
		
		System.out.println("En el primer lugar de la carrera el dorsal " + tiempo1.getDorsal());
		System.out.println("En el segundo lugar de la carrera el dorsal " + tiempo2.getDorsal());
		System.out.println("En el tercer lugar de la carrera el dorsal " + tiempo3.getDorsal());
	}
	
	
	public static void mostrarinformacion(Triatleta[] tri) {
		for(Triatleta t : tri) {
			System.out.println("corredor con dorsal " + t.getDorsal() + "hora de llegada " + t.getHoraLlegada());
			System.out.println();
		}
	}

}
