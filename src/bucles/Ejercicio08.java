package bucles;

import java.util.Scanner;

public class Ejercicio08 {


	/* este programa aumenta el numero de numeros fallados y numeros escritos en funcinon de cuantos numseros negartivos y  positivos que introduzcas
	 * 
	 * 
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: 1,2,-1,0		RESULTADO: numescrito=2,numfallo=1
	 * VALOR INTRODUCIDO: 1,2,0		RESULTADO: numescrito=2,numfallo=0
	 * VALOR INTRODUCIDO: 0		RESULTADO: numescrito=0,numfallo=0
	 * VALOR INTRODUCIDO: -1	RESULTADO: "escribe un numero n: "
	 * VALOR INTRODUCIDO: letra o caracter raro		RESULTADO: "El valor introducido no es correcto"
	 * 
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int n=1,numEscrito=0,numFallo=0;

		//comprueba si el numero que se ha escrito no es 0
		while(n!=0) {
			//pide que escribamos un numero
			System.out.println("Escribe el numero: ");
			
			n=sc.nextInt();
			
			if(n>0) {
				//aumenta el numero de numeros escritos
				numEscrito++;
			}
			else if(n<0) {
				//aumenta el numero de numeros fallados
				numFallo++;
			}
			
			
		}
		
		//

		//cierre de scanner
		sc.close();
		
	}

}
