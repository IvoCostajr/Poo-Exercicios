package PraticandoHeranca;

public class Cliente extends Pessoa {
	private double saldo;
	private double limite;
	private double chequeEspecial;
	public Cliente(String nome,int idade,int cpf,double saldo,double limite,double chequeEspecial) {
		super(nome,idade,cpf);
		this.saldo= saldo;
		this.limite =limite;
		this.chequeEspecial = chequeEspecial;
	}
	public void saca(double valor) {
		saldo-= valor;
	}
	public void depositar (double valor) {
		saldo+= valor;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	
	
}
