/**
 * Proyecto practicando el flujo de trabajo básico en colaboracion
 */

public class Procesador {
    
    private String modelo;
    
    private int potencia;
    
    public Procesador(String modelo, int potencia) {
        this.modelo = modelo;
        this.potencia = potencia;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getPotencia(){
        return potencia;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
}