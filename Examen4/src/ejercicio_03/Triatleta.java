package ejercicio_03;

import java.time.Duration;
import java.time.LocalTime;

public class Triatleta implements Ciclista, Corredor, Nadador {
	private String dorsal;
	private LocalTime horaSalida;
	private LocalTime horaLLegada;
	private double tiempo;
	
	
	public Triatleta(String dorsal, LocalTime horaLLegada) {
		this.dorsal = dorsal;
		this.horaSalida = LocalTime.of(10, 00, 00);
		this.horaLLegada = null;
		this.tiempo = 0;
	}
	
	public String getDorsal() {
		return this.dorsal;
	}
	
	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}
	
	
	public LocalTime getHoraSalida() {
		return this.horaSalida;
	}
	
	
	public LocalTime getHoraLlegada() {
		return this.horaLLegada;
	}
	
	
	public double getTiempo() {
		return this.tiempo;
	}
	
	
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
		
	}
	
	
	@Override
	public double pedalear() {
		Duration duracion = Duration.between(horaSalida, horaLLegada);
		double minutos = duracion.toMinutes();
		return minutos * 0.3;
	}
	
	
	@Override
	public double correr() {
		Duration duracion = Duration.between(horaSalida, horaLLegada);
		double minutos = duracion.toMinutes();
		return minutos * 0.40;
	}
	
	
	@Override
	public double nadar(int metros) {
		return (metros * 3) / 2;
	}
	
}
