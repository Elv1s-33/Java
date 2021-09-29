package exemplosconteudodigital;

public class AgregacaoParticionameno4 {

	

}
public class Memoria{
	public String marca, modelo, tipo;
	public double preco;
	public int capacidade;
	
	public String getMarca() {
		return marca;
	
	}
	public void setMarca(String ma) {
		if(!ma.isEmpty()) {
			marca = ma;
			
		}
		
	}
	public String getModelo(String mo) {
		return modelo;
	}
	public void setModelo(String mo) {
		if(!mo.isEmpty()) {
			modelo = mo;
			
		}
	}
	public String getTipo() {
		return tipo;
		
	}
	public void setTipo( String ti) {
		if(!ti.isEmpty()) {
			tipo = ti;
		}
	}
	public double getPreco() {
		return preco;
		}
	public void setPreco(double pr) {
		if(pr>0) {
			preco = pr;
			
		}
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int ca) {
		if(ca>0) {
			capacidade = ca;
			
		}
	}
	}

public class Desktop{
	public String tipoCooler;
	
	public PlacaMae pc = new PlacaMae();
	public PlacaVideo pv = new PlacaVideo();
	public HD hd = new HD();
	public Memoria slot0 = new Memoria();
	public Memoria slot1 = new Memoria();
	public Memoria slot2 = new Memoria();
	public Memoria slot3 = new Memoria();
}

public class AppAgregacao{
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.slot0.setMarca("Samsung");
		desk.slot0.setCapacidade(16);
		desk.slot1.setMarca("Kingston");
		desk.slot1.setCapacidade(8);
		desk.slot2.setMarca("Sandisk");
		desk.slot2.setCapacidade(4);
		desk.slot3.setMarca("Crucial");
		desk.slot3.setCapacidade(2);
		
		System.out.println("Memória total: " + (desk.slot0.getCapacidade() + (desk.slot1.getCapacidade() + (desk.slot2.getCapacidade() + (desk.slot3.getCapacidade())))))
	}
}



