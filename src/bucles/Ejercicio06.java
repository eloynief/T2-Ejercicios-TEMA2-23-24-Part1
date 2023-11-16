package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {


	/* este programa escribe repitiendo cada número tantas veces como su valor hasta el numero introducido
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: 1		RESULTADO: 1
	 * VALOR INTRODUCIDO: 2		RESULTADO: la primera linea tendra 1 y la segunda 22
	 * VALOR INTRODUCIDO: 0		RESULTADO: nada
	 * VALOR INTRODUCIDO: -1	RESULTADO: "escribe un numero n: "
	 * VALOR INTRODUCIDO: a		RESULTADO: "El valor introducido no es correcto"
	 * 
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);

		//variable para esccribir el numero
		int n = 0;

		//comprobacion del numero si es negativ para que haga loop
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
			
			//imprime los *
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
		}

		

		//cierre de scanner
		sc.close();
		
	}

}