package POO;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
	@Test
	void testSuma() {
		Calculadora calc = new Calculadora(10, 5);
		assertEquals(15, calc.suma());
	}
	
	@Test
	void testSumaNegativos() {
		Calculadora calcNeg = new Calculadora(-10, -5);
		assertEquals(-15, calcNeg.suma());
	}
	
	@Test 
	void testResta() {
		Calculadora calc = new Calculadora(10, 5);
		assertEquals(5, calc.resta());
	}
	
	@Test
	void testRestaNeg() {
		Calculadora calc = new Calculadora(5, 10);
		assertEquals(-5, calc.resta());
	}
	
	@Test
	void testMultiplicar() {
		Calculadora calc = new Calculadora(10, 5);
		assertEquals(50, calc.multiplicar());
	}
	
	@Test
	void testMultiplicarNegativo() {
		Calculadora calc = new Calculadora(10, -5);
		assertEquals(-50, calc.multiplicar());
	}
	
	@Test
	void testDividir() {
		Calculadora calc = new Calculadora(10, 5);
		assertEquals(2, calc.dividir());
	}
	
	@Test
	void testDividirNegativo() {
		Calculadora calc = new Calculadora(-10, 5);
		assertEquals(-2, calc.dividir());
	}

}
