package biblioteca;

public interface Controle {
	int potenciamaxima = 350;
	int potenciaminima = 120;
	public int getPotenciaMaxima();
	public int getPotenciaMinima();
	
	void assar(int potencia);
	void aquecer(int potencia);
	void desligar();

}
