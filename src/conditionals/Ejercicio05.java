package conditionals;

import java.util.Scanner;

public class Ejercicio05 {

	/*	este ejercicio calcula el valor absoluto de un número que se solicita al usuario por teclado
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: num=1		RESULTADO: "El valor absoluto de 1 es 1"
	 * VALOR INTRODUCIDO: num=-1		RESULTADO: "El valor absoluto de -1 es 1"
	 * VALOR INTRODUCIDO: num=0		RESULTADO: "El valor absoluto de 0 es 0"
	 * VALOR INTRODUCIDO: num=a		RESULTADO: error
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);

		//variable que representa el dni y la letra que continua
		int num=0,abs=0;
		
		//pedimos que introduzcamos el numero
		System.out.println("Escribe el numero de 8 cifras");
		
		//introducimos el valor en pantalla
		num=sc.nextInt();
		

        // Calcula el valor absoluto usando operador ternario
        abs = (num >= 0) ? num : -num;

        // Muestra el resultado por pantalla
        System.out.println("El valor absoluto de " + num + " es " + abs);

		

		//cierre de scanner
		sc.close();
		
	}

}
