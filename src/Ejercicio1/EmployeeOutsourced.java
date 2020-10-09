package Ejercicio1;

/**
 * The type Employee outsourced.
 */
public class EmployeeOutsourced extends Employee {

    private float quantityHours;

    /**
     * Instantiates a new Employee outsourced.
     */
    public EmployeeOutsourced() {
        super();
    }

    /**
     * Instantiates a new Employee outsourced.
     *
     * @param name          the name
     * @param age           the age
     * @param sallary       the sallary
     * @param quantityHours the quantity hours
     */
    public EmployeeOutsourced(String name, int age, float sallary, float quantityHours) {
        super(name, age, sallary);
        this.quantityHours = quantityHours;
    }

    /**
     * Gets hours quantity.
     *
     * @return the hours quantity
     */
    public float getQuantityHours() {
        return quantityHours;
    }

    /**
     * Sets hours quantity.
     *
     * @param quantityHours the hours quantity
     */
    public void setQuantityHours(float quantityHours) {
        this.quantityHours = quantityHours;
    }

    @Override
    public float calculatePayment() {
        return (float) (this.getSallary() * this.getQuantityHours());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
