package taller;
public class EmpleadoTemporario extends Empleado {
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento,genero);
        this.mesesContrato = mesesContrato;
    }

    public void imprimirDetalles() {
        super.imprimirDetalles(); // Imprime los detalles comunes
        System.out.println("Meses de Contrato: " + mesesContrato);
    }

    // Más metodos
}
