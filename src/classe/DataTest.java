package classe;

public class DataTest {
	public static void main(String[] args) {
		
		Data data1 = new Data(20 ,11, 1996);

		Data data2 = new Data();	

		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
	}
}
