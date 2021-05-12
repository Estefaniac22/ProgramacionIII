package menorDistanciaPuntos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de puntos:");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        vectorPuntos nuevoVector = new vectorPuntos();

        if (cantidad >= 2 && cantidad < 200) {

            nuevoVector.leePunto(cantidad);
            nuevoVector.calcularMenorDistancia(cantidad);
        }
        if (cantidad < 2) {
            System.out.println("Debe ingresar un numero mayor a 2");
        }
        if (cantidad >= 200) {
            System.out.println("Debe ingresar un numero menor a 200");
        }

    }
}
