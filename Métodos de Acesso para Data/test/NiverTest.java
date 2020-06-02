import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import org.junit.jupiter.api.Test;

class NiverTest {

	@Test
	void test() throws ParseException {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		long any = new Date().getTime();
		Date date = new Date(any);
		System.out.println("date: " + date);
		Pessoa sam = new Pessoa(date);
		
		System.out.println("getidade: " + sam.getIdade());
		
		


		//Date date = sdf.parse("1-Feb-2000");
		
		String date2 = sdf.format(sdf.parse("1-2-2000"));
		
		System.out.println("date2: "+date2);
	}

}
