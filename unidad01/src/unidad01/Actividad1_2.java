package unidad01;


import java.util.Scanner;


public class Actividad1_2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Scanner teclado = new Scanner(System.in);

		        System.out.print("¿Cuántas monedas de 2 euros tienes? ");
		        int monedas2 = teclado.nextInt();

		        System.out.print("¿Cuántas monedas de 1 euro tienes? ");
		        int monedas1 = teclado.nextInt();

		        System.out.print("¿Cuántas monedas de 50 céntimos tienes? ");
		        int monedas50 = teclado.nextInt();

		        System.out.print("¿Cuántas monedas de 20 céntimos tienes? ");
		        int monedas20 = teclado.nextInt();

		        System.out.print("¿Cuántas monedas de 10 céntimos tienes? ");
		        int monedas10 = teclado.nextInt();

		        
		        int totalCentimos = monedas2 * 200
		                          + monedas1 * 100
		                          + monedas50 * 50
		                          + monedas20 * 20
		                          + monedas10 * 10;

		        int euros = totalCentimos / 100;
		        int centimos = totalCentimos % 100;

		        System.out.printf("tienes %d euros y %d cent \n", euros , centimos);

		        teclado.close();
		    }
		

	}

