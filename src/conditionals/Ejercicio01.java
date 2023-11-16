package conditionals;

import java.util.Scanner;

public class Ejercicio01 {

	/* este programa te permite escribir un numero entre 0 y 9999 y decir si ese numero es capicuo o no
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: num=1221		RESULTADO: El número introducido es capicúo
	 * VALOR INTRODUCIDO: num=121		RESULTADO: El número introducido es capicúo
	 * VALOR INTRODUCIDO: num=11		RESULTADO: El número introducido es capicúo
	 * VALOR INTRODUCIDO: num=1			RESULTADO: El número introducido es capicúo
	 * VALOR INTRODUCIDO: num=1224		RESULTADO: El número introducido no es capicúo
	 * VALOR INTRODUCIDO: num=12244		RESULTADO: El número introducido no es valido
	 * 
	 * 
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		

		// variable para guardar un número entero
		int num, uni, dec, cent, mill;
		
		
		// Le decimos al usuario que introduzca un número
		System.out.print("Introduce el número: ");

		
		// Comando para introducir el primer número
		num = sc.nextInt();
		
		
		//le sacamos las cifras al numero escrito para comprobar cada una de las cifras
		uni = num % 10;
		dec = num / 10;
		cent = num / 100;
		mill = num / 1000;

		//comprobar si el numero es positivo
		if(num>=0) {

			//
			if (num >= 0 && num < 10) {
				
				
				System.out.print("El número introducido es capicúo");
				
				
			} else if (num >= 10 && num < 100 && /*dec % 10 == uni*/ /*si el numero es multiplo de 11, es capicuo*/num%11==0) {
				
				
				System.out.print("El número introducido es capicúo");
				
				
			} else if (num >= 100 && num < 1000 && cent % 10 == uni) {
				
				
				System.out.print("El número introducido es capicúo");
				
				
			} else if (num >= 1000 && num < 10000 && mill % 10 == uni && cent % 10 == dec % 10) {
				
				
				System.out.print("El número introducido es capicúo");
				
				
			} else if (num < 0 || num >= 10000) {
				
				
				System.out.print("El número introducido no es válido");
				
			
			} 
			//
			else {
				
				
				System.out.print("El número introducido no es capicúo");
			}
			
		}
		
		//si el número es negativo, decimos que el número que se ha introducido no es válido
		else {
			System.out.println("El número introducido no es válido");
		}
		
		
		
		
		

		//cierre de scanner
		sc.close();
		
	}

}
