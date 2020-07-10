package Clases;

public class Ciudadano {
    //Declaración de atributos con acceso privado
    private String nombre;
    private int edad;
    private int añosexperiencia;
    
    //Métodos para retornar los atributos de clase Ciudadano
    public String getNombre (){
    return nombre;}
    
    public int getEdad (){
    return edad;} 
    
    public int getAñosExperiencia (){
    return añosexperiencia;}
    
    //Constructor público tipo vacío de clase Ciudadano, para acceder a las variables Private
    public void setNombre (String nombre){
        this.nombre = nombre;}
    
    public void setEdad (int edad){
        this.edad = edad;}
        
    public void setAñosExperiencia (int añosexperiencia){
        this.añosexperiencia =  añosexperiencia;}    

}
