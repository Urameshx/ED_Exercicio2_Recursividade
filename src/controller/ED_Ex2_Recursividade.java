package controller;
public class ED_Ex2_Recursividade {

	public ED_Ex2_Recursividade() {
		super();
	}

	public int fatorial (int num) {
		/*Condição de parada = Por se tratar de número fatorial, 
		será qualquer decremento do número inicial igual a 1*/
		
		if (num == 1) {
			return 1;
		} 
		/* O valor da entrada será multiplicado por ela própria, após isso 
		será subtraído um número. O processo se repetirá até o valor da entrada ser igual a 1.
		*/
		
		else {
			return num * fatorial (num - 1);
		}
	}
}
