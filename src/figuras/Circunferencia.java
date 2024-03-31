package figuras;

public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void imprimir() {
        color = "rojo";
        double diametro = 2 * radio;
        System.out.println("Di�metro: " + diametro);
        System.out.println("Color: " + color);
        double area = calcularArea();
        System.out.println(area);
    }

    public double calcularArea() {
        double area = 2 * PI * radio * radio;
        return area;
    }
    private static final double PI = 3.1416;
    private String color;

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (Math.abs(radio1 - radio2) < 1) {
                return true;
            } else {
                return false;
            }
        }
    }
}
