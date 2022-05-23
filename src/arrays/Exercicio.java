package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		double notasAlunoA[] = new double[3];
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.2;
		notasAlunoA[1] = 5.4;
		notasAlunoA[2] = 8.1;
		
		System.out.println(Arrays.toString(notasAlunoA)); 
		
		double totalA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalA += notasAlunoA[i];
		}
		
		System.out.println(totalA / notasAlunoA.length);
		
		
		double notasAlunoB[] = {6.9, 8.9, 5.5, 10};
		
		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i]; 
		}
		System.out.println(totalB / notasAlunoB.length);
		
	}
}
