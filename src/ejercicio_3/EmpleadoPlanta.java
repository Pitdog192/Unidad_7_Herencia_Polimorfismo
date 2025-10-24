/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

/**
 *
 * @author Arroquigarays
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double bonus;

    public EmpleadoPlanta(double sueldoBase, double bonus) {
        this.sueldoBase = sueldoBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + bonus;
    }
}
