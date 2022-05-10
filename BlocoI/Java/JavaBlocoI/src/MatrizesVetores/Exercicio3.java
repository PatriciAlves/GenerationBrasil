package MatrizesVetores;
/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/
public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				int valor =0;
					N1[linha][coluna]= valor;
					N2[linha][coluna]= valor;
			}
		}for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<6; coluna++) {
				M1[linha][coluna]= N1[linha][coluna] + N2[linha][coluna];
				M2[linha][coluna]= N1[linha][coluna] + N2[linha][coluna];
				
			}
		}
		System.out.println("A soma das matrizes N1 e N2 é: " + M1);
		System.out.println("A diferença entre as matrizes N1 e N2 é: " + M2);
	}

}
