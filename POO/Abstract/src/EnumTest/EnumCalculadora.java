package EnumTest;

public enum EnumCalculadora {
	SOMA("+") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x+y;
		}
	},SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x-y;
		}
	},MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x*y;
		}
	},DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x/y;
		}
	};
	private String operacao;
	EnumCalculadora(String operacao){
		this.operacao=operacao;
	}
	
	public abstract double executarOperacao(double x ,double y);
	public String toString() {
		return this.operacao;
	}
	public static void main(String[] args) {
		double x = 2.0;
		double y = 3.0;
		
		for(EnumTest op:EnumTest.values()) {
			System.out.print(x +" ");
			System.out.print(op.toString()+" ");
			System.out.print(y +" = ");
			System.out.println(x +" ");
			
		}
	}
}
