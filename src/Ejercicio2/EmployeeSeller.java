package Ejercicio2;

import Ejercicio1.EmployeeOutsourced;

/**
 * The type Employee seller.
 */
public class EmployeeSeller extends EmployeeOutsourced {

    private float percentage;

    /**
     * Instantiates a new Employee seller.
     *
     * @param percentage the percentage
     */
    public EmployeeSeller(float percentage) {
        this.percentage = percentage;
    }

    /**
     * Instantiates a new Employee seller.
     *
     * @param name          the name
     * @param age           the age
     * @param sallary       the sallary
     * @param quantityHours the quantity hours
     * @param percentage    the percentage
     */
    public EmployeeSeller(String name, int age, float sallary, float quantityHours, float percentage) {
        super(name, age, sallary, quantityHours);
        this.percentage = percentage;
    }

    /**
     * Gets percentage.
     *
     * @return the percentage
     */
    public float getPercentage() {
        return percentage;
    }

    /**
     * Sets percentage.
     *
     * @param percentage the percentage
     */
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public float calculatePayment() {
        return super.calculatePayment() * ((100 + percentage) / 100);
    }
}
