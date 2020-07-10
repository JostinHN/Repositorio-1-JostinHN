package com.jostinhn.proyectojostintrochez;

// Jostin Alejandro Tróchez Argueta 
// Programación Orientada a Objetos
// Ejercicio #2
// 8 de junio de 2020

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
    Scanner entrada = new Scanner (System.in);
    String nombre = "";
    int num1 = 0, num2 = 0, suma = 0, resta = 0, producto = 0, division = 0, mod = 0;
    
        System.out.println("¿Cual es tu nombre?");
        nombre = entrada.nextLine();
    
        System.out.println("Ingrese dos numeros enteros: ");
    num1 = entrada.nextInt();
    num2 = entrada.nextInt();
    
    suma = num1 + num2;
    resta = num1 - num2;
    producto = num1 * num2;
    division = num1 / num2;
    mod = num1 % num2;
    
        System.out.println("\nHola " + nombre + "\n");
        System.out.println("La suma es igual a: " + suma);
        System.out.println("La resta es igual a: " + resta);
        System.out.println("El producto igual a: " + producto);
        System.out.println("La division es igual a: " + division);
        System.out.println("Mod es igual a: " + mod);
    }
}
