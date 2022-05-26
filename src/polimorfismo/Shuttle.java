
package polimorfismo;

/**
 * Clase Tipo de nave Lanzadera
 *
 * @author Laura Daniela Gonzalez Alvarez
 */
public class Shuttle extends Ship {

    /**
     * Variable capacidad para transportar
     */
    private float carrying_capacity = (float) 0.1;
    /**
     * Variable potencia
     */
    public float power = (float) 1000000.89;
    /**
     * Variable para encender la nave
     */
    private boolean turOn = false;
    /**
     * Variable que asigna el freno a la nave
     */
    private boolean brake = true;

    /**
     * Constructor de la clase     *
     * @param carrying_capacity Capacidad de personas en la nave
     * @param power Potencia de la nave
     * @param fuel Tipos de combustible que utiliza la nave
     * @param push Empuje de la nave
     * @param weight Peso de la nave
     * @param velocity Velocidad de desplazamiento de la nave
     */
    public Shuttle(float carrying_capacity, float power, String[] fuel, float push, float weight, float velocity) {
        super(fuel, push, weight, velocity);
        this.power = power;
    }
    /**
     * Método abstracto para iniciar el vuelo de la nave
     */

    @Override
    public void flight() {
        this.turOn = true;
        System.out.println("Encendiendo nave");
        this.velocity = (float) 0.1;
        System.out.println("Aumentando velocidad");
        System.out.println("Verificando capacidad de transportar: " + carrying_capacity);
        System.out.println("Nave encendida y preparada para despegar");

    }
    /**
     * Método abstracto para despegar la nave
     */

    @Override
    public void takeOff() {
        if (turOn) {
            for (int i = 0; i < 10; i++) {
                this.velocity = (float) (velocity + 0.99);
                System.out.println("velocidad: " + velocity);

            }
            this.brake = false;
            System.out.println("Se retira el freno de mano");
            System.out.println("Nave despegada");
        } else {
            System.out.println("por favor encender primero la nave");
        }

    }
/**
 * Método abstracto para aterrizar la nave
 */
    @Override
    public void toland() {
        this.velocity = 0;
        System.out.println("Disminuyendo velocidad: " + velocity);
        this.brake = true;
        System.out.println("Iniciando freno: " + brake);
        this.turOn = false;
        System.out.println("Nave aterrizada");

    }

}
