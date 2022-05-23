package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
//		Atributo privado não é possivel acessar de outra classe.
//		System.out.println(mae.segredo); 
		
//		Atributo padrão, só tem visibilidade dentro do mesmo pacote.
//		System.out.println(mae.facoDentroDeCasa);
		
//		Podem ser acessados diretamente pois são passado por herança.
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
}
