
package polimorfismo;

/**
 * Clase MixedShip que hereda de la clase Shuttle e implementa la interface
 * MixedShipInterface
 *
 * @author Laura Daniela Gonzalez Alvarez
 */
public class MixedShip extends Shuttle implements MixedShipInterface {

    /**
     * Variable para el estado de la nave
     */
    private boolean statusShip = false;

    /**
     * Constructor de la clase
     *
     * @param carrying_capacity Capacidad de personas en la nave
     * @param power Potencia de la nave
     * @param fuel Tipos de combustible que utiliza la nave
     * @param push Empuje de la nave
     * @param weight Peso de la nave
     * @param velocity Velocidad de desplazamiento de la nave
     */
    public MixedShip(float carrying_capacity, float power, String[] fuel, float push, float weight, float velocity) {
        super(carrying_capacity, power, fuel, push, weight, velocity);
    }

    /**
     * ´Implementación del método abstracto de la interface MixedShipInterface
     * que cambia el estado de la variable statusShip
     */
    @Override
    public void sortOut() {
        statusShip = true;
        System.out.println("Estado de la nave defectuoso:" + statusShip);

    }
}
