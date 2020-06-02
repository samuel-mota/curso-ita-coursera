
public class Paciente {

	double peso;
	double altura;
	double imc;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	double calcularIMC() {
		return peso / (altura * altura);
	}
	
	String diagnostico() {
		imc = this.calcularIMC();
		String info;
		
		if (imc < 16) info="Baixo peso muito grave = IMC abaixo de 16 kg/m²";
		else if (imc >= 16 && imc < 17) info="Baixo peso grave = IMC entre 16 e 16,99 kg/m²"; 
		else if (imc >= 17 && imc < 18.5) info="Baixo peso = IMC entre 17 e 18,49 kg/m²"; 
		else if (imc >= 18.50 && imc < 25) info="Peso normal = IMC entre 18,50 e 24,99 kg/m²"; 
		else if (imc >= 25 && imc < 30) info="Sobrepeso = IMC entre 25 e 29,99 kg/m²"; 
		else if (imc >= 30 && imc < 35) info="Obesidade grau I = IMC entre 30 e 34,99 kg/m²"; 
		else if (imc >= 35 && imc < 40) info="Obesidade grau II = IMC entre 35 e 39,99 kg/m²"; 
		else return "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
		
		return info;
	}

}
