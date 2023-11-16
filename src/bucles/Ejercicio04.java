package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {

	/* este programa hace el maximo comun divisor de dos numeros
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: a=5,b=3		RESULTADO: 1
	 * VALOR INTRODUCIDO: a=6,b=3		RESULTADO: 3
	 * VALOR INTRODUCIDO: a=8,b=2		RESULTADO: 2
	 * VALOR INTRODUCIDO: a=8,b=4		RESULTADO: 4
	 * VALOR INTRODUCIDO: a=0,b=0		RESULTADO: 1
	 * 
	 */
	public static void main(String[] args) {
 
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int a = 0,b = 0,masPequeño,mcd = 1;
		
		//
		try {
			
			System.out.println("Escribe dos numeros: ");
			a = sc.nextInt();
			b = sc.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("");
			sc.nextLine();
		}
		
		
		
		//comprobamos si el numeto a es mas grande que b para saber quien es mas pequeño
		if(a>b) {
			masPequeño=b;
		}
		else {
			masPequeño=a;
		}
		
		
		//comprobar si el numero se puede dividir entre uno de los numeros
		for(int i=masPequeño;i>=1;i--) {
			
			//comprobar si se puede dividir entre los dos numeros
			if (a%i==0&&b%i==0) {
				
				//se multiplica como pasa el el mcd (LA CUENTA) (EL CALCULO)
				mcd*=i;
				
			}
			
			
		}
		System.out.println(mcd);

		//cierre de scanner
		sc.close();
		
	}

}
