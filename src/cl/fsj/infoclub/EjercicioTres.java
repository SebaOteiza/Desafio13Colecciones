package cl.fsj.infoclub;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EjercicioTres {

	public static void main(String[] args) {

		Map<String, Integer> golosinas = new TreeMap(); //imprime ordenado de manera ordenada, alfabéticamente 

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

		Map<String, Integer> filtro = golosinas.entrySet().stream().filter(map -> map.getValue() < 100) // filtrado por
																										// valores
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

		System.out.println("Golosinas menores de 100: " + filtro); //esto me imprime las golosinas que cuestan menos de $100 

		
	}

}

