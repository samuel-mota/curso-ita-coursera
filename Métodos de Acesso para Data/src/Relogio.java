import java.util.Date;

public class Relogio {

	private long currentDate = System.currentTimeMillis();
	private long fixedDate = 1346524199000L;
	
	public long agora() {
		//if (currentTime != 0) {
		Date date = new Date(fixedDate);
		
		return fixedDate;
		//return currentDate;

	}
}