
public class Principal {

	public static void main(String[] args) {

		Paciente paciente1 = new Paciente(70, 1.74);
		Paciente paciente2 = new Paciente(90, 1.83);
		Paciente paciente3 = new Paciente(12, 0.9);
	
		System.out.println(paciente1.diagnostico()+" - Calculo IMC: " +paciente1.calcularIMC());
		System.out.println(paciente2.diagnostico()+" - Calculo IMC: " +paciente2.calcularIMC());
		System.out.println(paciente3.diagnostico()+" - Calculo IMC: " +paciente3.calcularIMC());
	}
}
