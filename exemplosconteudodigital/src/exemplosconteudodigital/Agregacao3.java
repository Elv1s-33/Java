package exemplosconteudodigital;

public class Agregacao3 {
	public class PlacaVideo{
		public String tipoCooler;
		
		public PlacaMae pm = new PlacaMae();
		public Placavideo pv = new PlacaVideo();
		public HD hd = new HD();
		public Memoria me = new Memoria();
		
	}

	public class Notebook{
		public double peso;
		
		public PlacaMae pm = new PlacaMae();
		public PlacaVideo pv = new PlacaVideo();
		public HD hd = new HD();
		public Memoria me = new Memoria();
		
	}
	public class Servidor{
		public PlacaMae pm = new PlacaMae();
		public PlacaVideo pv  = new PlacaVideo();
		public HD hd = new HD();
		public Memoria me = new Memoria();
		
	}
}
