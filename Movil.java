
/**
 * Write a description of class Movil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movil
{
    // instance variables - replace the example below with your own
    private String marca;
    private boolean encendido;
    private Procesador GPU;

    /**
     * Constructor for objects of class Movil
     */
    public Movil(String marca)
    {
        this.marca = marca;
        encendido = false;
        GPU = new Procesador("",5);
    }
    public String getMarca(){
        return marca;
    }
    public boolean getEncendido(){
        return encendido;
    }
    public Procesador getGPU(){
        return GPU;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setEncendido(boolean estado) {
        encendido = estado;
    }
    public void GPU(String modelo, int potencia) {
        GPU = new Procesador(modelo, potencia);
    }
    public void imprimirDetalles() {
        System.out.println("Marca: " + marca + " | Encendido: " + encendido + " | GPU: " + GPU);
    }
}
