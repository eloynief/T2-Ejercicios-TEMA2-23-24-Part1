package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		

		int n=0,division,digitos=0;

		try {
			//pide que escribaos numero
			System.out.println("Escribe el numero: ");
			
			n=sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("DEBES PONER UN NUMERO");
		}
		
		
		division=n;
		
		//comprobamos si el numero tiene mas de un digito
		while(division>0) {
			
			//aumentamos el numero de digitos
			digitos++;
			
			//se divide el numero de digitos
			division/=10;
			
		}
		
		//si el n tiene un numero (1-9) se ejecuta el if que dice que tiene 1 digito
		if (n<10) {

			System.out.println(n+" tiene "+digitos+" digito");
		}
		//si el n tiene más de un numero ( es decir, mayor de 9)
		else if(n>=10){

			System.out.println(n+" tiene "+digitos+" digitos");
		}
		
		//cierre de scanner
		sc.close();
		
	}

}
