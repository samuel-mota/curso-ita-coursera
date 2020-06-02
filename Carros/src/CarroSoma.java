
public class CarroSoma extends CarroDeCorrida {
	
	private int potencia;
	
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome,velocidadeMaxima);
		this.potencia = potencia;
	}

	@Override
	public void acelerar() {
		velocidade += potencia;
		if (velocidade > velocidadeMaxima)
			velocidade = velocidadeMaxima;
	}
	
/*	public void imprimir() {
		System.out.println("O carro "+nome+" esta a velocidade de "+getVelocidade()+" km/h");
	}*/

}
