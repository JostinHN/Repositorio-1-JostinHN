package proyecto7jostintrochez;

public class ConversionesDivisas {
    private double valor, resultado;
    private int divisa, otradivisa;
       
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getOtradivisa() {
        return otradivisa;
    }

    public void setOtradivisa(int otradivisa) {
        this.otradivisa = otradivisa;
    }

    public ConversionesDivisas() {
        // Constructor vacío
    }
    
    // Operaciones de las tres divisas
    public double convertir (){
        // Operación del Dolar 
        if (divisa==0 && otradivisa==1){
            resultado = valor * 0.85;
        } else if (divisa ==0 && otradivisa==0){
        resultado = valor;}
        
        if (divisa==0 && otradivisa==2){
            resultado = valor * 24.77;}
        
        if (divisa==1 && otradivisa==0){
            resultado = valor * 1.17;
        } else if (divisa ==1 && otradivisa==1){
        resultado = valor;}
        
        if (divisa==1 && otradivisa==2){
            resultado = valor * 29.05;}
        
        if (divisa==2 && otradivisa==0){
            resultado = valor * 0.034;
        } else if (divisa ==2 && otradivisa==2){
        resultado = valor;}
        
        if (divisa==2 && otradivisa==1){
            resultado = valor * 0.040;}
        
        return resultado;
    }
}