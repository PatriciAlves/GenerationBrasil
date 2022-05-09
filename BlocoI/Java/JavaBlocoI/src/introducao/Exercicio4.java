package introducao;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/


public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		
		System.out.println("===========================================");
		System.out.println("   PROGRAMA CLASSIFICADOR DE PAR OU IMPAR   ");
		System.out.println("============================================");
		
		System.out.println("Digite um numero inteiro: ");
		n=ler.nextInt();
		
		if(n%2 == 1) {
			System.out.println("IMPAR");
		}else {
			System.out.println("PAR");
		}
	}

}
