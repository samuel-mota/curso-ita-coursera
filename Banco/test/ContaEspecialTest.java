import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ContaEspecialTest extends ContaCorrenteTest {
	
	@Before
	public void inicializaConta() {
		cc = new ContaEspecial(100);
		cc.depositar(200);
	}

	@Test
	public void testSaqueMaiorQueSaldo() {
		
		int valorSacado = cc.sacar(350);
		assertEquals(cc.saldo, 200);
		assertEquals(valorSacado, 0);
	}
	
	@Test
	public void testDoLimite() {
		
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo, -50);
		assertEquals(valorSacado, 250);
	}

}
