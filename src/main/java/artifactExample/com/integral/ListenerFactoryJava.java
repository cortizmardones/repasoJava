package artifactExample.com.integral;

import java.util.ArrayList;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ListenerFactoryJava {

	private static final Logger LOGGER = LogManager.getLogger(ListenerFactoryJava.class);

	public static void main(String[] args) {
		
		// DECLARAR VARIABLE
		String nombre = "Emilia";
		String carrera = "Ingeniería en informática";
		String edad = "18";
		
		System.out.println("Hola , " + nombre + " , estas estudiando " + carrera + " y tu edad es " + edad);
		
		try {
			
			String numOC = "125CF48_3246";
			LOGGER.info(returnStringWithoutLetters(numOC));
			LOGGER.info(returnLength(numOC));
			LOGGER.info(returnLength(returnStringWithoutLetters(numOC)));
			Persona persona1 = new Persona("Carlos", "Ortiz");
			Persona persona2 = new Persona("Walter", "Tejeda");
			Persona persona3 = new Persona("Claudio", "Sandoval");
			Persona persona4 = new Persona("Esteban", "Bustos");
			ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
			listaPersonas.add(persona1);
			listaPersonas.add(persona2);
			listaPersonas.add(persona3);
			listaPersonas.add(persona4);
			LOGGER.info("Hay: " + Persona.cantidad + " instancias de la clase Persona");
			
		} catch (NumberFormatException e) {
			LOGGER.error("NumberFormatException", e);
		} catch (Exception e) {
			LOGGER.error("Error durante el proceso", e);
		}
	}
	
	//ENTRADA : 		125CF48_3246
	//SALIDA ESPERADA: 	125483246
	public static String returnStringWithoutLetters(String input) {
		String output = "";
		char[] arrayCharInput = input.toCharArray();
		for (char iterator : arrayCharInput) {
			if (Character.isDigit(iterator)) {
				output = output + iterator;
			}
		}
		return output;
	}

	public static String returnLength(String input) {
		return "La entrada '" + input + "' contiene '" + input.length() + "' carácteres";
	}

}
