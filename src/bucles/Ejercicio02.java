package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	/* este porgrama muestra los numeros primos que hay entre el 1 y el numero que introduces
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: n=3		RESULTADO: 1,2,3
	 * VALOR INTRODUCIDO: n=5		RESULTADO: 1,2,3,5
	 * VALOR INTRODUCIDO: n=4		RESULTADO: 1,2,3
	 * VALOR INTRODUCIDO: n=-1		RESULTADO: "escribe un numero n: "
	 * VALOR INTRODUCIDO: n=a		RESULTADO: "El valor introducido no es correcto"
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variables primo para los numeros primos y n para introducir el numero que vas a usar para contar los primos que hay entre 1 y este numero
		int n = -1;
		int primo=0;
		
		//comprobamos si el valor introducido es negativo para que siga haciendo el loop hasta que no añadas un numero positivo
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
				sc.nextLine();
			}
		}while(n<0);
		
		//se recorre un bucle para recorrer todos los numeros
		for(int i=1;i<=n;i++) {

			primo=0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					primo++;
				}
			}

			//si el numero solo se puede dividir entre si mismo y 1
			if(primo==2||i==1) {
				System.out.println(i);
			}
			
		}
		
//		for (int j = 2; j < i; j++) {
//      if (n % i == 0) {
//          esPrimo = false; // Si es divisible por algún número, no es primo.
//          System.out.println(j+"es primo");
//          break; // Salir del bucle una vez que se determine que no es primo.
//      }
//  }
//	
		/**
		 *  if (numero <= 1) {
            esPrimo = false; // Los números menores o iguales a 1 no son primos.
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false; // Si es divisible por algún número, no es primo.
                    break; // Salir del bucle una vez que se determine que no es primo.
                }
            }
        }
		 */
		
		//cierre de scanner
		sc.close();
		
	}

}
