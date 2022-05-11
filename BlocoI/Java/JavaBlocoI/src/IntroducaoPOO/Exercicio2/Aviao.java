package IntroducaoPOO.Exercicio2;

public class Aviao {

	private String modelo;
	private int passageirosQtd;
	private String companhia;
	private String combustivel;
	private String tipo;
	private float velocidade;
	
	
	public Aviao() {
		
	}
	
	public Aviao(String modelo, int passageirosQtd, String companhia, String combustivel, String tipo,
			float velocidade) {
		super();
		this.modelo = modelo;
		this.passageirosQtd = passageirosQtd;
		this.companhia = companhia;
		this.combustivel = combustivel;
		this.tipo = tipo;
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPassageirosQtd() {
		return passageirosQtd;
	}

	public void setPassageirosQtd(int passageirosQtd) {
		this.passageirosQtd = passageirosQtd;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public void aviao() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Companhia: " + this.companhia);
		System.out.println("Capacidade de passageiros: " + this.passageirosQtd);
		System.out.println("Combustivel: " + this.combustivel);
		System.out.println("Tipo do avião: " + this.tipo);
		System.out.println("Velocidade: " + this.velocidade);
	}

}
