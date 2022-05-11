package IntroducaoPOO.Exercicio2;

import java.util.Scanner;

public class CadastroAviao {
	
	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("       CADASTRO AVIAO     ");
		System.out.println("=============================");
		
		System.out.println("Digite o modelo(Ex: Airbus 380, Boeing 777... : ");
		aviao1.setModelo(ler.nextLine());
		
		System.out.println("Digite a companhia: ");
		aviao1.setCompanhia(ler.nextLine());
		
		System.out.println("Digite a capacidade de passageiros: ");
		aviao1.setPassageirosQtd(Integer.parseInt(ler.nextLine()));
		
		System.out.println("Digite o combustivel( Gasolina || Querosene): ");
		aviao1.setCombustivel(ler.nextLine());
		
		System.out.println("Digite o tipo de avião(Ex: eletricidade, turboélice, Jato ...): ");
		aviao1.setTipo(ler.nextLine());
		
		System.out.println("Digite a velocidade km/h:  ");
		aviao1.setVelocidade(Float.parseFloat(ler.nextLine()));
		
		
		System.out.println("=============================");
		System.out.println("  DADOS DO AVIÃO CADASTRADO  ");
		System.out.println("=============================");
		
		
		
		
		aviao1.aviao();
		ler.close();
		
	}

}
