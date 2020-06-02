import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarrinhoTest {

	@Test
	void addProd() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(new Produto("Prod1",1,12.50), 1);
		carrinho.adicionaProduto(new Produto("Prod2",2,10), 1);
		
		assertEquals(22.5, carrinho.getValorTotal());
	}
	
	@Test
	void removeProd() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Produto prod1 = new Produto("Prod1",1,12.50);
		Produto prod2 = new Produto("Prod2",2,10);
		carrinho.adicionaProduto(prod1, 3);
		carrinho.adicionaProduto(prod2, 1);
		
		carrinho.removeProduto(prod1, 1);
		
		assertEquals(2, carrinho.getQuantidadeProd(prod1));
		
		//assertEquals(10, carrinho.getValorTotal());
	}
	
	@Test
	void addSameProd() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Produto prod1 = new Produto("Prod1",1,12.50);
		Produto prod2 = new Produto("Prod1",1,12.50);
		carrinho.adicionaProduto(prod1, 1);
		carrinho.adicionaProduto(prod2, 1);
		
		assertEquals(25, carrinho.getValorTotal());
	}

}
