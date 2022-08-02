package cl.fsj.infoclub;

import java.util.LinkedList;
import java.util.Queue;

public class EjercicioCuatro {
	
	public static void main(String[] args) {
		
		//lista en metodo Queue
		
		Queue<String> juegos = new LinkedList();
		
		juegos.add("Tombo");
		juegos.add("Congelado");
		juegos.add("Quemaditas");
		juegos.add("Cachipún");
		juegos.add("Pillarse");
		
		System.out.println(juegos);
		System.out.println("*************");
		System.out.println(juegos.size());
		
		
	}

}
