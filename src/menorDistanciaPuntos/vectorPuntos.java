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

        double distanciaMin = misPuntos.get(0).pitagoras(misPuntos.get(1));

        for (int i = 0; i < misPuntos.size(); i++) {
            for (int j = 0 + 1; j < misPuntos.size(); j++) {
                if (i != j) {
                    double distancia = misPuntos.get(i).pitagoras(misPuntos.get(j));
                    if (distancia < distanciaMin) {
                        punto1 = i;
                        punto2 = j;
                        distanciaMin = distancia;
                    }
          //          System.out.println("distancia Minima---" + distanciaMin);
          //          System.out.println("distancia---" + distancia);
                }
            }
        }

        System.out.println("La menor distancia es: " + distanciaMin + " entre los puntos " + punto1 + " y " + punto2);

    }
}
