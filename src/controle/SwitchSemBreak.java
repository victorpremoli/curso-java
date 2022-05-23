package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta": 
			System.out.println("Sei o Bassai-Dai");
		case "marron": 
			System.out.println("Sei o Tekki Shodan");
		case "roxa": 
			System.out.println("Sei o Godan");
		case "verde": 
			System.out.println("Sei o Yodan");
		case "laranja": 
			System.out.println("Sei o Sandan");
		case "vermelha": 
			System.out.println("Sei o Nidan");
		case "amarela": 
			System.out.println("Sei o Heian Shodan");
//		default:
//			System.out.println("Nao sei de nada.");
		}
		
	}
}
