package Repeticao;

import java.util.Scanner;

/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("===================================");
		System.out.println("       PROGRAMA CALCULO M�DIA      ");
		System.out.println("===================================");
		int num;
		int media = 0;
		int soma = 0;
		int cont = 0;

		System.out.println("Digite um numero inteiro: ");
		num = ler.nextInt();

		if (num % 3 == 0 && num != 0) {
			soma = soma + num;
			cont++;
		}
		while (num != 0) {
			System.out.println("Digite um numero inteiro: ");
			num = ler.nextInt();

		}
		if (num % 3 == 0 && num != 0) {
			soma = soma + num;
			cont++;

		}
		media = soma / cont;
		System.out.println("A m�dia dos n�meros digitados �: " + media);
	}
}
