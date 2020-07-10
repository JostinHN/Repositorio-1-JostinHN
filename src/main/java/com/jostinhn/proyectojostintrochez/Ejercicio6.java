package com.jostinhn.proyectojostintrochez;

// Jostin Alejandro Tróchez Argueta 
// Programación Orientada a Objetos
// Ejercicio #6
// 9 de junio de 2020

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int nota1, nota2, nota3, nota4, nota5;
        
        System.out.println("NOTA DE 5 ESTUDIANTES\n");
        System.out.print("1. Nota de Daniel: ");
        nota1 = entrada.nextInt();
        
        System.out.print("2. Nota de Maria: ");
        nota2 = entrada.nextInt();
        
        System.out.print("3. Nota de Raul: ");
        nota3 = entrada.nextInt();
        
        System.out.print("4. Nota de Joyner: ");
        nota4 = entrada.nextInt();
        
        System.out.print("5. Nota de Roberto: ");
        nota5 = entrada.nextInt();
        
        System.out.println("\n\nNOMBRE\t\tNOTA\tEVALUACION");
        
System.out.print("\n1. Daniel\t"+nota1);
        
if (nota1 >= 70){
    System.out.println("\tAPROBADO");
} else {
    System.out.println("\tREPROBADO");}

System.out.print("\n2. Maria\t"+nota2);
        
if (nota2 >= 70){
    System.out.println("\tAPROBADO");
} else {
    System.out.println("\tREPROBADO");}

System.out.print("\n3. Raul\t\t"+nota3);
        
if (nota3 >= 70){
    System.out.println("\tAPROBADO");
} else {
    System.out.println("\tREPROBADO");}

System.out.print("\n4. Joyner\t"+nota4);
        
if (nota4 >= 70){
    System.out.println("\tAPROBADO");
} else {
    System.out.println("\tREPROBADO");}

System.out.print("\n5. Roberto\t"+nota5);
        
if (nota5 >= 70){
    System.out.println("\tAPROBADO");
} else {
    System.out.println("\tREPROBADO");}
}
}