import java.util.HashMap;
import java.util.Map;

public class Pizza {

	private int countIngredientes;
	private static Map<String,Integer> ingrediente;

	public Pizza() {
		countIngredientes = 0;
		ingrediente = new HashMap<>();
	}

	public void adicionaIngrediente(String ingr) {

		countIngredientes++;		
		contabilizaIngrediente(ingr);
	}

	public double getPreco() {
		double preco = 0;

		if (countIngredientes > 0 && countIngredientes <= 2) {
			preco = 15.00;
		} else if (countIngredientes >= 3 && countIngredientes <= 5) {
			preco = 20.00;
		} else if (countIngredientes > 5) {
			preco = 23.00;
		}

		return preco;
	}

	private static void contabilizaIngrediente(String ingr) {

		if (ingrediente.containsKey(ingr)) { // verificar se a chave existe e adicionar 1 unidade
			int addOne = ingrediente.get(ingr) + 1;
			ingrediente.replace(ingr, addOne);
		} else { // se o ingrediente nao existir, criar ele com 1 unidade
			ingrediente.put(ingr, 1);
		}
	}

	public static void getIngredientes() {
		for (Map.Entry<String,Integer> entry : ingrediente.entrySet()) {
			System.out.println("Ingrediente: " + entry.getKey() + ", Quantidade: " + entry.getValue());
		}
	}
}