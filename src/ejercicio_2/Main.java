/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2;

/**
 *
 * @author Arroquigarays
 */
public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(3.0),
            new Rectangulo(4.0, 2.5),
            new Circulo(1.5),
            new Rectangulo(10.0, 1.2)
        };

        for (Figura f : figuras) {
            System.out.println(f.getClass().getSimpleName() + " -> Área: " + f.calcularArea());
        }
    }
}