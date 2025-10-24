/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Arroquigarays
 */
public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());
        animales.add(new Perro());
        animales.add(new Gato());

        // Cada animal ejecuta su propia versión de hacerSonido()
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
