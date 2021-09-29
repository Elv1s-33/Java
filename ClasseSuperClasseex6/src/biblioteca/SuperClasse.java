package biblioteca;

public class SuperClasse {
	protected static int valor = 5;
	public int getValor() {
		return valor;
		
	}
	public void setValor(int valor) {
		SuperClasse.valor = valor;
	}
	public double valorQuadrado() {
		return Math.pow(valor, 2);
	}
	public int valorDobro() {
		return valor *2;
		
	}

}
