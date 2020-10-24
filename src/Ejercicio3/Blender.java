package Ejercicio3;

/**
 * The type Blender.
 */
public class Blender extends Product {

    private float power;
    private int quantitySpeeds;
    public static String CODE = "03";

    /**
     * Instantiates a new Blender.
     *
     * @param brand          the brand
     * @param model          the model
     * @param serialNumber   the serial number
     * @param voltage        the voltage
     * @param status         the status
     * @param price          the price
     * @param power          the power
     * @param quantitySpeeds the quantity speeds
     */
    public Blender(String brand, String model, String serialNumber, float voltage, boolean status, float price, float power, int quantitySpeeds) {
        super(brand, model, serialNumber, voltage, status, price);
        this.power = power;
        this.quantitySpeeds = quantitySpeeds;
    }

    /**
     * Gets power.
     *
     * @return the power
     */
    public float getPower() {
        return power;
    }

    /**
     * Sets power.
     *
     * @param power the power
     */
    public void setPower(float power) {
        this.power = power;
    }

    /**
     * Gets quantity speeds.
     *
     * @return the quantity speeds
     */
    public int getQuantitySpeeds() {
        return quantitySpeeds;
    }

    /**
     * Sets quantity speeds.
     *
     * @param quantitySpeeds the quantity speeds
     */
    public void setQuantitySpeeds(int quantitySpeeds) {
        this.quantitySpeeds = quantitySpeeds;
    }

    @Override
    public String toString() {
        return super.toString() + this.getPower() + "W, " + " de " + this.getQuantitySpeeds() + " velocidades" + ": $" + this.getPrice();
    }
}
