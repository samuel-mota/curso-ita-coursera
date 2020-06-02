import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ContaCorrenteTest {
	
	ContaCorrente cc;

	@Before
	public void inicializaConta() {
		cc = new ContaCorrente();
		cc.depositar(200);
	}

	@Test
	public void testSacar() {
		
		int valorSacado = cc.sacar(50);
		assertEquals(cc.sacar(50), 50);
		assertEquals(valorSacado, 50);
	}

	@Test
	public void testDepositar() {
		cc = new ContaCorrente();
		cc.depositar(200);
		assertEquals(cc.saldo, 200);
	}
	
	@Test
	public void testSaqueMaiorQueSaldo() {
		
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo, 200);
		assertEquals(valorSacado, 0);
	}

}
