package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

	/* este ejercicio escribes un numero y te dice cuántos dígitos tiene un número introducido por teclado
	 * pruebas: 
	 * si escribes 23, te dice que tiene 2 digitos
	 * si escribes un numero del 1 al 9, te dice que tiene 1 digito
	 * si introduces 0 te sale el loop del do while para que escribas un numero mayor que 0
	 * si introduces un negativo hace lo mismo para que escribas un numero positivo mayor de 0
	 * si introduces una letra salta la excepcion y luego se activa el do while para que puedas escribir el numero otra vez
	 * 
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		

		int n=0,division,digitos=1;
		
		//comprobamos mediante do while si el numero que introducimos es negativo o positivo
		do {
			//mediante el try catch vemos si el valor introducido es un numero int o no
			try {
				//pide que escribaos numero
				System.out.println("Escribe el numero: ");
				
				n=sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("El valor introducido no es un numero");
			}
		}while(n<1);
		
		division=n;
		
		//comprobamos si el numero tiene mas de un digito
		while(division>9) {
			
			//aumentamos el numero de digitos
			digitos++;
			
			//se divide el numero de digitos
			division/=10;
			
		}
		
		if (n<10) {

			System.out.println(n+" tiene "+digitos+" digito");
		}
		else if(n>=10){

			System.out.println(n+" tiene "+digitos+" digitos");
		}
		
		//cierre de scanner
		sc.close();
		
	}

}