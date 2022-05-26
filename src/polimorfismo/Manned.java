
package polimorfismo;

/**
 * Clase Tipo de nave Tripulada
 *
 * @author Laura Daniela Gonzalez Alvarez
 */
public class Manned extends Ship {

    /**
     * Variable cantidad de personas
     */
    public int cantPersons;
    /**
     * Variable encender
     */
    private boolean turnOn = false;
    /**
     * Variable que Frena el motor
     */
    private boolean brake = true;

    /**
     * Constructor de la clase
     *
     * @param cantPersons Cantidad de personas permitidas en la nave
     * @param fuel Vector combustible = vacio ya que no utiliza combustible
     * @param push Variable empuje ya que no utiliza empuje
     * @param weight Variable peso
     * @param velocity Variable velocidad de desplazamieto
     */
    public Manned(int cantPersons, String[] fuel, float push, float weight, float velocity) {
        super(fuel, push, weight, velocity);
        this.cantPersons = cantPersons;
        this.push = 0;
        this.fuel[0] = "";
        this.fuel[1] = "";
        this.fuel[2] = "";
    }

    /**
     * Metodo abstracto para iniciar el vuelo encendiendo el motor, aumentando
     * la velocidad y verificando la cantidad de personas admitidas en la nave
     * tribupada
     */
    @Override
    public void flight() {
        this.turnOn = true;
        System.out.println("Encendiendo nave");
        this.velocity = (float) 0.1;
        System.out.println("Aumentando velocidad");
        this.cantPersons = cantPersons;
        System.out.println("validanddo la cantidad de personas permitidas: " + cantPersons);
        System.out.println("Nave encendida y preparada para despegar\n");

    }

    /**
     * Metodo abstracto para despegar la nave solo si está encendido el motor,
     * aumentando la velocidad y retirando el freno
     */
    @Override
    public void takeOff() {
        if (turnOn) {
            for (int i = 0; i < 10; i++) {
                this.velocity = (float) (velocity + 0.99);
                System.out.println("velocidad: " + velocity);
            }
            this.brake = false;
            System.out.println("Se retira el freno de mano");
            System.out.println("Nave despegada\n");
        } else {
            System.out.println("por favor encender primero la nave\n");
        }
    }
/**
     * Metodo abstracto para aterrizar la nave, bajando la velocidad colocando el freno
     * y apagando el motor 
     */
    @Override
    public void toland() {
        this.velocity = 0;
        System.out.println("Disminuyendo velocidad: " + velocity);
        this.brake = true;
        System.out.println("Iniciando freno: " + brake);
        this.turnOn = false;
        System.out.println("Nave aterrizada\n");

    }

}
