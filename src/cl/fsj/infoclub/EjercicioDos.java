package cl.fsj.infoclub;

import java.util.Set;
import java.util.TreeSet;

public class EjercicioDos {

	public static void main(String[] args) {
			
			//uso de método set para instanciar la lista y un TreeSet
			
			Set<String> invitados = new TreeSet<>();
			invitados.add("Daniel");
			invitados.add("Paola");
			invitados.add("Facundo");
			invitados.add("Pedro");
			invitados.add("Jacinta");
			invitados.add("FLorencia");
			invitados.add("JuanPablo");
			
			System.out.println(invitados);
			System.out.println("*************");
			//la impresión del TreeSet es  en orden alfabético
			
			//nuevo listado
			
			Set<String> posiblesInvitados = new TreeSet<>();
			posiblesInvitados.add("Jorge");
			posiblesInvitados.add("Francisco");
			posiblesInvitados.add("Marcos");
			invitados.addAll(posiblesInvitados);
			System.out.println(invitados);
			System.out.println("*************");
			
			
			//Eliminar un elemento de la lista 
			
			invitados.remove("Jorge");
			System.out.println(invitados);
			System.out.println("************");
		
	}

}
