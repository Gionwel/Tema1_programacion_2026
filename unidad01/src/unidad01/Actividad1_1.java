package unidad01;


import java.util.Scanner;


public class Actividad1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		       Scanner teclado = new Scanner(System.in);

		       System.out.print("Introduce el primer número: ");
		       double num1 = teclado.nextDouble();

		       System.out.print("Introduce el segundo número: ");
		       double num2 = teclado.nextDouble();

		       double distancia = Math.abs(num1 - num2);

		       System.out.println("La distancia entre los números es: " + distancia);

		       teclado.close();
		       
		    }
		
	}


