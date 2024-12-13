public class EmpleadoTemporario extends Empleado {
    private int mesesContrato;
    private String genero;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento);
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }

    public void imprimirDetalles() {
        super.imprimirDetalles(); // Imprime los detalles comunes
        System.out.println("Meses de Contrato: " + mesesContrato);
        System.out.println("Género: " + genero);
    }

    // Más metodos
}
