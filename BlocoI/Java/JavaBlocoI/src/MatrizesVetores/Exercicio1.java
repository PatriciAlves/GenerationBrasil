package MatrizesVetores;

import java.util.Scanner;

/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int vetor[] = new int[5];
		int valor = 0;
		int maiorPontuacao = 0;
		

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um valor: " + (i + 1) + " ° valor");
			valor = ler.nextInt();

			vetor[i] = valor;

			if (maiorPontuacao < vetor[i]) {
				maiorPontuacao = vetor[i];
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}
		System.out.println("maior pontuação: " + maiorPontuacao);
	}

}
