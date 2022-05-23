package controle;

public class For2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int k = 1; k <= 10; k++) {
				System.out.printf("[%d %d]", i, k);
			}
			System.out.println();
		}
	}
}
