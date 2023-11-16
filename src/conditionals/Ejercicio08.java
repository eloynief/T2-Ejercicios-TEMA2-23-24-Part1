package conditionals;

import java.util.Scanner;

public class Ejercicio08 {

	/*este programa escribes la destancia a recorer y los dias de estancia
	 * y si los dias de estancia es >7 y la distancia >800km, entonces el precio se reduce en 30%
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: distancia=100,nDias=4		RESULTADO: 250
	 * VALOR INTRODUCIDO: distancia=100,nDias=8		RESULTADO: 250
	 * VALOR INTRODUCIDO: distancia=1000,nDias=8	RESULTADO: 2500*(30/100)
	 * VALOR INTRODUCIDO: distancia=0,nDias=0		RESULTADO: 0
	 * VALOR INTRODUCIDO: distancia=-1,nDias=-1		RESULTADO: El número introducido no es capicúo
	 * VALOR INTRODUCIDO:  distancia=a,nDias=5		RESULTADO: error
	 * VALOR INTRODUCIDO:  distancia=100,nDias=a	RESULTADO: error
	 * 
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variables que representan los numeros en relacion a 
		double precio=0;
		int distancia=0, nDias=0;
		
		System.out.println();
		
		//escribimos la distancia a recorrer y la estancia

		nDias=sc.nextInt();
		distancia=sc.nextInt();
		
		precio=distancia*2.5;
		
		//comprobamos si el numero de dias es >7
		if(nDias>7&&distancia>800) {
			precio=precio*(30/100);
		}
		
		
		//
		
		System.out.println("Escribe u n numero");

		//cierre de scanner
		sc.close();
		
	}

}
