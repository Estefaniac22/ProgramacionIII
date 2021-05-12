package menorDistanciaPuntos;

public class Punto2D {

    double x;
    double y;

    public Punto2D() {

    }

    public Punto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double pitagoras(Punto2D otroPunto) {
        double cuadradoX = this.getX() - otroPunto.getX();
        double cuadradoY = this.getY() - otroPunto.getY();
        double resultado = Math.sqrt((cuadradoX * cuadradoX) + (cuadradoY * cuadradoY));
        return resultado;

    }

    public boolean esOrigen() {
        boolean esOrigen = false;
        if (this.getX() == 0 && this.getY() == 0) {
            esOrigen = true;
        }
        return esOrigen;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
