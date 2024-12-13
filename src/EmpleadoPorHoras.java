public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, String departamento, double tarifaHora,String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento,genero);
        this.tarifaHora = tarifaHora;
    }

    public void imprimirDetalles() {
        super.imprimirDetalles(); 
        System.out.println("Tarifa por Hora: " + tarifaHora);
    }


    
    // INLINE TEMP
    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * getTarifaHora();
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    // Más metodos
}