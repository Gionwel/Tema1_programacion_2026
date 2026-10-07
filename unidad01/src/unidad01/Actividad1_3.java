package unidad01;


import java.util.Scanner;


public class Actividad1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Dime un numero entero:");
		int numero = teclado.nextInt();
		
		//string impar;
		
		
		if (numero % 2== 0 ) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		
		}
		
		teclado.close();
		
	}

}
