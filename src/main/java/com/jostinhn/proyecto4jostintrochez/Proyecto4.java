package com.jostinhn.proyecto4jostintrochez;

// Jostin Alejandro Tróchez Argueta 
// Programación Orientada a Objetos
// Ejercicio Encapsulamiento y Abstracción
// 30 de junio de 2020
// Enlace de video explicado en YouTube: https://youtu.be/zRgYccx92jU

import Clases.Ciudadano; //Importación de clase ciudadano

import Clases.Brasil; // Importación de
import Clases.Honduras; // las tres 
import Clases.México; // clases de países 

public class Proyecto4 {
    
    public static void main (String [] args){
    //INICIO PARTE 1
    Ciudadano ciudadano = new Ciudadano (); //Instancia de clase Ciudadano
    
    //Acceso a la impresión de atributos (Nombre, edad, años de experiencia) 
    ciudadano.setNombre("Jostin Alejandro Tróchez");
    ciudadano.setEdad(31);
    ciudadano.setAñosExperiencia(5);
    
    //Impresión de atributos privados con los Getters de la clase Ciudadano
        System.out.println("Nombre del ciudadano: " + ciudadano.getNombre());
        System.out.println("Edad: " + ciudadano.getEdad() + " años");
        System.out.println("Años de experiencia en el trabajo: " + ciudadano.getAñosExperiencia() + " años");
    //FINAL PARTE 1
    
    //INICIO PARTE 2
    Honduras HN = new Honduras (); //Instancia de clase Honduras 
    México MX = new México (); //Instancia de clase México
    Brasil BR = new Brasil (); //Instancia de clase Brasil  
    
    //Impresión de atributos con ayuda de la clase abstracta Pais
        System.out.println("\n\n1. País: " + HN.getPais());
        System.out.println("Presidente: " + HN.getPresidente());
        
        System.out.println("2. País: " + MX.getPais());
        System.out.println("Presidente: " + MX.getPresidente());
        
        System.out.println("3. País: " + BR.getPais());
        System.out.println("Presidente: " + BR.getPresidente());
    //FINAL PARTE 2
    }
}