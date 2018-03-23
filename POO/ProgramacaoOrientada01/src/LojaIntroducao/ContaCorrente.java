package LojaIntroducao;

public class ContaCorrente {
	private int saldo;
	private int chequeEspecial;

	public ContaCorrente(int saldo, int chequeEspecial) {
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
	}

	public void debitar(int valorDebito)throws Exception {
		if(valorDebito<=0)
			throw new Exception("N�o podemos debitar um valor negativo ou zero!Valor: "+ valorDebito);
		else if(valorDebito>(saldo+chequeEspecial))
			throw new Exception("Opera��o negada!O cliente n�o tem saldo suficiente, o saldo atual � :" + (saldo+chequeEspecial));
		else
			saldo -= valorDebito;
	}

	public void creditar(int valorCredito) {
		saldo += valorCredito;
	}

	public String toString() {
		return "ContaCorrente [saldo=" + saldo + ", chequeEspecial=" + chequeEspecial + "]";
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(int chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
}
