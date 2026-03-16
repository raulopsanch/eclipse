package ejercicio_02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class OperacionesFecha {

	public static void main(String[] args) {
		LocalDate fechaInicio = LocalDate.of(2020, 2, 20);
		LocalDate fechaFin = LocalDate.of(2025, 12, 31);
		
		System.out.println("El año es: " + fechaInicio.getYear());
		System.out.println("El día es: " + fechaInicio.getDayOfMonth());
		
		System.out.println();
		int diasTranscurridos = Period.between(fechaInicio, fechaFin).getDays();
		System.out.println("Días transcurridos desde fecha inicio a fecha fin: " + diasTranscurridos);
		
		
		System.out.println();
		System.out.println("Ese día fue " + fechaInicio.getDayOfWeek());
		
		System.out.println();
		LocalDate hoy = LocalDate.now();
		System.out.println("Desde " + fechaInicio + " han transcurrido " +
		Period.between(fechaInicio, hoy).getYears() + " años");
		System.out.println("Desde " + fechaInicio + " han transcurrido " +
		Period.between(fechaInicio, hoy).getMonths()+ " meses");
		System.out.println("Desde " + fechaInicio + " han transcurrido " +
		Period.between(fechaInicio, hoy).getDays() + "días");

		
		System.out.println();
		LocalDate fechaNac = LocalDate.of(1988, 9, 10);
		int edad = Period.between(fechaNac, hoy).getYears();
		System.out.println("Nací un " + fechaNac.getDayOfWeek());
		
		System.out.println();
		LocalDate person = LocalDate.of(1985,12 , 12);
		int edadPerson = Period.between(person, hoy).getYears();
		double media = (edad + edadPerson) / 2;
		System.out.println("La media de edad es " + edad);
		
		
		System.out.println();
		System.out.println("Fecha y hora actual: " +LocalDateTime.now());
		
		System.out.println();
		LocalTime actual = LocalTime.now();
		System.out.println("Hora dentro de 55 min: " + actual.plusMinutes(55));
		
		
		System.out.println();
		LocalDateTime ahora = LocalDateTime.now();
		LocalDateTime tarde = ahora.plusMinutes(90);
		System.out.println("La reunión finaliza a las " + tarde.getHour() + ":" + tarde.getMinute() +
				" del día " + tarde.getDayOfMonth() + "-" + tarde.getMonthValue());
		
	}

}
