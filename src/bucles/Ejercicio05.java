package bucles;

import java.util.Scanner;

public class Ejercicio05 {


	/* este programa calcula el minimo comun multiplo de dos numeros
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: a=5,b=3		RESULTADO: 15
	 * VALOR INTRODUCIDO: a=6,b=3		RESULTADO: 3
	 * VALOR INTRODUCIDO: a=8,b=2		RESULTADO: 2
	 * VALOR INTRODUCIDO: a=8,b=4		RESULTADO: 4
	 * VALOR INTRODUCIDO: a=0,b=0		RESULTADO: 1
	 * 
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variables que representan los numeros que vamos a usar para los calculos
		int a,b,masGrande,mcm = 1;
		
		//nos pide que escribamos los numeros en pantalla
		System.out.println("Escribe dos numeros: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		//comprueba si el numero a es mas pequeño que b
		if(a<b) {
			masGrande=b;
		}
		else {
			masGrande=a;
		}
		
		
		//comprobar si el numero se puede dividir entre uno de los numeros
		for(int i=masGrande;i>=1;i--) {
			
			//comprobar si se puede multiplicar por uno de los dos numeros
			if (a%i==0||b%i==0) {
				
				//se multiplica como pasa el el mcd (LA CUENTA) (EL CALCULO)
				mcm*=i;
				
			}
			
			
		}
		
		//
		System.out.println("El minimo comun multiplor es: "+mcm);
		
		

		//cierre de scanner
		sc.close();
		
	}

}
