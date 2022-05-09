package introducao;

import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente.

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int a, b, c;
		
		System.out.println("====================================");
		System.out.println("    PROGRAMA DE ORDEM CRESCENTE    ");
		System.out.println("====================================");

		System.out.println("Digite primeiro numero inteiro: ");
		a = leia.nextInt();
		System.out.println("Digite segundo numero inteiro: ");
		b = leia.nextInt();
		System.out.println("Digite terceiro numero inteiro: ");
		c = leia.nextInt();

		if (a < b) {
			if (b < c) {
				System.out.println( a + " - " + b + " - " + c);
			}else if(a < c) {
				System.out.println(a + " - " + c + " - " + b);
				
			}else {
				System.out.println(c + " - " + a + " - " + b);
			}
			
		}else if (b < c) {
			if (a < c) {
				System.out.println( b + " - " + a + " - " + c);
			}else if(a < c) {
				System.out.println(b + " - " + c + " - " + a);
				
			}else {
				System.out.println(c + " - " + b + " - " + a);
			}
		
		}
	}

}
