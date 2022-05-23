package controle.exercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class E2 {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);

		if (year % 400 == 0) {
			System.out.printf("O ano atual eh %d e eh bissexto.", year);
		} else {
			System.out.printf("O ano atual eh %d e nao eh bissexto.", year);
		}
	}
}
