import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;

public class Pessoa {

	Date dataDeNascimento;
	
	public Pessoa(Date ddn) {
		this.dataDeNascimento = ddn;
		System.out.println(ddn);
	}
	
	public Date getIdade() {
//		if (dataDeNascimento >= "") {
//			
//		}
		String pattern = "dd-MMM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		Relogio dataAtual = new Relogio();
		
		Date current = new Date();
		
		//long idade = dataAtual.agora() - current;
		Period diff = Period.between(new Date(), current);
		
		//Date idade = dataAtual.agora();
		//String date2 = sdf.format(sdf.parse("1-Feb-2000"));
		
		//if (dataAtual > date2) 
			
		return new Date(idade); //sdf.format(idade);
	}
	
	public String getSigno() {
		return null;
		
	}

}
