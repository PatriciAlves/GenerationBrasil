package IntroducaoHeranca.Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class CadastroEstoque {

	public static void main(String[] args) {

		List<Estoque> lista = new ArrayList<>();
		
		Estoque a = new Estoque("Camisa", "Tshirt", "M", "Preto", 15.99);
		Estoque b = new Estoque("Calca", "Pants", "42", "Azul", 49.99);
		Estoque c = new Estoque("Tenis", "Okay", "37", "Branco", 45.00);

		lista.add(a);
		lista.add(b);
		lista.add(c);

		lista.forEach(System.out::println);

	}

}
