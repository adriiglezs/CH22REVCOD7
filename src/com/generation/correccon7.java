//Iniciamos con cierto numero de datos, respecto a los paises y su capital
//el usuario debe escribir el nombre de x pais, si el dato se tiene, se 
//desglosa la capital correspondiente, en el caso contrario, le solicita al
//usuario que si se la puede proporcionar, en este momento, se suma ese pais 
//a los que si conoce

package com.generation;
//Comenzamos con la importacion de librerias
	import java.util.HashMap;
	import java.util.Scanner;

	public class correccon7 {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        //asignamos el tipo de datos correcto, correspondiente a un string
	   
	        HashMap<String, String> capitales = new HashMap<>();
	        capitales.put("Canada", "Ottawa");
	        capitales.put("Estados Unidos", "Washington DC");
	        capitales.put("Mexico", "Ciudad de Mexico");
	        capitales.put("Belice", "Belmopan");
	        capitales.put("Costa Rica", "San Jose");
	        capitales.put("El Salvador", "San Salvador");
	        capitales.put("Guatemala", "Ciudad de Guatemala");
	        capitales.put("Honduras", "Tegucigalpa");
	        capitales.put("Nicaragua", "Managua");
	        capitales.put("Panama", "Ciudad de Panama");

	        String c = "";//corregir palabra

	        do {
	            System.out.print("Escribe el nombre de un pais y te dire su capital (o 'salir' para terminar): ");
	            c = s.nextLine();//line

	            if (!c.equals("salir")) {
	                if (capitales.containsKey(c)) {//key
	                    System.out.println("La capital de " + c + " es " + capitales.get(c));
	                } else {
	                    System.out.print("No tengo ese Pais. Pero, dime ¿Cual es la capital de " + c + "?: ");
	                    String ca = s.nextLine();
	                    capitales.put(c, ca);
	                    System.out.println("Gracias, ahora e incorporado a "+c+" a la informacion que tengo");
	                }
	            }
	        } while (!c.equals("salir"));//while
	    }
	}

