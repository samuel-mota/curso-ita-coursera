import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IMCTest {

	@Test
	void testeDeIMC() {
		Paciente paciente1 = new Paciente(70, 1.74);
		Paciente paciente2 = new Paciente(90, 1.83);
		Paciente paciente3 = new Paciente(12, 0.9);
		
		assertEquals(23.12, paciente1.calcularIMC(), 0.01);
		assertEquals(26.87, paciente2.calcularIMC(), 0.01);
		assertEquals(14.81, paciente3.calcularIMC(), 0.01);
	}

}
