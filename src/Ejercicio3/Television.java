package Ejercicio3;

/**
 * The type Television.
 */
public class Television extends Product {

    private float inches;
    private boolean isSmart;
    /**
     * The constant CODE.
     */
    public static String CODE = "01";

    /**
     * Instantiates a new Television.
     *
     * @param brand        the brand
     * @param model        the model
     * @param serialNumber the serial number
     * @param voltage      the voltage
     * @param status       the status
     * @param price        the price
     * @param inches       the inches
     * @param isSmart      the is smart
     */
    public Television(String brand, String model, String serialNumber, float voltage, boolean status, float price, float inches, boolean isSmart) {
        super(brand, model, serialNumber, voltage, status, price);
        this.inches = inches;
        this.isSmart = isSmart;
    }

    /**
     * Gets inches.
     *
     * @return the inches
     */
    public float getInches() {
        return inches;
    }

    /**
     * Sets inches.
     *
     * @param inches the inches
     */
    public void setInches(float inches) {
        this.inches = inches;
    }

    /**
     * Is smart boolean.
     *
     * @return the boolean
     */
    public boolean isSmart() {
        return isSmart;
    }

    /**
     * Sets smart.
     *
     * @param smart the smart
     */
    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + this.getInches() + " pulgadas, " + (this.isSmart ? "smart" : "") + ": $" + this.getPrice();
    }
}
