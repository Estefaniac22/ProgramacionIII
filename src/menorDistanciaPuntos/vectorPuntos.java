package menorDistanciaPuntos;

import java.util.ArrayList;
import java.util.Scanner;

public class vectorPuntos {

    ArrayList<Punto2D> misPuntos = new ArrayList<>();

    public ArrayList<Punto2D> leePunto(int cantidad) {
        int contador = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("--------Punto: " + i + " -----------");
            Scanner sc = new Scanner(System.in);
            contador = contador + 1;
            System.out.print("Ingrese la posicion x:");
            double varX = sc.nextDouble();

            System.out.print("Ingrese la posicion y:");
            double varY = sc.nextDouble();
            System.out.println("----------------------------");
            Punto2D nuevoPunto = new Punto2D(varX, varY);
            nuevoPunto.setX(varX);
            nuevoPunto.setY(varY);
            misPuntos.add(nuevoPunto);

        }
        return misPuntos;

    }

    public void calcularMenorDistancia(int cantidad) {

        int punto1 = 0;
        int punto2 = 1;

        double distaciaMin = misPuntos.get(punto1).pitagoras(misPuntos.get(punto2));

        for (int i = 1; i < misPuntos.size() - 2; i++) {
            for (int j = i + 1; j < misPuntos.size() - 1; j++) {
                if (i != j) {
                    double distancia = misPuntos.get(i).pitagoras(misPuntos.get(j));
                    if (distancia < distaciaMin) {
                        punto1 = i;
                        punto2 = j;
                        distaciaMin = distancia;
                    }
                }
            }
        }

        System.out.println("La menor distancia es: " + distaciaMin + " entre los puntos " + punto1 + " y " + punto2);

    }
}
