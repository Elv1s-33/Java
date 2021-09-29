package biblioteca;
public class classMetodoCompartilhado{
	
	private static int valor = 5;
	public static double valorQuadrado() {
		return Math.pow(valor, 2);
	}
	public static int valorDobro() {
		return valor * 2;
	}
}