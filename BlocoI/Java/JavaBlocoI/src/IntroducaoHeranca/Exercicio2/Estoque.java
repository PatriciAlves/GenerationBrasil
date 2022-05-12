package IntroducaoHeranca.Exercicio2;

public class Estoque {

	private String produto;
	private String marca;
	private String tamanho;
	private String cor;
	private Double pre�o;

	public Estoque() {
	
	}

	public Estoque(String produto, String marca, String tamanho, String cor, Double pre�o) {
		super();
		this.produto = produto;
		this.marca = marca;
		this.tamanho = tamanho;
		this.cor = cor;
		this.pre�o = pre�o;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPre�o() {
		return pre�o;
	}

	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
	}

	@Override
	public String toString() {
		return "Estoque [produto=" + produto + ","
				+ " marca=" + marca + 
				", tamanho=" + tamanho + 
				", cor=" + cor + ", pre�o="
				+ pre�o + "]";
	}

}
