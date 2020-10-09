package Ejercicio1;

/**
 * The type Employee salaried.
 */
public class EmployeeSalaried extends Employee {

    /**
     * Instantiates a new Employee salaried.
     */
    public EmployeeSalaried() {
        super();
    }

    /**
     * Instantiates a new Employee salaried.
     *
     * @param name    the name
     * @param age     the age
     * @param sallary the sallary
     */
    public EmployeeSalaried(String name, int age, float sallary) {
        super(name, age, sallary);
    }

    @Override
    public float calculatePayment() {
        return (float)this.getSallary();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
