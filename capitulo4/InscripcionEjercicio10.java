package capitulo4;

public class InscripcionEjercicio10 {
    public static double calcularPagoMatricula(double patrimonio, int estrato){
        double pagoMatricula;
        pagoMatricula = 50000;
        if (patrimonio > 2000000 && estrato > 3){
            pagoMatricula = pagoMatricula + (patrimonio * 0.03);
        }
        return pagoMatricula;
    }
}
