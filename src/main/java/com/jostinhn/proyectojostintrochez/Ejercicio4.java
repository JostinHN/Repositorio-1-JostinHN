package com.jostinhn.proyectojostintrochez;

// Jostin Alejandro Tróchez Argueta 
// Programación Orientada a Objetos
// Ejercicio #4
// 8 de junio de 2020

public class Ejercicio4 {

    public static void main(String[] args) {
    String vector [] = new String [10];  
    
vector [0] = "Jose Ramos";
vector [1] = "Henry Avila";
vector [2] = "Magdaly Yanez";
vector [3] = "Cristopher Izaguirre";
vector [4] = "Jenifer Lopez";
vector [5] = "Grevin Solorzano";
vector [6] = "Genesis Ulloa";
vector [7] = "Esdras Ramos";
vector [8] = "Karen Mendoza";    
vector [9] = "Elias Galeas";

        System.out.println("NOMBRES DE COMPAÑEROS DE CLASE\n");
        for (int i=0; i<10; i++){
            System.out.println((i+1) + "["+vector[i]+"]");
        } 
}  
}
