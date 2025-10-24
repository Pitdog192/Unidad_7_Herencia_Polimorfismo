/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

/**
 *
 * @author Arroquigarays
 */
public class Main {
    public static void main(String[] args) {
        // Instanciar un auto y mostrar su información
        Auto miAuto = new Auto("Renault", "Sandero Stepway", 3);

        // upcasting a Vehiculo
        Vehiculo v = miAuto;

        // Llamada dinámica: ejecuta mostrarInfo() de Auto gracias a @Override
        v.mostrarInfo();

        // downcasting seguro
        if (v instanceof Auto) {
            Auto a = (Auto) v; // downcasting
            System.out.println("Características del auto: " + a.getCantidadPuertas());
        }
    }
}
