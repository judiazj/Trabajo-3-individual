
package capitulo3;


public class EmpleadoEjercicio18 {
    int codigoEmpleado;
    String nombre;

    
    public static double calcularSalarioBruto(double horasTrabajadas, double valorPorHora){
        double salarioBruto;
        salarioBruto = horasTrabajadas * valorPorHora;
        return salarioBruto;
    }
    
    public static double retencionFuente(double horasTrabajadas, double valorPorHora, double porcentajeRetencion){
        double salarioRetenido;
        salarioRetenido = (horasTrabajadas * valorPorHora) * (porcentajeRetencion/100);
        return salarioRetenido;
    }
    
    public static double calcularSalarioNeto(double horasTrabajadas, double valorPorHora,double porcentajeRetencion){
        double salarioNeto;
        salarioNeto = (horasTrabajadas * valorPorHora) - (horasTrabajadas * valorPorHora) * (porcentajeRetencion/100);
        return salarioNeto;
    }
}
