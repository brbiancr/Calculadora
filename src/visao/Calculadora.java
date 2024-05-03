package visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	public Calculadora() {
		
		organizarLayout();
		// Modificar fonte
		setTitle("Calculadora rosa");
		setSize(300, 420);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Finaliza o processo ao fechar a tela
		setLocationRelativeTo(null); // Centraliza a calculadora 
		setVisible(true);
	}
	
	private void organizarLayout() {
		// Define a tela em norte, sul, leste, oeste e centro
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(200, 60));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
		
		
	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
