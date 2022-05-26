package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 500); // seta o tamanho da janela
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // centralizar a janela na tela do computador.

		JButton botao = new JButton("Clicar!");
		janela.add(botao);

		// Adicionando um Listener ao botão
		botao.addActionListener(e -> {
			System.out.println("teste");
		});

		janela.setVisible(true);
	}
}
