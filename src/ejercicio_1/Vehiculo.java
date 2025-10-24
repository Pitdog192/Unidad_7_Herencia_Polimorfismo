/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

/**
 *
 * @author Arroquigarays
 */
public class Vehiculo {
    // Modificadores de acceso: protegidos para subclases, encapsulados con getters
    protected String marca;
    protected String modelo;

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método que puede ser sobrescrito (polimorfismo)
    public void mostrarInfo() {
        System.out.println("Vehículo:");
        System.out.println("  Marca: " + marca);
        System.out.println("  Modelo: " + modelo);
    }
}
