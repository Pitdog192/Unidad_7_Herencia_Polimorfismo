/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Arroquigarays
 */

public class EmpleadoTemporal extends Empleado {
    private double pagoPorDia;
    private LocalDate inicio;
    private LocalDate fin;

    public EmpleadoTemporal(double pagoPorDia, LocalDate inicio, LocalDate fin) {
        this.pagoPorDia = pagoPorDia;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public double calcularSueldo() {
        // Tuve que buscar como calcular la diferencia entre 2 fechas, se le agrega +1 al final para que sea inclusivo el ultimo dia trabajado
        long dias = ChronoUnit.DAYS.between(inicio, fin) + 1;
        return pagoPorDia * Math.max(dias, 0);
    }
}
