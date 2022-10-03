package FigurasGeometricas;

public class Triangulo {
    public static double calcularPerimetro(double base, double altura){
        return (base + altura + calcularHipotenusa(base,altura));
    }

    public static double calcularArea(double base, double altura){
        return (base * altura) / 2;
    }

    
    public static double calcularHipotenusa(double base, double altura){
        return Math.pow(Math.pow(base,2) + Math.pow(altura,2) , 0.5);
    }

    public static String tipoDeTriangulo(double base, double altura){
        if((base == altura) && (base == calcularHipotenusa(base,altura)) && (altura == calcularHipotenusa(base,altura))){
            return "El triangulo es equilatero: ";
        }else if((base != calcularHipotenusa(base,altura) && (base != altura)) && (altura != calcularHipotenusa(base,altura))){
            return"El triangulo es escaleno: ";
        }else{
            return "El triangulo es isóceles: ";
        }
}
}