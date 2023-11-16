package conditionals;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	/*este programa escribes los segundos,minutos y horas para mostrarte la hora incrementando los segundos en 1
	 * si la cantidad de segundos es 59, segundos se vuelve 0 y aumenta en 1 la cantidad d eminutos
	 * si los minutos es 59, entonces aumenta la hora si los segundos son 59 tambien
	 * si las horas es 23, minutos 59 y segundos 59, entonces todo se vuelve 0
	 * si el valor de los minutos o segundos es negativo o supera 59, entonces hace loop para escribir un valor dentro
	 * si el valor de la hora es negativo o supera 23 entonces hace loop
	 * si alguno de los valores es una hora, sale error
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//
		int hora=0,min=0,sec=0;


		//do while para que el valor siempre sea entre 0 y 59
		do {
			
			// Le decimos al usuario que introduzca un número
			System.out.print("Introduce la hora: ");
				
			// Comando para introducir los min
			hora = sc.nextInt();
				
		}while(min<0||min>23);
		
		
		//do while para que el valor siempre sea entre 0 y 59
		do {
			
			// Le decimos al usuario que introduzca un número
			System.out.print("Introduce los minutos: ");
				
			// Comando para introducir los min
			min = sc.nextInt();
				
		}while(min<0||min>59);
		

		//do while para que el valor siempre sea entre 0 y 59
		do {
			
			// Le decimos al usuario que introduzca un número
			System.out.print("Introduce los minutos: ");
				
			// Comando para introducir los min
			sec = sc.nextInt();
				
		}while(sec<0||sec>59);
		
		
		sec++;

		//si el numero de segundos supera 59, aumenta la cantidad de minutos y se reduce en 60 la de segundos 
		if(sec>=60) {
			min+=1;
			sec-=60;
		}
		
		//si el numero de minutos supera 59, aumenta la cantidad de horas y se reduce en 60 la de segundos 
		if(min>=60) {
			hora+=1;
			min-=60;
		}
		
		//
		if(hora>24) {
			hora=0;
		}

		
		
		//cierre de scanner
		sc.close();
		
	}

}
