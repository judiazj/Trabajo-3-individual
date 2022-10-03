package capitulo3;

public class TrianguloEjercicio19 {
    public static double calcularPerimetro(double lado){
    double perimetro;
    perimetro = 3 * lado;
    return perimetro;
    }
    
    public static double calcularArea(double lado){
    double area;
    area = (Math.pow(lado, 2) * Math.sqrt(3))/4;
    return area;
    }
    
    public static double calcularAltura(double lado){
    double altura;
    altura = (lado * Math.sqrt(3))/2;
    return altura;
    }
}
