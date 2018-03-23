package EnumTest;

public enum EnumTest {
	CARRO,MOTO,BICICLETA,BARCO,AVIAO;
	
	private static void imprimirTransporte(EnumTest valor) {
		switch(valor) {
		case CARRO:
			System.out.println("Carro");
			break;
		case MOTO:
			System.out.println("Moto");
			break;
		case BICICLETA:
			System.out.println("Bicicleta");
			break;
		case BARCO:
			System.out.println("Barco");
			break;
		case AVIAO:
			System.out.println("Avião");
			break;
		}
	}
	private static void usandoEnum() {
		EnumTest carro = EnumTest.CARRO;
		EnumTest moto = EnumTest.MOTO;
		EnumTest bicicleta= EnumTest.BICICLETA;
		EnumTest barco = EnumTest.BARCO;
		EnumTest aviao = EnumTest.AVIAO;
		
		System.out.println("Utilizando Enum em java");
		imprimirTransporte(carro);
		imprimirTransporte(moto);
		imprimirTransporte(bicicleta);
		imprimirTransporte(barco);
		imprimirTransporte(aviao);
	}	
	public static void main(String args[]) {
		usandoEnum();
	}
	
	
	
}
