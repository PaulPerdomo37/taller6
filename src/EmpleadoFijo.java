public class EmpleadoFijo extends Empleado {
    private double bonoAnual;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento, genero);
        this.bonoAnual = bonoAnual;
        
    }

    public void imprimirDetalles() {
        super.imprimirDetalles(); 
        System.out.println("Bono Anual: " + bonoAnual);
    }

    // Más metodos
}
