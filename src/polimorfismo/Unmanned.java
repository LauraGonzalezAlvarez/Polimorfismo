
package polimorfismo;

/**
 * Clase Tipo de nave no tripulada
 *
 * @author Laura Daniela Gonzalez Alvarez
 */
public class Unmanned extends Ship {

    /**
     * Variable numero de motores
     */
    public int motors = 4;
    /**
     * Variable booleana para iniciar el motor de la nave
     */
    private boolean startMotors = false;
    /**
     * Variable booleana de freno
     */

    private boolean brake = true;

    /**
     * Constructor de la clase
     *
     *
     * @param fuel Tipos de combustible que utiliza la nave
     * @param push Empuje de la nave
     * @param weight Peso de la nave
     * @param velocity Velocidad de desplazamiento de la nave
     */
    public Unmanned(int motors, String[] fuel, float push, float weight, float velocity) {
        super(fuel, push, weight, velocity);
        this.motors = motors;
        this.push = (float) 5.5;
    }

    /**
     * Metodo abstracto para iniciar el vuelo encendiendo el motor, aumentando
     * la velocidad
     */
    @Override
    public void flight() {
        this.startMotors = true;
        System.out.println("Encendiento motor");
        this.velocity = (float) 0.01;
        System.out.println("Aumentando velocidad");
        System.out.println("Nave encendida y preparada para despegar");
    }

    /**
     * Metodo abstracto para despegar la nave solo si está encendido el motor,
     * aumentando la velocidad y retirando el freno
     */
    @Override
    public void takeOff() {
        if (startMotors) {
            for (int i = 0; i < 10; i++) {
                this.velocity = (float) (velocity + 0.99);
                System.out.println("velocidad: " + velocity);
            }
            this.brake = false;
            System.out.println("Se retira el freno de mano");
            System.out.println("Nave despegada");

        } else {
            System.out.println("por favor encender primero el motor");
        }
    }

    /**
     * Metodo abstracto para aterrizar la nave, bajando la velocidad colocando
     * el freno y apagando el motor
     */
    @Override
    public void toland() {
        this.velocity = 0;
        System.out.println("Disminuyendo velocidad: " + velocity);
        this.brake = true;
        System.out.println("Iniciando freno: " + brake);
        this.startMotors = false;
        System.out.println("Apagando motores: " + startMotors);
        System.out.println("Nave aterrizada");

    }
}
