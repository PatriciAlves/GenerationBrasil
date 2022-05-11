package IntroducaoPOO.Exercicio1;

public class Cliente {

	private String nome;
	private String sobrenome;
	private String endereco;
	private long telefone;
	private long celular;
	private int idade;

	public Cliente() {

	}

	public Cliente(String nome, String sobrenome, String endereco, long telefone, long celular, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.celular = celular;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void cliente() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Sobrenome: " + this.getSobrenome());
		System.out.println("Idade: "+ this.getIdade());
		System.out.println("Endereço: " + this.getEndereço());
		System.out.println("Telefone: "+this.getTelefone());
		System.out.println("Celular: "+ this.getCelular());
	}

	
	

}
