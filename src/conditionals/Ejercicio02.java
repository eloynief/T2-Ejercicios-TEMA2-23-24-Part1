package conditionals;

import java.util.Scanner;

public class Ejercicio02 {
	
	/* Este programa escribe una letra dependiendo de que numero de 8 cifras pongas
	 * 
	 * VALOR INTRODUCIDO: num=0		RESULTADO: La opción introducida es errónea
	 * VALOR INTRODUCIDO: num=123456789		RESULTADO: La opción introducida es errónea
	 * VALOR INTRODUCIDO: num=12345678		RESULTADO: Z
	 * Cuando escribes un numero de 8 cifras, te aparece una letra dentro de todos los casos que hay
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variable que representa el dni y la letra que continua
		int num=0,letra;
		
		//pedimos que introduzcamos el numero
		System.out.println("Escribe el numero de 8 cifras");
		
		//introducimos el valor en pantalla
		num=sc.nextInt();
		
		

		
		
		
		//si el numero no tiene 8 cifras
		if (num<10000000 || num>=100000000)
		System.out.print("La opción introducida es errónea");
				
		else {
			
			//como el numero es valido, se hace el modulo para la letra
			letra=num%23;
			
			//hacemos el switch para los diferentes casos de letra
			switch(letra) {
				
			
			case 0->System.out.print("T");
			case 1->System.out.print("R");
			case 2->System.out.print("W");
			case 3->System.out.print("A");
			case 4->System.out.print("G");
			case 5->System.out.print("M");
			case 6->System.out.print("Y");
			case 7->System.out.print("F");
			case 8->System.out.print("P");
			case 9->System.out.print("D");
			case 10->System.out.print("X");
			case 11->System.out.print("B");
			case 12->System.out.print("N");
			case 13->System.out.print("J");
			case 14->System.out.print("Z");
			case 15->System.out.print("S");
			case 16->System.out.print("Q");
			case 17->System.out.print("V");
			case 18->System.out.print("H");
			case 19->System.out.print("L");
			case 20->System.out.print("C");
			case 21->System.out.print("K");
			case 22->System.out.print("E");
					
			}
		}
		
		
		
		
		//cierre de scanner
		sc.close();
		
	}

}
