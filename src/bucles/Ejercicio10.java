package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	/* este ejercicio escribimos un numero mayor de 0 y nos dice si el número introducido por teclado es capicúa o no
	 * 
	 * 
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);

		//variables para guardar el numero la ultima cifra y la copia
		int n=-1,numReves=0,ultimaCifra,copiaNum;

		//comprueba si el numero es positivo
		do {
			//try catch para comprobar si el usuario ha introducido un numero o no
			try {
				//pide que escribaos numero
				System.out.println("Escribe el numero: ");
				
				//introducimos el valor
				n=sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Debes introducir un número");
				//salto de linea para que no se quede en bucle
				sc.nextLine();
			}
		}while(n<0);

		//la copia del numero se iguala a 
		copiaNum=n;
		
		
		//comprobamos si el numero tiene mas de un digito
		while(copiaNum>0) {
			//el modulo saca la ultima cifra del numero
			ultimaCifra=copiaNum%10;
			numReves=numReves*10+ultimaCifra;

			//se divide el numero de digitos
			copiaNum/=10;
		}
		
		//comprueba si el numero es capicuo
		if(n==numReves) {
			
			//
			System.out.println("El numero "+n+" es caìcuo");
			
		}
		else {
			System.out.println("El numero "+n+" no es cqapiocuo");
		}
		//cierre de scanner
		sc.close();
		
	}

}
