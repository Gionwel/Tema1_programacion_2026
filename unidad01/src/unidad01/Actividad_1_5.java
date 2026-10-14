package unidad01;


import java.util.Scanner;

public class Actividad_1_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char tipo;
        int tamano;
        double precioInicial, kilos, precioFinal, total;

        System.out.print("Ingrese el tipo de uva (A o B): ");
        tipo = teclado.next().toUpperCase().charAt(0);

        System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
        tamano = teclado.nextInt();

        System.out.print("Ingrese el precio inicial por kilo: ");
        precioInicial = teclado.nextDouble();

        System.out.print("Ingrese los kilos entregados: ");
        kilos = teclado.nextDouble();

        if (tipo == 'A') {
            if (tamano == 1) {
                precioFinal = precioInicial + 0.20;
            } else if (tamano == 2) {
                precioFinal = precioInicial + 0.30;
            } else {
                System.out.println("Tamaño no válido.");
                teclado.close();
                return;
            }
        } else if (tipo == 'B') {
            if (tamano == 1) {
                precioFinal = precioInicial - 0.30;
            } else if (tamano == 2) {
                precioFinal = precioInicial - 0.50;
            } else {
                System.out.println("Tamaño no válido.");
                teclado.close();
                return;
            }
        } else {
            System.out.println("Tipo de uva no válido.");
            teclado.close();
            return;
        }

        total = kilos * precioFinal;

        System.out.printf("Precio final por kilo: %.2f euros%n", precioFinal);
        System.out.printf("Total que recibirá el productor: %.2f euros%n", total);

        teclado.close();
    }
}