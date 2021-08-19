package controller;
public class ED_Ex2_Recursividade {

	public ED_Ex2_Recursividade() {
		super();
	}

	public int fatorial (int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * fatorial (num - 1);
		}
	}
}
