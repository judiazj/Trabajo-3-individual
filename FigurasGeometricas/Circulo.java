package FigurasGeometricas;

public class Circulo {

    public static double calcularArea(double radio){
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularPerimetro(double radio){
        return 2 * Math.PI * radio;
    }
}
