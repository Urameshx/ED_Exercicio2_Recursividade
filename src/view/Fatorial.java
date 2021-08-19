package view;
import javax.swing.JOptionPane;

import controller.ED_Ex2_Recursividade;

public class Fatorial {

	public static void main(String[] args) {

		int numero_entrada;
		ED_Ex2_Recursividade number = new ED_Ex2_Recursividade();
		
		do {  
			numero_entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 12"));
		} 
		while (numero_entrada <= 0 || numero_entrada > 12);

		
		int fat = number.fatorial(numero_entrada);
		System.out.println(fat);
	}

}