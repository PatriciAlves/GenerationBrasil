package Repeticao;

public class Exercicio1 {

	/*
	 * Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos
	 * resto = 5. (FOR)
	 */

	public static void main(String[] args) {

		
		System.out.println("==============================");
		System.out.println("  PROGRAMA DE DIVIS�O POR 5   ");
		System.out.println("==============================");
		
		int i;

		for (i = 1000; i < 2000; i++) { // menor que 
			if (i % 11 == 5) {
				System.out.println(i);
			}
		}
	}
}
