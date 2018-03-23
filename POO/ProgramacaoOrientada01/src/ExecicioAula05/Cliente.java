package ExecicioAula05;

public class Cliente extends PessoaFisica  implements Autenticavel {
	private double saldo;
	private double limite;
	private double chequeEspecial;

	public Cliente(String nome, int cpf, int idade, double saldo, double limite, double chequeEspecial) {
		super(nome, cpf, idade);
		this.saldo = saldo;
		this.limite = limite;
		this.chequeEspecial = chequeEspecial;
	}

	public void deposita(double valor) throws Exception {
		if (valor <= 0)
			throw new Exception("N�o podemos debitar um valor negativo ou zero!Valor: " + valor);
		else
			saldo += valor;
	}

	public void sacar(double valor) throws Exception {
		if (valor <= 0)
			throw new Exception("N�o podemos debitar um valor negativo ou zero!Valor: " + valor);
		else if (valor > (saldo + chequeEspecial))
			throw new Exception(
					"Opera��o negada!O cliente n�o tem saldo suficiente, o saldo atual � :" + (saldo + chequeEspecial));
		else
			saldo -= valor;
	}

	public String limiteConta(double valor )throws Exception {
		if(limite<valor)
			throw new Exception("N�o podemos continuar com esssa opera��o seu limite � :" +limite);
		else
			return "Opera��o relizada com sucesso";
	}
	public boolean autentica(int cpf,String nome) {
		if(this.getCpf() != cpf && this.getNome() != nome)
			return false;
		else
			return true;
	}

	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
