package taller.decorators;

import taller.Empleado;

public class DecoratorSistemas  extends Empleado{
    private Empleado empleado;

    public DecoratorSistemas(Empleado empleado){
        super(empleado.getNombre(),empleado.getSalarioBase(),empleado.getHorasTrabajadas(),empleado.getDepartamento(),empleado.getGenero());
        this.empleado = empleado;
    }

    @Override
    public double calcularSalario() {
        
        return super.calcularSalario() + 20;
    }

    

}
