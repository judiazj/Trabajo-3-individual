package capitulo5;

public class CalcularMayorEjercicio41 {
    public static double calcularMayor(double numero[]){
        double mayor = numero[0];
        for (int i = 1; i < numero.length; i++){
            if(numero[i] > mayor){
                mayor = numero[i];
            }
        }
        return mayor;
    }
}
