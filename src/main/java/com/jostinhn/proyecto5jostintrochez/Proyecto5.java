package com.jostinhn.proyecto5jostintrochez;

// Jostin Alejandro Tróchez Argueta 
// Programación Orientada a Objetos
// Ejercicio Herencia
// 7 de julio de 2020
// Enlace de video explicado en YouTube: https://youtu.be/6_a0oFpEo9A

// Importación de clases 
import Helpers.Circulo;
import Helpers.Cuadrado;
import Helpers.Linea;
import Helpers.Triangulo;

public class Proyecto5 {

    public static void main(String[] args) {
        //Instanciando las clases
        Circulo circulo = new Circulo ();
        Linea linea = new Linea ();
        Triangulo triangulo = new Triangulo ();
        Cuadrado cuadrado = new Cuadrado ();
        
        // Impresión de todos los datos proporcionados por las Clases
        System.out.println("PROYECTO #5: HERENCIA");
        
        circulo.imprimir();
        System.out.println("Radio: " + circulo.getRadio(0, 0) + " cm");
        
        linea.imprimir();
        System.out.println("Largo: " + linea.getLargo() + " mts");
        
        triangulo.imprimir();
        System.out.println("Ángulo C: " + triangulo.getAngulo(0, 0, 0) + "º");
        
        cuadrado.imprimir();     
        System.out.println("Área: " + cuadrado.getArea(0, 0, 0) + " cm");            
    } 
}
