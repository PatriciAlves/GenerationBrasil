package MatrizesVetores;

import java.util.Scanner;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x,y;
		int soma=0, somaDiag=0;
		int matriz[][] = new int[3][3];
		
		for(x=0;x<3;x++) {
			for(y=0;y<3;y++) {
				System.out.println("Digite os valores da matriz 3X3: ");
				matriz[x][y]= ler.nextInt();
				soma=soma + matriz[x][y];
			}
		}
		for(x=0;x<3;x++) {
			somaDiag = matriz[0][0] + matriz[1][1] + matriz[2][2];
		}
		System.out.println("A soma da diagonal principal é: " + somaDiag);
		System.out.println("A soma dos vetores é: " + soma);
		
		
	}
}
