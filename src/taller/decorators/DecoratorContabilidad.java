package taller.decorators;

import taller.Empleado;

public class DecoratorContabilidad extends Empleado{
    private Empleado empleado;
    
    public DecoratorContabilidad(Empleado empleado){
        super(empleado.getNombre(),empleado.getSalarioBase(),empleado.getHorasTrabajadas(),empleado.getDepartamento(),empleado.getGenero());
        this.empleado = empleado;
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + 10;
    }


}
