package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	/*Este ejercicio trata sobre introducir un valor de hora, minuto y segundo y los segundos a incrementar
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: hora=23,min=59,sec =59,incrementar=5		RESULTADO: 0:0:4
	 * VALOR INTRODUCIDO: hora=14,min=35,sec =59,incrementar=5		RESULTADO: 14:36:4
	 * VALOR INTRODUCIDO: hora=14,min=25,sec =25,incrementar=5		RESULTADO: 14:25:30
	 * VALOR INTRODUCIDO: hora=14,min=25,sec =25,incrementar=60		RESULTADO: 14:26:25
	 * VALOR INTRODUCIDO: hora=14,min=25,sec =25,incrementar=3600	RESULTADO: 15:25:25
	 * VALOR INTRODUCIDO: hora=14,min=25,sec =25,incrementar=3601	RESULTADO: 15:25:26
	 * VALOR INTRODUCIDO: hora=14,min=25,sec =25,incrementar=61	RESULTADO: 14:26:26
	 * VALOR INTRODUCIDO: hora=14,min=25,sec =25,incrementar=-5	RESULTADO: hará un loop hasta que no añadas un numero positivo en incrementar
	 * VALOR INTRODUCIDO: hora=-14,min=25,sec =,incrementar=	RESULTADO: hará un loop y no podrás introducir los valores a continuacion de la hora hasta que no introduzcas un numero positivo
	 * VALOR INTRODUCIDO: hora=14,min=-25,sec =,incrementar=	RESULTADO: hará un loop y no podrás introducir los valores a continuacion del minuto hasta que no introduzcas un numero positivo 
	 * VALOR INTRODUCIDO: hora=14,min=25,sec =-25,incrementar=	RESULTADO: hará un loop y no podrás introducir los valores a continuacion de los segundos hasta que no introduzcas un numero positivo
	 * VALOR INTRODUCIDO: hora=0,min=0,sec =0,incrementar=0	RESULTADO: 0:0:0
	 * VALOR INTRODUCIDO: hora=14,min=25,sec =25,incrementar=-5	RESULTADO: hará un loop y no podrás introducir los valores a continuacion de la hora hasta que no introduzcas un numero positivo
	 * VALOR INTRODUCIDO: uno de los 4 valores es una letra	RESULTADO: El valor introducido es incorrecto
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		

		// variables para guardar la hora, minuto, segundo y segundos para incrementar
		int hora=-1,min=-1,sec =-1,incrementar=-1;
		
		//do while para repetir el codigo si la hora esta fuera de su valor indicado
		do {
			
			//try de horas
			
			try {
	
				// Le decimos al usuario que introduzca un número
				System.out.print("Introduce las horas: ");
	
				
				// Comando para introducir la hora
				hora = sc.nextInt();
				
			}
			//captura el error del valor escrito
			catch(InputMismatchException e){
				System.out.println("El valor introducido es incorrecto");
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}while(hora>24||hora<0);
		

		//do while para que el valor siempre sea entre 0 y 59
		do {
			//try de minutos
			
			try {
	
				// Le decimos al usuario que introduzca un número
				System.out.print("Introduce los minutos: ");
	
				
				// Comando para introducir los min
				min = sc.nextInt();
				
			}
			//captura el error del valor escrito
			catch(InputMismatchException e){
				System.out.println("El valor introducido es incorrecto");
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}while(min<0||min>59);
		
		
		//do while para que los segundos esten enrtre 0 y 59
		do {
			
			//try de segundos
			try {
	
				// Le decimos al usuario que introduzca un número
				System.out.print("Introduce los segundos: ");
	
				
				// Comando para introducir los sec
				sec = sc.nextInt();
				
			}
			//captura el error del valor escrito
			catch(InputMismatchException e){
				System.out.println("El valor introducido es incorrecto");
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}while(sec<0||sec>59);

		//comprobamos si el valor a incrementar es positivo
		do {
			//try de la cantidad de segundos a incrementar
			
			try {
	
				// Le decimos al usuario que introduzca la cantidad de segundos que se van a incrementar
				System.out.print("Introduce el número de segundos a incrementar: ");
	
				
				// Comando para introducir el incremento de las numros
				incrementar = sc.nextInt();
				
			}
			//captura el error del valor escrito
			catch(InputMismatchException e){
				System.out.println("El valor introducido es incorrecto");
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}while(incrementar<0);
		
		
		//se aumenta la cantidad de segundos
		sec+=incrementar;
		
		//si los valores son válidos

			//si el numero de segundos supera 59, aumenta la cantidad de minutos y se reduce en 60 la de segundos 
			while(sec>=60) {
				min+=1;
				sec-=60;
			}
			
			//si el numero de minutos supera 59, aumenta la cantidad de horas y se reduce en 60 la de segundos 
			while(min>=60) {
				hora+=1;
				min-=60;
			}
			
			//si el numero de la hora es 24 o más, esta vuelve a ser 0
			while(hora>=24) {
				hora-=24;
			}
			//imprime la hora
			System.out.println(hora+":"+min+":"+sec);
			
		
		
		
		
		
		

		//cierre de scanner
		sc.close();
		
	}

}
