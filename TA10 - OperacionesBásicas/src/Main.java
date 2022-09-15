import java.util.InputMismatchException;
import java.util.Scanner;

class OperacionesBasicas {
	//Atributos de la clase OperacionesBásicas
	static int numero1;
	static int numero2;
	static double resultado;
	
	//Método para sumar 2 números
	public static double sumarNumeros(int numero1, int numero2) {
		
		resultado = numero1 + numero2;
		
		return resultado;
	}
	
	//Método para restar 2 números
	public static double restarNumeros(int numero1, int numero2) {
		
		resultado = numero1 - numero2;
		
		return resultado;
	}
	
	//Método para multiplicar 2 números
	public static double multiplicarNumeros(int numero1, int numero2) {
		
		resultado = numero1 * numero2;
		
		return resultado;
	}
	
	//Método para dividir 2 números
	public static double dividirNumeros(int numero1, int numero2) {
		
		resultado = numero1 / numero2;
		
		return resultado;
	}
	
	//Método para hacer la potencia de un número
	public static double potenciarNumero(int numero1, int numero2) {
		
		resultado = Math.pow(numero1, numero2);
		
		return resultado;
	}
	
	//Método para hacer la raíz cuadrada de un número
	public static double raizCuadradaNumero(int numero1) {
		
		resultado = Math.sqrt(numero1);
		
		return resultado;
	}
	
	//Método para hacer la raíz cúbica de un número
	public static double raizCubicaNumero(int numero1) {
		
		resultado = Math.cbrt(numero1);
		
		return resultado;
	}
}

public class Main {

	public static void main(String[] args) {
		//Variables de clase main
		Scanner teclado = new Scanner (System.in);
		String opcion, respuesta = "Si";
		int numero1, numero2;
		boolean salirBucle = false;
		
		System.out.println("CALCULADORA BÁSICA");
		System.out.println("----------------------------------");
		//Mientras la respuesta del usuario sea Sí y no se quiera salir del bucle...
		//Preguntamos al usuario las operaciones que quiere realizar y llamamos a los métodos de la clase OperacionesBásicas
		//En caso de que introduzca una opción érronea, sea avisará y volverá a preguntar
		//En caso de que introduzca un String en una entrada Int, saltará la excepción InputMissmatchException
		while (respuesta.equalsIgnoreCase("Si") && salirBucle == false) {
			System.out.println("\nQué operación quieres realizar? (Opciones: Suma, Resta, Multi, Division, Potencia, RaizCuadrada, RaizCubica)");
			opcion = teclado.next();
			try {
				if(opcion.equalsIgnoreCase("Suma") || opcion.equalsIgnoreCase("Resta") || opcion.equalsIgnoreCase("Suma") ||
						opcion.equalsIgnoreCase("Multi") || opcion.equalsIgnoreCase("Division") || opcion.equalsIgnoreCase("Potencia") ||
						opcion.equalsIgnoreCase("RaizCuadrada") || opcion.equalsIgnoreCase("RaizCubica")) {
					
					switch(opcion) {
					case "Suma":
						System.out.println("\nCon qué 2 números quieres realizar la suma? (Formato: num1 num2)");
						numero1 = teclado.nextInt();
						numero2 = teclado.nextInt();
						
						System.out.println("Resultado: " + OperacionesBasicas.sumarNumeros(numero1, numero2));
						
						System.out.println("\nQuieres seguir usando la calculadora?");
						respuesta = teclado.next();
						break;
					case "Resta":
						System.out.println("\nCon qué 2 números quieres realizar la resta? (Formato: num1 num2)");
						numero1 = teclado.nextInt();
						numero2 = teclado.nextInt();
						
						System.out.println("Resultado: " + OperacionesBasicas.restarNumeros(numero1, numero2));
						
						System.out.println("\nQuieres seguir usando la calculadora?");
						respuesta = teclado.next();
						break;
					case "Multi":
						System.out.println("\nCon qué 2 números quieres realizar la multiplicación? (Formato: num1 num2)");
						numero1 = teclado.nextInt();
						numero2 = teclado.nextInt();
						
						System.out.println("Resultado: " + OperacionesBasicas.multiplicarNumeros(numero1, numero2));
						
						System.out.println("\nQuieres seguir usando la calculadora?");
						respuesta = teclado.next();
						break;
					case "Division":
						System.out.println("\nCon qué 2 números quieres realizar la división? (Formato: num1 num2)");
						numero1 = teclado.nextInt();
						numero2 = teclado.nextInt();
						
						System.out.println("Resultado: " + OperacionesBasicas.dividirNumeros(numero1, numero2));
						
						System.out.println("\nQuieres seguir usando la calculadora?");
						respuesta = teclado.next();
						break;
					case "Potencia":
						System.out.println("\nCon qué 2 números quieres realizar la potencia? (Formato: num1 num2)");
						numero1 = teclado.nextInt();
						numero2 = teclado.nextInt();
						
						System.out.println("Resultado: " + OperacionesBasicas.potenciarNumero(numero1, numero2));
						
						System.out.println("\nQuieres seguir usando la calculadora?");
						respuesta = teclado.next();
						break;
					case "RaizCuadrada":
						System.out.println("\nCon qué número quieres realizar la raíz cuadrada? (Formato: num1)");
						numero1 = teclado.nextInt();
						
						System.out.println("Resultado: " + OperacionesBasicas.raizCuadradaNumero(numero1));
						
						System.out.println("\nQuieres seguir usando la calculadora?");
						respuesta = teclado.next();
						break;
					case "RaizCubica":
						System.out.println("\nCon qué número quieres realizar la raíz cúbica? (Formato: num1)");
						numero1 = teclado.nextInt();
						numero2 = teclado.nextInt();
						
						System.out.println("Resultado: " + OperacionesBasicas.raizCubicaNumero(numero1));
						
						System.out.println("\nQuieres seguir usando la calculadora?");
						respuesta = teclado.next();
						break;
					}
				} else {
					System.out.println("Has introducido una opción errónea!");
					continue;
				}

			} catch (InputMismatchException ex) {
				System.out.println("Has introducido letras en vez de números!");
				teclado.next();
				teclado.next();
			}
		}
		
		System.out.println("\nFIN DEL PROGRAMA");

	}

}
