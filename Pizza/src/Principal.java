
public class Principal {

	public static void main(String[] args) {
		
		// ******* criar 3 pizzas com ingredientes diferentes
		Pizza mussarela = new Pizza(); // tomate, mussarela 
		Pizza margherita = new Pizza(); // tomate, mussarela, azeitona
		Pizza quatroQueijos = new Pizza(); // mussarela, gorgonzola, catupiry, parmesao, azeitona, tomate
		//Pizza deVento = new Pizza(); // sem ingredientes, CARRINHO NAO ACEITA

		mussarela.adicionaIngrediente("tomate");
		mussarela.adicionaIngrediente("mussarela");
		
		margherita.adicionaIngrediente("tomate");
		margherita.adicionaIngrediente("mussarela");
		margherita.adicionaIngrediente("azeitona");
		
		quatroQueijos.adicionaIngrediente("mussarela");
		quatroQueijos.adicionaIngrediente("gorgonzola");
		quatroQueijos.adicionaIngrediente("catupiry");
		quatroQueijos.adicionaIngrediente("parmesão");
		quatroQueijos.adicionaIngrediente("azeitona");
		quatroQueijos.adicionaIngrediente("tomate");
		
		// ******* adiciona no carrinho
		CarrinhoDeCompras item1 = new CarrinhoDeCompras(mussarela);
		CarrinhoDeCompras item2 = new CarrinhoDeCompras(margherita);
		CarrinhoDeCompras item3 = new CarrinhoDeCompras(quatroQueijos);
		//CarrinhoDeCompras item4 = new CarrinhoDeCompras(deVento); // carrinho recusa adicionar
		
		// ******* imprime o total do carrinho
		CarrinhoDeCompras.getValorTotal();
		
		// ******* imprime a quantidade utilizada de cada ingrediente
		Pizza.getIngredientes();
	}
}
