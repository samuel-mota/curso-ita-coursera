
public class CarrinhoDeCompras {
	// recebe objetos classe pizza
	// retorna valor total de todas as pizzas 
	// nao aceita pizza sem ingrediente

	private static Pizza item;
	private static double sum;
	private static int test;

	public CarrinhoDeCompras(Pizza addItem) {

		if (addItem.getPreco() == 0) {
			System.out.println("Pizza sem ingredientes, não adicionada ao carrinho!");
		} else {
			item = addItem;		
			sum += item.getPreco();
			System.out.println(++test);
		}
	}

	public static void getValorTotal() {
		System.out.println("Valor Total do Carrinho: R$"+sum);
		System.out.println();
	}


}
