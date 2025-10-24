/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

/**
 *
 * @author Arroquigarays
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    // Constructor Auto
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // Invoca al constructor de la superclase
        this.cantidadPuertas = cantidadPuertas;
    }

    // getter para devolver la cantidad de puertas
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    // Se sobreescribe
    @Override
    public void mostrarInfo() {
        System.out.println("Auto:");
        System.out.println("  Marca: " + marca);
        System.out.println("  Modelo: " + modelo);
        System.out.println("  Puertas: " + cantidadPuertas);
    }
}