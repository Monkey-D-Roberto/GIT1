package gestionEmpleados;

import java.util.List;
 class Desarrollador extends Empleado {
    private List<String> lenguajes;
    public Desarrollador(int id, String nombre, String departamento, double salario, List<String> lenguajes) {
        super(id, nombre, departamento, salario);
        this.lenguajes = lenguajes; //inicializo aqui
    }
    @Override
    public double calcularBono() {
        return lenguajes.size() * 100; // 100 por cada lenguaje conocido
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Lenguajes: " + lenguajes);
    }
}
