package aplicacao;
import biblioteca.classMetodoCompartilhado;
public class Exemplo3 {
	public static void main(String[] args) {
		System.out.println("System.out.println é um método estático compartilhado");
		System.out.println("Uso do método Math.pow para potência" + Math.pow(2, 3));
		System.out.println("Também utilizamos em nossas conversões: ");
		String valor = "1000";
		System.out.println("Double.parseDouble(valor):" + Double.parseDouble(valor));
		System.out.println("Integer.parseInt(valor): " + java.lang.Integer.parseInt(valor));
		System.out.println("Dobro do valor: "+ classMetodoCompartilhado.valorDobro());
		System.out.println("Quadrado do valor:" + classMetodoCompartilhado.valorQuadrado());
	}
}