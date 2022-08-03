package cl.fsj.infoclub;

import java.util.ArrayList;

public class EjercicioUno {

	public static void main(String[] args) {
		
		//ArrayList original con 10 marcas instanciadas 
		
		ArrayList<String> marcas = new ArrayList<>();
		
		marcas.add("Fiat");
		marcas.add("Free");
		marcas.add("Yupi");
		marcas.add("Feriadeldisco");
		marcas.add("Chilectra");
		marcas.add("AlmacenesParis");
		marcas.add("Mungomagico");
		marcas.add("Alerce");
		marcas.add("SaloSA");
		marcas.add("Calaf");
		
		System.out.println(marcas);
		System.out.println("***************");
		
		//Agregar tres marcas al listado
		
		ArrayList<String> otrasMarcas = new ArrayList<>();
		
		otrasMarcas.add("Blokbaster");
		otrasMarcas.add("Carrefour");
		otrasMarcas.add("Jetix");
		marcas.addAll(otrasMarcas); // agrego al primer ArrayList los tres nuevos elementos 
		System.out.println(marcas);
		System.out.println("***************");
		
		
		// cambiar nombre en la lista por estar mal escrito, utilizando metodo SET 
		
		marcas.set(10, "BlockBuster");
		System.out.println(marcas);
		System.out.println("*************");
		
		// eliminar elemento de la lista utilizando metodo remove()

		marcas.remove(11);
		System.out.println(marcas);
		System.out.println("************");
		
		marcas.remove("Carrefour");
		
		//agregar nuevas maras 
		
		ArrayList<String> posiblesMarcas = new ArrayList<>();
		posiblesMarcas.add("LibreriaNacional");
		posiblesMarcas.add("Mampato");
		posiblesMarcas.add("Telmex");
		posiblesMarcas.add("Smartcom");
		marcas.addAll(posiblesMarcas);
		System.out.println(marcas);
		System.out.println("*************");
		
		
		//Contar cúantos elemetos tiene el listado
		
		System.out.println(marcas.size());
		System.out.println("************");
		
		
	
	}

}
