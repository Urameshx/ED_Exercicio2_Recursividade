package view;
import javax.swing.JOptionPane;

import controller.ExdoisRecursividade;

public class Fatorial {

	public static void main(String[] args) {

		int numero_entrada;
		ExdoisRecursividade number = new ExdoisRecursividade();
		
		do {  
			numero_entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 12"));
		} 
		while (numero_entrada <= 0 || numero_entrada > 12);

		
		int fat = number.fatorial(numero_entrada);
		System.out.println(fat);
	}

}
