package conditionals;

import java.util.Scanner;

public class Ejercicio04 {
	
	/* Este ejercicio consiste en introducir un numero y devolver el numero escrito en letras por pantalla
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: 4		RESULTADO: Cuatro
	 * VALOR INTRODUCIDO: 11	RESULTADO: Once
	 * VALOR INTRODUCIDO: 26	RESULTADO: Veintiseis
	 * VALOR INTRODUCIDO: 51	RESULTADO: Cincuenta y uno
	 * VALOR INTRODUCIDO: 70	RESULTADO: Setenta
	 * VALOR INTRODUCIDO: -1	RESULTADO: El valor introducido esta fuera del valor permitido
	 * VALOR INTRODUCIDO: 0		RESULTADO: El valor introducido esta fuera del valor permitido
	 * VALOR INTRODUCIDO: 100	RESULTADO: El valor introducido esta fuera del valor permitido
	 * VALOR INTRODUCIDO: 123	RESULTADO: El valor introducido esta fuera del valor permitido
	 */

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variables que representan el numero escrito y la que va a sacar los valores del 1 al 9
		int num,unidad;
		//variable que guardara el numero escrito en letras del 1 al 9 en base a la variable unidad
		String numLetras="";
		
		//Se pide al usuario que introduzca un numero por pantalla
		System.out.print("Introduce el numero: ");
				
		//Comando para introducir el primer número
		num = sc.nextInt();
		
		//da el valor de la unidad del num a las variable creada
		unidad=num%10;
		
		// El switch dará uno de los casos que tiene dependiendo del valor de num introducido
		switch (unidad) {
		case 1 -> numLetras = "uno";
		case 2 -> numLetras = "dos";
		case 3 -> numLetras = "tres";
		case 4 -> numLetras = "cuatro";
		case 5 -> numLetras = "cinco";
		case 6 -> numLetras = "seis";
		case 7 -> numLetras = "siete";
		case 8 -> numLetras = "ocho";
		case 9 -> numLetras = "nueve";
		}
		
		//comprobamos si el numero entra dentro del valor que nos piden
		if (num>0&& num<100) {
			
			//comprueba si el numero introducido es menor de 10
			if (num>0&&num<10) {
				//mediante el caso anterior, si el numero es menor de 10
				//imprime el numero de letras
				System.out.println(numLetras);
			} else if (num == 10) { 
				System.out.println("diez");
			} else if (num == 11) { 
				System.out.println("once");
			} else if (num == 12) { 
				System.out.println("doce");
			} else if (num == 13) { 
				System.out.println("trece");
			} else if (num == 14) { 
				System.out.println("catorce");
			} else if (num == 15) { 
				System.out.println("quince");
			} else if (num == 20) { 
				System.out.println("Veinte");
			} else if (num == 30) { 
				System.out.println("Treinta");
			} else if (num == 40) { 
				System.out.println("Cuarenta");
			} else if (num == 50) { 
				System.out.println("Cincuenta");
			} else if (num == 60) { 
				System.out.println("Sesenta");
			} else if (num == 70) { 
				System.out.println("Setenta");
			} else if (num == 80) { 
				System.out.println("Ochenta");
			} else if (num == 90) { 
				System.out.println("Noventa");
			} else if (num>15&&num<20) {
				System.out.println("Dieci"+numLetras);
			} else if (num>20 && num<30) {
				System.out.println("Veinti"+numLetras);
			} else if (num>30&&num<40) {
				System.out.println("Treinta y "+numLetras);
			} else if (num>40&&num<50) {
				System.out.println("Cuarenta y "+numLetras);
			} else if (num>50&&num<60) {
				System.out.println("Cincuenta y "+numLetras);
			} else if (num>60&&num<70) {
				System.out.println("Sesenta y "+numLetras);
			} else if (num>70&&num<80) {
				System.out.println("Setenta y "+numLetras);
			} else if (num>80&&num<90) {
				System.out.println("Ochenta y "+numLetras);
			} else if (num>90&&num<100) {
				System.out.println("Noventa y "+numLetras);
			}
		}
		//si el valor esta fuera de lo indicado, entonces imprimimos que el valor no es correcto
		else {
			System.out.println("El valor introducido esta fuera del valor permitido");
		}
			
		//cierre de scanner
		sc.close();
		
	}

}
