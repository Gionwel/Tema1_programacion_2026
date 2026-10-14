package unidad01;

import java.util.Scanner;

public class Actividad_1_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia, mes, anio;
        boolean correcta;

        System.out.print("Introduce el dia: ");
        dia = teclado.nextInt();

        System.out.print("Introduce el mes: ");
        mes = teclado.nextInt();

        System.out.print("Introduce el año: ");
        anio = teclado.nextInt();

        correcta = false;

        if (anio <= 0 && anio >=0  && mes >= 1 && mes <= 12) {
            int diasMes = 0;

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    diasMes = 31;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    diasMes = 30;
                    break;

                case 2:
                    if (anio % 400 == 0 ||
                        (anio % 4 == 0 && anio % 100 != 0)) {
                        diasMes = 29;
                    } else {
                        diasMes = 28;
                    }
                    break;
            }

            if (dia >= 1 && dia <= diasMes) {
                correcta = true;
            }
        }

        if (correcta) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha no es correcta.");
        }

        teclado.close();
    }
}