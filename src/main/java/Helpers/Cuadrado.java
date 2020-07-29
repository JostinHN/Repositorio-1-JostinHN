package Helpers;

public class Cuadrado extends Formas{
    // Estableciendo atributos para Cuadrado
    public Cuadrado (){
    EstablecerDibujo ("Cuadrado");    
    EstablecerColor ("Negro");
    }
    
    // Cálculo de Área
    public int getArea (int largo, int ancho, int area){
    largo = 59;
    ancho = 24;
    area = largo * ancho;
    return area;
    }
}
