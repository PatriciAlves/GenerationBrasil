package Repeticao;

import java.util.Scanner;

/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0;
		int num;
		

		System.out.println("==============================");
		System.out.println("       PROGRAMA DE SOMA       ");
		System.out.println("==============================");

		do {
			System.out.println("Digite um numero(ou 0 para parar): ");
			num = ler.nextInt();
			if (num != 0) {
				soma += num;
			}

		} while (num > 0);

		System.out.println("A soma dos números digitados é: " + soma);
		System.out.println("========= FIM DO PROGRAMA =============");
		{

		}
	}
}
