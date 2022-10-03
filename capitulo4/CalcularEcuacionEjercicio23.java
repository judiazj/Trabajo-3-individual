package capitulo4;

public class CalcularEcuacionEjercicio23 {
    public static double calcularResultado1(double a, double b, double c){
        double resultado1;
        resultado1 = ((-b)+(Math.sqrt((Math.pow(b,2)-4 * a * c))))/ (2*a);
        return resultado1;
    }
    
    public static double calcularResultado2 (double a, double b, double c){
        double resultado2;
        resultado2 = ((-b)-(Math.sqrt((Math.pow(b,2)-4 * a * c))))/ (2*a);
        return resultado2;
    }
}
