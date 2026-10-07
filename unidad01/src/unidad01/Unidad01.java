package unidad01;


import java.util.Scanner;


public class Unidad01 {

		/*Calcular el perímetro y área de un rectángulo dada su base 
		y su altura. Tenemos que leer la base y la altura del rectángulo
		y calcular el perímetro y el área*/
		
	
	    public static void main(String[] args) {
	       Scanner teclado = new Scanner(System.in);

	       System.out.print("Introduce la base: ");
	       double base = teclado.nextDouble();

		   System.out.print("Introduce la altura: ");
		   double altura = teclado.nextDouble();

		   double perimetro = 2 * (base + altura);
		   double area = base * altura;

		   System.out.println("El perímetro es: " + perimetro);
		   System.out.println("El área es: " + area);

		   teclado.close();
		    
		

	}

}
