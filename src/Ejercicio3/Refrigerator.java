package Ejercicio3;

/**
 * The type Refrigerator.
 */
public class Refrigerator extends Product {

    private float capacity;
    private boolean isNoFrost;
    /**
     * The constant CODE.
     */
    public static String CODE = "04";

    /**
     * Instantiates a new Refrigerator.
     *
     * @param brand        the brand
     * @param model        the model
     * @param serialNumber the serial number
     * @param voltage      the voltage
     * @param status       the status
     * @param price        the price
     * @param capacity     the capacity
     * @param isNoFrost    the is no frost
     */
    public Refrigerator(String brand, String model, String serialNumber, float voltage, boolean status, float price, float capacity, boolean isNoFrost) {
        super(brand, model, serialNumber, voltage, status, price);
        this.capacity = capacity;
        this.isNoFrost = isNoFrost;
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
     * Is no frost boolean.
     *
     * @return the boolean
     */
    public boolean isNoFrost() {
        return isNoFrost;
    }

    /**
     * Sets no frost.
     *
     * @param noFrost the no frost
     */
    public void setNoFrost(boolean noFrost) {
        isNoFrost = noFrost;
    }

    @Override
    public String toString() {
        return super.toString() + (this.isNoFrost() ? "no " : "") + "frost, capacidad: " + this.getCapacity() + " litros:" + " $" + this.getPrice();
    }
}
