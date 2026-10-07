package unidad01;

import java.util.Scanner;

public class Actividad_99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero entero");
		int primerNumero = teclado.nextInt();
		
		System.out.println("Dime un segundo numero entero");
		int segundoNumero = teclado.nextInt();
		
		
		if (primerNumero == segundoNumero) {
			System.out.println("Los numeros son iguales");
		}else {
			System.out.println("Los numeros no son iguales");
		}		
		
		
		teclado.close();
		
	}

}
