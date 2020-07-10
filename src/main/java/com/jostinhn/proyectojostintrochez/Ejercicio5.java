package com.jostinhn.proyectojostintrochez;

// Jostin Alejandro Tróchez Argueta 
// Ejercicio #5
// 8 de junio de 2020

public class Ejercicio5 {

    public static void main(String[] args) {
    
        System.out.println("DATOS PERSONALES DE MIS COMPAÑEROS DE CLASE\n");
        int filas = 5, columnas = 4;
        String matriz [][] = new String [filas][columnas];
        
        matriz [0][0] = "1. [Daniel]\t"; matriz [0][1] = "[Doblado]\t"; matriz [0][2] = "[Ing. Industrial]\t"; matriz [0][3] = "[Televicentro]";
        matriz [1][0] = "2. [Kenia]\t"; matriz [1][1] = "[Bautista]\t"; matriz [1][2] = "[Ing. Industrial]\t"; matriz [1][3] = "[Del Corral]";
        matriz [2][0] = "3. [Kevin]\t"; matriz [2][1] = "[Zelaya]\t"; matriz [2][2] = "[Ing. Industrial]\t"; matriz [2][3] = "[La Curacao]";
        matriz [3][0] = "4. [Daniel]\t"; matriz [3][1] = "[Rodriguez]\t"; matriz [3][2] = "[Ing. Industrial]\t"; matriz [3][3] = "[EEH]";
        matriz [4][0] = "5. [Jairo]\t"; matriz [4][1] = "[Pineda]\t"; matriz [4][2] = "[Ing. Electronica]\t"; matriz [4][3] = "[Canal 11]";
        
        System.out.println("NOMBRE\t\tAPELLIDO\tCARRERA\t\t\tLUGAR DE TRABAJO\n");
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
            System.out.print(matriz[i][j]);
            }
            System.out.println("");   
        }   
    }
}
