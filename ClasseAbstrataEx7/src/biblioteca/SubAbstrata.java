package biblioteca;

public class SubAbstrata extends Abstrata{
	public double calculaImc(double peso, double altura) {
		double imc = peso / Math.pow(altura, 2);
		return imc;
		
	}
	public boolean maiorIdade() {
		if this.getIdade()>=18){
			return true;			
		}
		else {
			return false;
		}
	}
	public void imprimir() {
		System.out.println("nome: " + super.getNome());
		System.out.println("Idade"+ super.getIdade());
		System.out.println("peso"+ super.getPeso());
		System.out.println("Altura: " + super.getAltura());
	}

}
