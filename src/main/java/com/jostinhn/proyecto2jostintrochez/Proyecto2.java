package com.jostinhn.proyecto2jostintrochez;

// Jostin Alejandro Tróchez Argueta 
// Programación Orientada a Objetos
// Proyecto #2
// 14 de junio de 2020

import java.util.Scanner;

public class Proyecto2 {
     public static void main(String[] args){ 
     Recursos recursos = new Recursos (); //Clase principal
     recursos.Metodo1 (); // Método sencillo 
     recursos.Metodo2 (68); // Método con parámetro entero 
     recursos.Metodo3 (0, 0, 0); // Método con parámetros para capturar datos 
     recursos.Metodo4 (0, 1); // Método con paramétros para capturar datos y contar desde uno  
     }
    
     //INICIO CLASE PRINCIPAL
     public static class Recursos {
     public void Metodo1 (){
     System.out.println("METODO #1: COMENTARIO\nEstoy aprendiendo, pero seré el mejor programador del mundo.\n");}
     
     public void Metodo2 (int entero){
     System.out.println("METODO #2: EVALUACION DE ESTUDIANTE");
     if (entero >= 70){
            System.out.println("APROBADO\n");
        } else {
            System.out.println("REPROBADO\n");}    
     }
     
     public void Metodo3 (int num1, int num2, int division){
     Scanner entrada = new Scanner (System.in); //Llamada a Scanner para capturar datos del usuario
     
     System.out.println("METODO #3: DIVISION\nIngrese dos numeros enteros: ");
        num1 = entrada.nextInt();
        System.out.println("entre");
        num2 = entrada.nextInt();
        
        if (num2 == 0){ //Insertamos la condición de una división
            System.out.println("El resultado es un numero infinito\n");}
        
        division = num1 / num2;
        
        System.out.println("La division es igual a: " + division + "\n");}
     
     public void Metodo4 (int lista, int contador){
     Scanner entrada = new Scanner (System.in); //Nuevamente llamada a Scanner para capturar datos 
        System.out.print("METODO #4: LISTA DE NUMEROS DEL 1 AL X\nIngrese un numero: ");
        lista = entrada.nextInt();
        
        while (contador <= lista){ // Contador hará su función y a la vez imprimirá los números hasta llegar a lista     
            System.out.print("["+ contador +"] ");          
        contador++;}}
     } // FIN CLASE PRINCIPAL
}
