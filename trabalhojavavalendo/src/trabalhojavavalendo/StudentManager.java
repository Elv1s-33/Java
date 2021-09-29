package trabalhojavavalendo;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;


public class StudentManager {

	public static void main(String[] args) {
		
		Estudante al1 = new Estudante(2067, "Elvis Oliveira");
		Estudante al2 = new Estudante(2076, "Carol Bernardo");
		
		HashMap<Estudante, String> alHashMap = new HashMap<>();
		alHashMap.put(al1, "nota: 10");
		alHashMap.put(al2, "nota: 8");
	
		
		for(Map.Entry<Estudante, String> entry : alHashMap.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
			
		}

	}

}
