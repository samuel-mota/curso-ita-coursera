import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	
	private Map<Produto, Integer> produtos = new HashMap<>();

	public void adicionaProduto(Produto prod, int qtdToAdd) {
		int newValue = 0;
		
		// if product is the same as in the map, change quantity
		if (produtos.containsKey(prod)) {
			newValue = produtos.get(prod) + qtdToAdd;
			produtos.put(prod, newValue);
			
		// add new
		} else {
			produtos.put(prod, qtdToAdd);	
		}
	}
	
	public void removeProduto(Produto prod, int qtdToRemove) {
		int newValue = 0;
		if (produtos.get(prod) < qtdToRemove) {
			produtos.remove(prod);
		} else {
			newValue = produtos.get(prod) - qtdToRemove;
			produtos.put(prod, newValue);
		}
	}
	
	public double getValorTotal() {
		double somaPrecos = 0;
		double getQtd = 0;
		for (Produto prod : produtos.keySet()) {
			getQtd = produtos.get(prod);
			somaPrecos += (prod.getPreco()*getQtd);
			//System.out.println(prod.getPreco());
		}
		return somaPrecos;
	}
	
	public int getQuantidadeProd(Produto prod) {
		
		return produtos.get(prod);
	}
}
