package Repeticao;

import java.util.Scanner;

public class Exercicio2 {
	/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) */
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int par = 0, num, i, impar = 0;
		
		System.out.println("=============================================");
		System.out.println(" PROGRAMA LEITURA DE NUMEROS IMPARES E PARES ");
		System.out.println("=============================================");
		

		for (i = 1; i <= 10; i++) {
			System.out.println("Informe um numero: ");
			num = ler.nextInt();
			if (num % 2 == 0) {
				par = par + 1;

			}if (num%2==1) {
				impar++;
			}
		}
		System.out.println("Você digitou "+ par+ " números pares e "+ impar +" números "
				+ " impares" );

	}
}