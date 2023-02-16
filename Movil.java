
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
}
