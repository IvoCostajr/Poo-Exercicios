package ExecicioAula05;

public class Gerente extends Funcionario implements Autenticavel {
	private int senha;
	private int numDeFuncionariosGerenciados;
	public Gerente(String nome,int cpf,int idade,int salario,int senha,int numDeFuncionariosGerenciados) {
		super(nome,cpf,idade,salario);
		this.senha = senha;
		this.setNumDeFuncionariosGerenciados(numDeFuncionariosGerenciados);
	}
	public boolean autentica(int senha) {
		if(this.senha != senha)
			return false;
		else
			return true;
	}
	public int getNumDeFuncionariosGerenciados() {
		return numDeFuncionariosGerenciados;
	}
	public void setNumDeFuncionariosGerenciados(int numDeFuncionariosGerenciados) {
		this.numDeFuncionariosGerenciados = numDeFuncionariosGerenciados;
	}
}
