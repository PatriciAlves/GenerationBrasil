package IntroducaoPOO.Exercicio3;

import java.util.Scanner;

public class CadastroNotebook {
	public static void main(String[] args) {
		
		Notebook note1 = new Notebook();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("       CADASTRO NOTEBOOK     ");
		System.out.println("=============================");
		
		System.out.println("Digite a marca(Ex: Asus, Lenovo...): ");
		note1.setMarca(ler.nextLine());
		
		System.out.println("Digite o modelo(Ex: t440, E330...): ");
		note1.setModelo(ler.nextLine());
		
		System.out.println("Digite o sistema operacional(Ex: Windowns 10, Linux ...): ");
		note1.setSistemaOp(ler.nextLine());
		
		System.out.println("Digite a quantidade de polegadas da tela(Ex: 15''): ");
		note1.setTela(ler.nextLine());
		
		System.out.println("Digite a memoria RAM(Ex: 8GB, 16GB...): ");
		note1.setMemoria(ler.nextLine());
		
		System.out.println("Digite a capacidade do HD(Ex: 120SSD): ");
		note1.setHd(ler.nextLine());
		
		System.out.println("Digite a resolução da Webcam (Ex: 1080 X 720): ");
		note1.setWebcam(ler.nextLine());
		
		System.out.println("Digite a capacidade da bateria(Ex: 65w, 4400 a 5200 mAh ): ");
		note1.setBateria(ler.nextLine());
		
		System.out.println("Digite o preço:  ");
		note1.setPreco(Float.parseFloat(ler.nextLine()));
		
		System.out.println("Digite descrição extras: ");
		note1.setInfoExtra(ler.nextLine());
		
		System.out.println("=============================");
		System.out.println("  DADOS NOTEBOOK CADASTRADO  ");
		System.out.println("=============================");
		
		
		note1.notebook();
		
		ler.close();
	}

}
