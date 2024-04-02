package gestionEmpleados;

public class ImplementacionEvaluacionDesempeno implements EvaluacionDesempeno {

    private int proyectosRealizados;

    public ImplementacionEvaluacionDesempeno(int proyectosRealizados) {
        this.proyectosRealizados = proyectosRealizados;
    }
    @Override
    public String evaluarDesempeno() {
        if (proyectosRealizados > 5) {
            return "Excelente desempeño";
        } else if (proyectosRealizados > 2) {
            return "Su Desempeño Regular";
        } else {
            return "Su desempeño es malo";
        }
    }
}