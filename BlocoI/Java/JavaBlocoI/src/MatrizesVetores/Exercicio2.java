package MatrizesVetores;

import java.util.Random;
import java.util.Scanner;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

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
		System.out.println(" O maior valor jogado no dado �: "+ maiorDado);
		System.out.println(" A media dos valores do dado �: "+ media);
		System.out.println("O maior valor jogado do total do dado �: "+valorMaior);
	}

}
