package gestionEmpleados;

import java.util.List;

class Gerente extends Empleado {
    private List<Empleado> equipo;

    public Gerente(int id, String nombre, String departamento, double salario, List<Empleado> equipo) {
        super(id, nombre, departamento, salario);
        this.equipo = equipo;
    }
    @Override
    public double calcularBono() {
        return equipo.size() * 250; // 250 por cada empleado a cargo.
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Equipo a cargo:");
        for (Empleado emp : equipo) {
            System.out.println("- " + emp.nombre);
        }
    }
}
