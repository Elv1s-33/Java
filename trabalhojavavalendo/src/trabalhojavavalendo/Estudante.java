package trabalhojavavalendo;

public class Estudante {

	public int matricula;
	public String nome;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estudante(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Estudante [matricula=" + matricula + ", nome=" + nome + "]";
	}
}
