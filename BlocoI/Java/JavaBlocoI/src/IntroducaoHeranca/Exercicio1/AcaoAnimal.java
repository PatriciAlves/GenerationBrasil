package IntroducaoHeranca.Exercicio1;

public class AcaoAnimal {
	
	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica preg = new Preguica();
		
		System.out.println("---------------------------");
		System.out.println("   Caracteristica Animal   ");
		System.out.println("---------------------------");
		
		System.out.println("\nCachorro: ");
		cao.correr();
		cao.emitirSom();
		
		System.out.println("\nCavalo: ");
		cav.correr();
		cav.emitirSom();
		
		System.out.println("\nPreguiça: ");
		preg.acao();
		preg.emitirSom();
		
	}
	
	

}
