public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, String departamento, double tarifaHora) {
        super(nombre, salarioBase, horasTrabajadas, departamento);
        this.tarifaHora = tarifaHora;
    }

    public void imprimirDetalles() {
        super.imprimirDetalles(); 
        System.out.println("Tarifa por Hora: " + tarifaHora);
    }


    // INLINE TEMP
    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * super.getTarifaHora();
    }

    // Más metodos
}