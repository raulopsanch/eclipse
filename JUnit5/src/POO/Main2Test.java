package POO;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Main2Test {

	@Test
	void testMayordeEdadTrue() {
		assertTrue(Main2.MayordeEdad(18));
		assertTrue(Main2.MayordeEdad(25));
		assertFalse(Main2.MayordeEdad(15));
		assertFalse(Main2.MayordeEdad(10));
	}


	@Test
	void testOcupacion() {
		assertEquals("Menor", Main2.ocupacion(15, "Estudia"));
		assertEquals("Estudiante", Main2.ocupacion(18, "Estudia"));
		assertEquals("Trabajador", Main2.ocupacion(18, "Ocupado"));
		assertEquals("Desempleado", Main2.ocupacion(20, "estUDia"));
	}

	
	@Test
	void testCalcularHipotenusa() {
		assertEquals(13, Main2.calcularHipotenusa(5, 12));
		assertEquals(25, Main2.calcularHipotenusa(7, 24));
		assertEquals(141.4213562373095, Main2.calcularHipotenusa(100, 100));
		assertEquals(1.4142135623730951, Main2.calcularHipotenusa(1, 1));
	}

}
