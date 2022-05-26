package padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante {

	@Override
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados");
		System.out.println("Apagar as luzer");
		System.out.println("Fazer silencio");
		System.out.println("SURPRESA !!!");
	}

}
