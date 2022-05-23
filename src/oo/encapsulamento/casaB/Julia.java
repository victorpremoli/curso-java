package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();

	void testeAcessos() {
//		System.out.println(sogra.segredo); 
//		System.out.println(sogra.facoDentroDeCasa);
//		System.out.println(sogra.formaDeFalar);
		
//		Só pode acessar atributos publicos da classe pois não está dentro
//		do mesmo pacote e não está recebendo nada por herença
		System.out.println(sogra.todosSabem);

	}
}
