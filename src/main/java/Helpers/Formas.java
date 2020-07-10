package Helpers;

public class Formas {
    // Atributos 
    private String Color;
    private String Dibujar;
 
    public Formas (){
    // Constructor vacío
    }
    
    // Establecer y conseguir color de la forma
    public void EstablecerColor (String Color){
    this.Color = Color;}
    
    public String obtenerColor (){
    return this.Color;
    }
    
    // Establecer y conseguir dibujo
    public void EstablecerDibujo (String Dibujar){
    this.Dibujar = Dibujar;}
    
    public String obtenerDibujo (){
    return this.Dibujar;
    }
    
    // Impresión para el método principal
    public void imprimir (){
        System.out.println("\nForma: " + Dibujar);
        System.out.println("Color: " + Color);
    }
}
