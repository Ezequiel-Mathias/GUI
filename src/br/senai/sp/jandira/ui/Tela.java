package br.senai.sp.jandira.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {
	
	
	public void criarTela(){
	JFrame minhaTela = new JFrame ();
	minhaTela.setSize(500, 500);
	minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	minhaTela.setTitle("Minha primeira janela caraiou");
	minhaTela.setLayout(null);
	
	//Criar os componetes da tela 
	JLabel lblIdade = new JLabel();
	lblIdade.setText("sua idade é ");
	minhaTela.getContentPane().add(lblIdade);
	lblIdade.setBounds(20, 60, 150, 100);
	
	JButton botao = new JButton();
	botao.setText("verificar");
	minhaTela.getContentPane().add(botao);
	botao.setBounds(60, 60, 100, 30);
	
	JTextField texto = new JTextField();
	texto.setText("digite aqui");
	minhaTela.getContentPane().add(texto);
	texto.setBounds(20, 20, 100, 30);
	
	//Listernes de eventos
	
	texto.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("soltei ");
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("cliquei ");
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("sai ");
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("cheguei ");
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("cliquei ");
			
		}
	});
	
	texto.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
		
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyChar());
			System.out.println(e.getKeyCode());
			
		}
	});
	
	minhaTela.setVisible(true);
	}
	
	
	
	
	

}
