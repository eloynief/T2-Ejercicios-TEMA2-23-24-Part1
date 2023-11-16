package conditionals;

import java.util.Scanner;

public class Ejercicio06 {

	/* est3e ejercicio te crea una suma de 2 num random y debes adivinar la suma escribiendo un nuemro
	 * 
	 * pruebas: Si el valor coincide imprime que acertastes. Si el numero no coincide dice que has fallado
	 * si es una letra te salta error
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		// variable para escribir el numero, variable para los dos numeros random y para la suma que tinenes que adivinar
		int num=0,r1,r2,suma;
		
		
		
		
		//valores random
		r1=(int) (Math.random()*100);
		
		r2=(int) (Math.random()*100);
		
		//al obtener los valores random, 
		suma=r1+r2;
		

		//mediante el try catch vemos si el valor escrito es un numero
		try {
			System.out.println("escribe el numero que crees que es la suma: ");
			num = sc.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("Debes introducir nun numero");
			
		}
		

//		System.out.println(suma);
		
		//si el numero coincide con la suma
		if(num==suma) {
			System.out.println("acertado");
		}
		
		//
		else {
			System.out.println("te has equivocado");
		}
		
		

		//cierre de scanner
		sc.close();
		
	}

}
