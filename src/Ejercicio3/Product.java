package Ejercicio3;

/**
 * The type Product.
 */
public class Product {

    private String brand;
    private String model;
    private String serialNumber;
    private float voltage;
    private boolean status;
    private float price;

    /**
     * Instantiates a new Product.
     *
     * @param brand        the brand
     * @param model        the model
     * @param serialNumber the serial number
     * @param voltage      the voltage
     * @param status       the status
     * @param price        the price
     */
    public Product(String brand, String model, String serialNumber, float voltage, boolean status, float price) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.voltage = voltage;
        this.status = status;
        this.price = price;
    }

    /**
     * Gets brand.
     *
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets brand.
     *
     * @param brand the brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Gets model.
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets model.
     *
     * @param model the model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets serial number.
     *
     * @return the serial number
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets serial number.
     *
     * @param serialNumber the serial number
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Gets voltage.
     *
     * @return the voltage
     */
    public float getVoltage() {
        return voltage;
    }

    /**
     * Sets voltage.
     *
     * @param voltage the voltage
     */
    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    /**
     * Is status boolean.
     *
     * @return the boolean
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.getBrand() + ',' + " modelo: " + this.getModel() + ", ";
    }
}
