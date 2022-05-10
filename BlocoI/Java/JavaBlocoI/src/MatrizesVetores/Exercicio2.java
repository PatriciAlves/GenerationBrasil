package MatrizesVetores;

import java.util.Random;
import java.util.Scanner;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[10];
		int dado = 0;
		int soma = 0;
		int media = 0;
		int maiorDado = 0;
		int valorMaior = 0;
		Random r = new Random();


		for (int i = 0; i < 9; i++) {
			dado = r.nextInt(6) + 1;
			vetor[i] = dado;
			media = media + vetor[i];
			System.out.println(" " + vetor[i]);

			if (maiorDado <= vetor[i]) {
				valorMaior = valorMaior + 1;
			}

		}
		for (int i = 0; i <= 9; i++) {
			if (vetor[i] == maiorDado) {
				valorMaior = valorMaior + 1;
			}
		}
		System.out.println(" O maior valor jogado no dado é: "+ maiorDado);
		System.out.println(" A media dos valores do dado é: "+ media);
		System.out.println("O maior valor jogado do total do dado é: "+valorMaior);
	}

}
