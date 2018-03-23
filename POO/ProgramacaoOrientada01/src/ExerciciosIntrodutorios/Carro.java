package ExerciciosIntrodutorios;

public class Carro {
	private String marca;
	private String cor;
	private String placa;
	private int velocidade_Atual;
	private int marcha_Atual;
	private boolean freio_De_Mao_Puxado;
	private boolean chave_Virada;

	public Carro(String marca, String cor, String placa, int velocidade_Atual, int marcha_Atual,
			boolean freio_De_Mao_Puxado, boolean chave_Virada) {
		this.marca = marca;
		this.cor = cor;
		this.placa = placa;
		this.velocidade_Atual = velocidade_Atual;
		this.marcha_Atual = marcha_Atual;
		this.freio_De_Mao_Puxado = freio_De_Mao_Puxado;
		this.chave_Virada = chave_Virada;
	}

	public void ligar() {
		chave_Virada = true;
	}

	public void acelerarAte(int velocidadeN) {
		velocidade_Atual = velocidadeN;

	}

	public void mudarMarcha(int marchaAtualN) {
		marcha_Atual = marchaAtualN;
	}
	public void parar() {
		chave_Virada = false;
	}

	public String toString() {
		return "Carro [marca=" + marca + ", cor=" + cor + ", placa=" + placa + ", velocidade_Atual=" + velocidade_Atual
				+ ", marcha_Atual=" + marcha_Atual + ", freio_De_Mao_Puxado=" + freio_De_Mao_Puxado + ", chave_Virada="
				+ chave_Virada + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getVelocidade_Atual() {
		return velocidade_Atual;
	}

	public void setVelocidade_Atual(int velocidade_Atual) {
		this.velocidade_Atual = velocidade_Atual;
	}

	public int getMarcha_Atual() {
		return marcha_Atual;
	}

	public void setMarcha_Atual(int marcha_Atual) {
		this.marcha_Atual = marcha_Atual;
	}

	public boolean getFreio_De_Mao_Puxado() {
		return freio_De_Mao_Puxado;
	}

	public void setFreio_De_Mao_Puxado(boolean freio_De_Mao_Puxado) {
		this.freio_De_Mao_Puxado = freio_De_Mao_Puxado;
	}

	public boolean getChave_Virada() {
		return chave_Virada;
	}

	public void setChave_Virada(boolean chave_Virada) {
		this.chave_Virada = chave_Virada;
	}
}
