package com.jostinhn.proyectojostintrochez;

// Jostin Alejandro Tróchez Argueta 
// Programación Orientada a Objetos
// Ejercicio #3
// 8 de junio de 2020

public class Ejercicio3 {

    public static void main(String[] args) {
       int M = 6, T = 1, K = -10, division = 0, suma = 0, resta = 0;
       
     division = T / K;
     suma = M + T;
     resta = M - T;
        
       System.out.println("M = 6, T = 1, K = -10\n");
       
       System.out.println("M > T");
       if (M > T){
           System.out.println("El enunciado es verdadero\n");
       } else{
           System.out.println("El enunciado es falso\n");
       }
       
       System.out.println("T/K = -5");
       if (division == -5){
           System.out.println("El enunciado es verdadero\n");
       } else {   
           System.out.println("El enunciado es falso\n");      
       }
       
       System.out.println("M + T = 7 o M - T = 5");
       if ((suma == 7)||(resta == 5)){
           System.out.println("El enunciado es verdadero\n");
       } else {   
           System.out.println("El enunciado es falso\n");
       }
    }   
}
