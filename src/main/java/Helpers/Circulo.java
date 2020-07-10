package Helpers;

public class Circulo extends Formas{
    // Estableciendo atributos para Círculo
    public Circulo (){
    EstablecerDibujo ("Círculo");    
    EstablecerColor ("Verde");
    }
    
    // Cálculo de radio
    public int getRadio (int diametro, int radio){
    diametro = 48;
    radio = diametro / 2;
    return radio;
    }
}
