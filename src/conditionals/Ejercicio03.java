package conditionals;

import java.util.Scanner;

public class Ejercicio03 {

	/* Este programa te permite intoducir una cantidad de comida de unos kilos que introduces tambien introduces para darle a la cantidad de animales que escribas
	 * PRUEBAS:
	 * VALOR INTRODUCIDO: comida=5,animales=5,kilos=5		RESULTADO: La cantidad correspondiente de comida para cada animal es: 1
	 * VALOR INTRODUCIDO: comida=5,animales=10,kilos=5		RESULTADO: La cantidad correspondiente de comida para cada animal es: 1
	 * VALOR INTRODUCIDO: comida=15,animales=5,kilos=5		RESULTADO: No hay kilos de comida suficiente
	 * VALOR INTRODUCIDO: comida=5,animales=5,kilos=15		RESULTADO: La cantidad correspondiente de comida para cada animal es: 1
	 * VALOR INTRODUCIDO: comida=15,animales=5,kilos=15		RESULTADO: La cantidad correspondiente de comida para cada animal es: 3
	 * VALOR INTRODUCIDO: comida=5,animales=10,kilos=5		RESULTADO: La cantidad correspondiente de comida para cada animal es: 0
	 * VALOR INTRODUCIDO: comida=5,animales=0,kilos=5		RESULTADO: No hay animales
	 * VALOR INTRODUCIDO: comida=15,animales=0,kilos=5		RESULTADO: No hay kilos de comida suficiente
	 * VALOR INTRODUCIDO: comida=0,animales=0,kilos=5		RESULTADO: No hay animales
	 * VALOR INTRODUCIDO: comida=15,animales=0,kilos=0		RESULTADO: No hay animales
	 * VALOR INTRODUCIDO: comida=15,animales=15,kilos=5		RESULTADO: No hay kilos de comida suficiente
	 * VALOR INTRODUCIDO: numero negativo en una de las 3 variables		RESULTADO: "Error, uno o mas de los valores introducidos es negativo" 1
	 */
	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		

		//variable para guardar un número entero
		int comida,animales,kilos,racion;
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce la cantidad de comida que le vas a dar a los animales: ");
		
		//Comando para introducir el primer número el cual representa la comida
		comida = sc.nextInt();
		
		System.out.print("Introduce el número de animales: ");
		//Comando para introducir el segundo número el cual representa los animales
		animales = sc.nextInt();
		
		System.out.print("Introduce los kilos de comida que tienes: ");
		/*Comando para introducir el tercer número el cual representa los kilos.
		Los kilos */
		kilos = sc.nextInt();
		
		//comprobamos que los valores introducidos sean positivos
		if(animales>=0&&comida>=0&&kilos>=0){
			
			//comprobaamos si los kilos de comida son suficientes para la comida
			if(kilos>=comida) {

				//si hay animales
				if (animales>0) {
					//se hace el calculo para la racion
					racion=comida/animales;
					//si la cantidad de kilos de comida medios son mayores que la comida por la cantidad de animales
					if (kilos>comida*animales) {
						//imprimimos que tenemos suficiente comida para estos
						System.out.print("Tenemos suficientes kilos de comida para los animales");
					}
					else {
					System.out.print("La cantidad correspondiente de comida para cada animal es: " + racion);
					}
				}
				else System.out.print("No hay animales");
			}//final del if kilos>comida
			else {
				System.out.println("No hay kilos de comida suficiente");
			}
			
			
		}
		//si alguno de los valores es negativo, salta error en la pantalla
		else {
			System.out.println("Error, uno o mas de los valores introducidos es negativo");
		}
		//cierre de scanner
		sc.close();
		
	}

}
