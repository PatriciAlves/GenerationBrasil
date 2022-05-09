package introducao;

import java.util.Scanner;
//Faça um programa que receba três inteiros e diga qual deles é o maior.

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("====================================");
		System.out.println("   IDENTIFICADOR DE  MAIOR NUMERO ");
		System.out.println("====================================");

		System.out.println("Digite o primeiro valor: ");
		a = ler.nextInt();
		System.out.println("Digite o primeiro valor: ");
		b = ler.nextInt();
		System.out.println("Digite o primeiro valor: ");
		c = ler.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("O maior numero digitado foi: " + a);
			
		}else if(b>=a && b>=c){
			System.out.println("O maior numero digitado foi: " + b);
			
		}else {
			System.out.println("O maior numero digitado foi: " + c);
		}
		
	}
}
