package br.senai.sp.jandira.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {
	String nome;
	
	
	public void criarTela(){
	JFrame minhaTela = new JFrame ();
	minhaTela.setSize(500, 500);
	minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	minhaTela.setTitle("exercicio GUI ");
	minhaTela.setLayout(null);
	
	//Criar os componetes da tela 
	JLabel lblIdade = new JLabel();
	lblIdade.setText("olá ");
	minhaTela.getContentPane().add(lblIdade);
	lblIdade.setBounds(20, 60, 150, 100);
	
	JButton botao = new JButton();
	botao.setText("ok");
	minhaTela.getContentPane().add(botao);
	botao.setBounds(60, 60, 100, 30);
	
	JTextField texto = new JTextField();
	texto.setText("");
	minhaTela.getContentPane().add(texto);
	texto.setBounds(20, 20, 100, 30);
	
	//Listernes de eventos
	
	//Eventos do botão 
    
	botao.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent e) {
			
			String nome = texto.getText();
			lblIdade.setText("ola " + nome);			
			
			int valor = Integer.parseInt(nome);
			int resultado = valor * 15;
			lblIdade.setText(String.valueOf(resultado));
		}
	});
	
	
	minhaTela.setVisible(true);
	}
	
	
	
	
	

}
