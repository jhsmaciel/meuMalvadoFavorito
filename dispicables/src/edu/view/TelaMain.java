package edu.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaMain {

	public TelaMain() {
		JFrame janela = new JFrame("Meu Malvado Favorito");
		JPanel painelPrincipal = new JPanel(new BorderLayout()); // Painel principal onde v�os os outros paineis
		JPanel painelBotoes = new JPanel();

//		Bot�es da tela principal.
		JButton btnVotar = new JButton("Votar em proposi��o");
		JButton btnLer = new JButton("Ler Comparativos");
		JButton btnVerificar = new JButton("Verificar votos realizados");

		painelPrincipal.add(painelBotoes, BorderLayout.CENTER);
		painelPrincipal.add(new JLabel("Meu Malvado Favorito"), BorderLayout.NORTH);
		painelBotoes.add(btnVotar);
		painelBotoes.add(btnLer);
		painelBotoes.add(btnVerificar);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		janela.setLocation((ds.width - 400) / 2, (ds.height - 400) / 2);

		janela.setContentPane(painelPrincipal);

		janela.setSize(400, 400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
