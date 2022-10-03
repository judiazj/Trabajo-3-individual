package FigurasGeometricas;

public class Trapecio {
    public static double calcularArea(double baseMayor, double baseMenor, double altura){
        return (baseMayor * baseMenor)/2 *altura;
    }

    public static double calcularPerimetro(double baseMayor, double baseMenor,double distanciaAltura, double altura){
        return 2 * calcularHipotenusa(distanciaAltura,altura) + baseMayor + baseMenor;
    }

    public static double calcularHipotenusa(double distanciaAltura, double altura){
        return Math.pow(Math.pow(distanciaAltura,2) + Math.pow(altura,2) , 0.5);
    }
}
