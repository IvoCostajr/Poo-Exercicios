package ExecicioAula05;

public class Funcionario extends PessoaFisica {
	private int salario;
	public Funcionario(String nome,int salario,int cpf,int idade) {
		super(nome,cpf,idade);
		this.salario = salario;
	}
	public void getBonificacao() {
		
	}
	public void getSalario() {
		
	}
	public double setSalario(int novoSalario) {
		this.salario = novoSalario;
		return salario; 
	}
}
