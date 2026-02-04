package POO;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Main2Test {

	@Test
	void testMayordeEdadTrue() {
		assertEquals(true, Main2.MayordeEdad(18));
		assertEquals(true, Main2.MayordeEdad(25));
		assertEquals(false, Main2.MayordeEdad(15));
		assertEquals(false, Main2.MayordeEdad(10));
	}


	@Test
	void testOcupacion() {
		assertEquals("Menor", Main2.ocupacion(15, "Estudia"));
		assertEquals("Estudiante", Main2.ocupacion(18, "Estudia"));
		assertEquals("Trabajador", Main2.ocupacion(18, "Trabaja"));
		assertEquals("Estudiante", Main2.ocupacion(20, "estUDia"));
	}

	
	@Test
	void testCalcularHipotenusa() {
		assertEquals(13, Main2.calcularHipotenusa(5, 12));
		assertEquals(25, Main2.calcularHipotenusa(7, 24));
		assertEquals(14.14, Main2.calcularHipotenusa(10, 10), 0.01);
		assertEquals(1.41, Main2.calcularHipotenusa(1, 1), 0.01);
	}

}
