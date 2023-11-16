package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	/*este programa escribe una piramide de * dependiendo del numero que escribas para la altura de esta
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: n=3		RESULTADO: la piramide tendra tres lineas: una con un *, la segunda con * * y la tercera con * * *
	 * VALOR INTRODUCIDO: n=-1		RESULTADO: "escribe un numero n: "
	 * VALOR INTRODUCIDO: n=0		RESULTADO: no aparece nada
	 * VALOR INTRODUCIDO: n=letra o caracter raro		RESULTADO: "El valor introducido no es correcto"
	 * 
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int n = 0;
		
		//vemos si el numero que introducimos es negativo para que siga haciendo bucle
		do {
			//try para comprobar si el valor introducido es correcto
			try {
	
				//pide por pantalla que introduzcamos un numero
				System.out.println("escribe un numero n: ");
	
				n=sc.nextInt();
				
			}
			//si el valor introducido no es correcto, hace las instrucciones del catch
			catch(InputMismatchException e) {
				System.err.println("El valor introducido no es correcto");
				sc.nextInt();
			}
		}while(n<0);
		
		
		
		//for para recorrer los valores
		for(int i = 1;i<=n;i++) {
			
			
			//imprime los espacios
			for (int j= 1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			//imprime los *
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
		}

		//cierre de scanner
		sc.close();
		
	}

}
