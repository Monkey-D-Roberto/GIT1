package gestionEmpleados;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creamos empleados
        List<Empleado> empleados = new ArrayList<>();
        List<String> lenguajesDesarrollador = new ArrayList<>();
        lenguajesDesarrollador.add("Java");
        lenguajesDesarrollador.add("Python");
        empleados.add(new Desarrollador(1, "Juan", "Desarrollo", 15000, lenguajesDesarrollador));

        List<Empleado> equipoGerente = new ArrayList<>();
        equipoGerente.add(empleados.get(0));
        empleados.add(new Gerente(2, "Maria", "Gerencia", 30000, equipoGerente));

        // Mostrar detalles y calcular bono
        for (Empleado empleado : empleados) {
            empleado.mostrarDetalles();
            System.out.println("Bono: " + empleado.calcularBono());
            System.out.println();
        }

        EvaluacionDesempeno evalDesempeno = new ImplementacionEvaluacionDesempeno(7);
        System.out.println("Evaluación del desempeño de Juan: " + evalDesempeno.evaluarDesempeno());
    }
}
