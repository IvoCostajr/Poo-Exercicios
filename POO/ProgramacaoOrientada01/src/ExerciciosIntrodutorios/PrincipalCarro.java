package ExerciciosIntrodutorios;

public class PrincipalCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Carro("marcax", "branco", "0000", 80, 5, false, true);
		Carro c2 = new Carro("marcay", "preto", "1111", 0, 0, true, false);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		c1.mudarMarcha(0);
		c1.setVelocidade_Atual(0);
		c1.parar();
		c1.setFreio_De_Mao_Puxado(true);
		c2.mudarMarcha(5);
		c2.setVelocidade_Atual(120);
		c2.ligar();
		c2.setFreio_De_Mao_Puxado(false);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
