package Repeticao;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, cont21 = 0, cont50 = 0;
		
		System.out.println("=======================================");
		System.out.println("       PROGRAMA CONTADOR DE IDADE      ");
		System.out.println("=======================================");
		
		
		System.out.println("Digite a idade (ou -99 para encerrar): ");

		for (idade = 0; idade < 10;) {
			while (idade != -99) {

				System.out.println("Digite a idade: ");
				idade = ler.nextInt();
				
				if (idade < 21) {
					cont21 = cont21 + 1;
				}
				if (idade > 50) {
					cont50 = cont50 + 1;
					
				}
			}
			System.out.println("O total de pessoas menores de 21 anos é: " + cont21);
			System.out.println("O total de pessoas maiores de 50 anos é: " + cont50);
			System.out.println("FIM DO PROGRAMA");
			break;
		}

	}

}
