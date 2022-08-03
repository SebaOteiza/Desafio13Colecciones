package cl.fsj.infoclub;

import java.util.Map;
import java.util.TreeMap;

public class EjercicioTres {

	public static void main(String[] args) {

		Map<String, Integer> golosinas = new TreeMap();

		golosinas.put("Chocman", 100);
		golosinas.put("Trululú", 100);
		golosinas.put("Centella", 100);
		golosinas.put("Kilate", 50);
		golosinas.put("Miti-miti", 30);
		golosinas.put("Traga Traga", 150);
		golosinas.put("Tabletón", 5);
		System.out.println(golosinas);
		System.out.println("**************");

		// filtrar elementos menores a 100

		golosinas.entrySet().stream().filter(golosinas.get(golosinas) < 100).forEach(System.out::print);

	}

}
