package taller;

import taller.decorators.DecoratorContabilidad;
import taller.decorators.DecoratorSistemas;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Empleado emp1 = new EmpleadoPorHoras("Dario Laborde", 45, 15, "Sistemas", 23, "Masculino");
        // se usa el decorador para sobreescribir calcular salario con el bono
        emp1 = new DecoratorSistemas(emp1);
        Empleado emp2 = new EmpleadoFijo("Jorge Gaibor",700,45,"Contabilidad",40, "Masculino");
        emp2 = new DecoratorContabilidad(emp2);
        EmpleadoTemporario emp3 = new EmpleadoTemporario("Jordan Salinas",200,20,"Medico",6, "Masculino");

        empresa.contratarEmpleado(emp1);
        empresa.contratarEmpleado(emp2);
        empresa.contratarEmpleado(emp3);

        emp1.imprimirDetalles();
        emp2.imprimirDetalles();
        emp3.imprimirDetalles();


    }
}