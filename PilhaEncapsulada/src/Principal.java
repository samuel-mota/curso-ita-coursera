
public class Principal {

	public static void main(String[] args) {

		Pilha p = new Pilha(10);
		p.empilhar("Eduardo");
		p.empilhar("Maria");
		p.empilhar("Jose");
		System.out.println(p.topo());
		System.out.println(p.tamanho());

		Object[] arrayElementos = p.getElementos();
		System.out.println(arrayElementos.length); // com a copia nao eh alterado
		arrayElementos[1] = "OUTRO";
		
		// p.setTopo(6); // NOT ALLOWED
		
		// Desempilhando
		System.out.println("------------");
		System.out.println(p.desempilhar());
		System.out.println(p.topo());
		System.out.println(p.tamanho());
	}

}
