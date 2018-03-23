package PraticandoHeranca;

public class Funcionario extends Pessoa {
	private double salario;

	public Funcionario(String nome, int idade, int cpf, double salario) {
		super(nome, idade, cpf);
		this.salario = salario;

	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void bonificacaoGerente(int porcentagem) {
		double calculo = salario * 0.10;
		this.salario += calculo;

	}

	public void bonificacaoSecretario(int porcentagem) {
		double calculo = salario * 0.05;
		this.salario += calculo;

	}

}
