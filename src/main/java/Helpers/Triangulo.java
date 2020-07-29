package Helpers;

public class Triangulo extends Formas{
    // Estableciendo atributos para Triángulo
    public Triangulo (){
    EstablecerDibujo ("Triángulo");    
    EstablecerColor ("Naranja");
    }
    
    // Cálculo de Ángulo
    public int getAngulo (int anguloA, int anguloB, int anguloC){
    anguloA = 12;
    anguloB = 91;
    anguloC = 180 - (91 + 12);
    return anguloC;
    }
}
