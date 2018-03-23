package ExecicioAula05;

public class Diretor extends Funcionario implements Autenticavel {
	private int senha;
	public Diretor(String nome, int cpf, int idade,int salario,int senha) {
		super(nome,cpf,idade,salario);
		this.senha = senha;
	}
	public boolean autentica(int senha) {
		if(this.senha != senha)
			return false;
		else
			return true;
	}
}
