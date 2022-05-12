package LojaEstoque;

public class Estoque {
	
	private String produto;
	private String marca;
	private boolean nacional;
	private double preco;
	
	
	
	
	public Estoque() {
	}
	
	
	public Estoque(String produto, String marca, boolean nacional, double preco) {
		super();
		this.produto = produto;
		this.marca = marca;
		this.nacional = nacional;
		this.preco = preco;
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
	public boolean isNacional() {
		return nacional;
	}
	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Estoque [produto=" + produto + ", marca=" + marca + ", nacional=" + nacional + ", preco=" + preco + "]";
	}
	
	
	

}
