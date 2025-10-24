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
        Circulo circulo1 = new Circulo(3.0);
        Rectangulo rectangulo1 = new Rectangulo(4.0, 2.5);
        Circulo circulo2 = new Circulo(1.5);
        Rectangulo rectangulo2 = new Rectangulo(10.0, 1.2);

        System.out.println("Area del circulo1: " + circulo1.calcularArea());
        System.out.println("Area del rectangulo1: " + rectangulo1.calcularArea());
        System.out.println("Area del circulo2: " + circulo2.calcularArea());
        System.out.println("Area del rectangulo2: " + rectangulo2.calcularArea());
    }
}