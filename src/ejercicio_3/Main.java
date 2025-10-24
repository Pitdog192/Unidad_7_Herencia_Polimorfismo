/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Arroquigarays
 */

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta(500_000, 75_000));
        empleados.add(new EmpleadoTemporal(20_000, LocalDate.of(2025, 10, 1), LocalDate.of(2025, 10, 15)));
        empleados.add(new EmpleadoPlanta(420_000, 30_000));
        empleados.add(new EmpleadoTemporal(18_000, LocalDate.of(2025, 9, 28), LocalDate.of(2025, 10, 5)));

        for (Empleado e : empleados) {
            double sueldo = e.calcularSueldo(); // Se invocan todos los empleados sin importar la clase, luego se evalua 1 a 1 que clase de empleado es
            if (e instanceof EmpleadoPlanta) {
                System.out.println("EmpleadoPlantaSueldo: " + sueldo);
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("EmpleadoTemporal Sueldo: " + sueldo);
            } else {
                System.out.println("Tipo de empleado desconocido Sueldo: " + sueldo);
            }
        }
    }
}
