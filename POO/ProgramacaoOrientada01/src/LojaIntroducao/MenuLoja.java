package LojaIntroducao;

public class MenuLoja {
	public static void main(String[] args) {
		ContaCorrente cliente = new ContaCorrente(100, 100);
		ContaCorrente loja = new ContaCorrente(1000, 100);
		loja.creditar(100);
		loja.creditar(150);
		System.out.println(loja.toString());

	}
}
