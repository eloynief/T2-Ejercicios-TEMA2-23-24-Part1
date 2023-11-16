package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	/* este programa imprime una pirámide de números con n filas
	 * repitiendo cada número tantas veces como su valor hasta el numero introducido, 
	 * y cuando llega al numero introducido, 
	 * la piramide llega hasta 1 y continua a la siguiente linea
	 * 
	 * 
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: 1		RESULTADO: 1
	 * VALOR INTRODUCIDO: 2		RESULTADO: la primera linea tendra 1 y la segunda 121
	 * VALOR INTRODUCIDO: 0		RESULTADO: nada
	 * VALOR INTRODUCIDO: -1	RESULTADO: "escribe un numero n: "
	 * VALOR INTRODUCIDO: letra o caracter raro		RESULTADO: "El valor introducido no es correcto"
	 * 
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);

		int n = 0;

		//try para comprobar si el valor introducido es correcto
		try {

			//pide por pantalla que introduzcamos un numero
			System.out.println("escribe un numero n: ");

			n=sc.nextInt();
			
		}
		//si el valor introducido no es correcto, hace las instrucciones del catch
		catch(InputMismatchException e) {
			System.err.println("El valor introducido no es correcto");
		}
		
		//for para recorrer los valores
		for(int i = 1;i<=n;i++) {
			
			//
			
			//imprime los numeros ascendentes
            for (int j = 1; j <= i; j++) {
            	
            	//
            	
                System.out.print(j);
            }
			
            // Imprime números descendentes
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
			
			
			
            System.out.println();
		}

		

		//cierre de scanner
		sc.close();
		
	}

}
