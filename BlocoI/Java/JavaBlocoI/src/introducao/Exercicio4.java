package introducao;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/


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
