package taller;
public class Empleado {
    private String nombre;  
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private String genero;

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, String departamento, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.genero = genero;
    }

    public double calcularSalario() {
        double salarioTotal = salarioBase;
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
        
        // Horas trabajadas normales = 40;
        if (horasTrabajadas > 40) {
            salarioTotal += (horasTrabajadas - 40) * 50; // Pago de horas extra
        }

        // esta solucion no cumple con OCP
        // return calcularBonoPorDepartamento(salarioTotal);
        return salarioTotal;
    }

    // No cumple OCP, se usan decoradores
    private double calcularBonoPorDepartamento(double salarioTotal) {
        switch (departamento) {
            case "Sistemas":
                salarioTotal += 20;
                break;
            case "Contabilidad":
                salarioTotal += 10;
                break;
            default:
                break;
        }
        return salarioTotal;
    }
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
        System.out.println("Género: " + genero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Más metodos
}
