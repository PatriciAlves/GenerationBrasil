package Repeticao;

import java.util.Scanner;

public class Exercicio2 {
	/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) */
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
		System.out.println("Voc� digitou "+ par+ " n�meros pares e "+ impar +" n�meros "
				+ " impares" );

	}
}