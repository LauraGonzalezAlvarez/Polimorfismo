
package polimorfismo;

/**
 * Clase abstracta Tipo de nave
 *
 * @author Laura Daniela Gonzalez Alvarez
 */
public abstract class Ship {

    /**
     * Variable combustible
     */
    public String[] fuel = new String[3];

    /**
     * Variable empuje
     */
    public float push;
    /**
     * Variable peso
     */
    public float weight;
    /**
     * Variable velocidad de desplazamiento
     */
    public float velocity;

    /**
     *
     * @param fuel Variable combustible
     
     * @param push Variable empuje
     * @param weight Variable peso
     * @param velocity Variable velocidad de desplazamiento
     */
    public Ship(String[] fuel,  float push, float weight, float velocity) {
        this.fuel[0] = "Petroleo refinado";
        this.fuel[1] = "Oxigeno liquido";
        this.fuel[2] = "Otros";
        this.push = (float) 10.33;
        this.weight = (float) 139876.9;
        this.velocity = (float) 134.5;

    }   
    

    /**
     * Metodo para iniciar el vuelo
     */
    public abstract void flight();

    /**
     * Metodo para aterrizar
     */
    public void toland() {
        this.velocity = 0;
    }
/**
 * Método abstracto despegar
 */
    public abstract void takeOff(); 
 }
