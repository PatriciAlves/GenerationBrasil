package IntroducaoPOO.Exercicio1;

import java.util.Scanner;

public class CadastroCliente {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("       CADASTRO CLIENTE      ");
		System.out.println("=============================");
		
		System.out.println("Digite o nome: ");
		cliente1.setNome(ler.nextLine());
		
		System.out.println("Digite o sobrenome: ");
		cliente1.setSobrenome(ler.nextLine());
		
		System.out.println("Digite o Endereço: ");
		cliente1.setEndereco(ler.nextLine());
		
		System.out.println("Digite a idade: ");
		cliente1.setIdade(Integer.parseInt(ler.nextLine()));
		
		System.out.println("Digite o número telefone: ");
		cliente1.setTelefone(Integer.parseInt(ler.nextLine()));
		
		System.out.println("Digite o número do celular: ");
		cliente1.setCelular(Integer.parseInt(ler.nextLine()));
		
		System.out.println("=============================");
		System.out.println("  DADOS CLIENTE CADASTRADO  ");
		System.out.println("=============================");
		
		
		cliente1.cliente();
		
		ler.close();
	}

}
