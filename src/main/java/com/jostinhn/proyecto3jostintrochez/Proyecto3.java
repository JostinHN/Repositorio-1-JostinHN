package com.jostinhn.proyecto3jostintrochez;

// Jostin Alejandro Tróchez Argueta 
// Programación Orientada a Objetos
// Proyecto #3
// 17 de junio de 2020

public class Proyecto3 {

    public static void main(String[] args) {
    // Objeto ASTRONAUTA
    Astronauta astronauta = new Astronauta ();
    astronauta.setNombre ("¡Hola!\n\nMi nombre es Jostin Alejandro Tróchez Argueta");
    astronauta.setEdad (25);
    astronauta.setAltura (1.75);
    astronauta.setCarrera ("Ingeniería Electrónica en UTH, Licenciatura en Física en MIT");
    astronauta.setLugarTrabajo ("Empresa privada SpaceX");
    astronauta.setLogros ("2 viajes tripulados a la Estación Espacial Internacional");
    
    //Salida de datos para objeto ASTRONAUTA
        System.out.println(astronauta.getNombre());
        System.out.println("Edad: " + astronauta.getEdad() + " años");
        System.out.println("Altura: " + astronauta.getAltura() + " Mts.");
        System.out.println("Estudios: " + astronauta.getCarrera());
        System.out.println("Lugar de trabajo: " + astronauta.getLugarTrabajo());
        System.out.println("Logros: " + astronauta.getLogros());
    }
    
    //Lineas de código para nuestro objeto astronauta
    public static class Astronauta{
//Si hacemos uso de private, debemos de usar siempre los setters y los getters para extraer los datos        
private String nombre; 
private int edad;
private double altura;
private String carrera;
private String lugartrabajo;
private String logros;

//Hacemos uso del return para devolver nuestra variable al método principal 
    public String getNombre (){
    return nombre;}
    
    public int getEdad (){
    return edad;}
    
    public double getAltura (){
    return altura;}
    
    public String getCarrera (){
    return carrera;}
    
    public String getLugarTrabajo (){
    return lugartrabajo;}
        
    public String getLogros (){
    return logros;} 
    
 //Establecemos cada uno de los atributos, y para acceder a ellos dejamos los métodos en público   
    public void setNombre (String nombre){
    this.nombre = nombre;}
    
    public void setEdad (int edad){
    this.edad = edad;}
        
    public void setAltura (double altura){
    this.altura = altura;}
            
    public void setCarrera (String carrera){
    this.carrera = carrera;}
                
    public void setLugarTrabajo (String lugartrabajo){
    this.lugartrabajo = lugartrabajo;}
                    
    public void setLogros (String logros){
    this.logros = logros;}
    }   
}