package IntroducaoPOO.Exercicio3;

public class Notebook {

	private String marca;
	private String modelo;
	private String sistemaOp;
	private String memoria;
	private String tela;
	private String resolucao;
	private String hd;
	private String webcam;
	private String bateria;
	private String infoExtra;
	private float preco;

	public Notebook() {

	}

	public Notebook(String marca, String modelo, String sistemaOp, String memoria, String tela, String resolucao,
			String hd, String webcam, String bateria, String infoExtra, float preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.sistemaOp = sistemaOp;
		this.memoria = memoria;
		this.tela = tela;
		this.resolucao = resolucao;
		this.hd = hd;
		this.webcam = webcam;
		this.bateria = bateria;
		this.infoExtra = infoExtra;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSistemaOp() {
		return sistemaOp;
	}

	public void setSistemaOp(String sistemaOp) {
		this.sistemaOp = sistemaOp;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}

	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}

	public String getWebcam() {
		return webcam;
	}

	public void setWebcam(String webcam) {
		this.webcam = webcam;
	}

	public String getBateria() {
		return bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

	public String getInfoExtra() {
		return infoExtra;
	}

	public void setInfoExtra(String infoExtra) {
		this.infoExtra = infoExtra;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void notebook() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Memória: " + this.memoria);
		System.out.println("Sistema operacional: " + this.sistemaOp);
		System.out.println("Tamanho da tela: " + this.tela);
		System.out.println("Resolução: " +this.resolucao);
		System.out.println("HD: " + this.hd);
		System.out.println("Webcam: " + this.webcam);
		System.out.println("Bateria: " + this.bateria);
		System.out.println("Preço: " + this.preco);
		System.out.println("Descrição:" + this.infoExtra);
		
	}

}
