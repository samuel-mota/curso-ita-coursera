package outro;

import pacote.Referencia;

public class Sub extends Referencia {

	public void testeAcesso() {
		// modificadorDefault = 0; // not visible
		modificadorPublico = 0;
		modificadorProtegido = 0;
		// modificadorPrivado = 0; // not visible
	}
}
