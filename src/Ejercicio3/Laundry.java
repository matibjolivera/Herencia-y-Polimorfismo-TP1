package Ejercicio3;

/**
 * The type Laundry.
 */
public class Laundry extends Product {

    private float capacity;
    private boolean isAutomatic;
    /**
     * The constant CODE.
     */
    public static String CODE = "02";

    /**
     * Instantiates a new Laundry.
     *
     * @param brand        the brand
     * @param model        the model
     * @param serialNumber the serial number
     * @param voltage      the voltage
     * @param status       the status
     * @param price        the price
     * @param capacity     the capacity
     * @param isAutomatic  the is automatic
     */
    public Laundry(String brand, String model, String serialNumber, float voltage, boolean status, float price, float capacity, boolean isAutomatic) {
        super(brand, model, serialNumber, voltage, status, price);
        this.capacity = capacity;
        this.isAutomatic = isAutomatic;
    }

    /**
     * Gets capacity.
     *
     * @return the capacity
     */
    public float getCapacity() {
        return capacity;
    }

    /**
     * Sets capacity.
     *
     * @param capacity the capacity
     */
    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    /**
     * Is automatic boolean.
     *
     * @return the boolean
     */
    public boolean isAutomatic() {
        return isAutomatic;
    }

    /**
     * Sets automatic.
     *
     * @param automatic the automatic
     */
    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    @Override
    public String toString() {
        return super.toString() + "carga máxima " + this.getCapacity() + "kg., " +
                (this.isAutomatic() ? "automático" : "semiautomático") + ": " + "$" + this.getPrice();
    }
}
