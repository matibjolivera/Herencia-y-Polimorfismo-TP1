package Ejercicio1;

/**
 * The type Employee.
 */
public abstract class Employee {

    private String name;
    private int age;
    private float sallary;

    /**
     * Instantiates a new Employee.
     */
    public Employee() {
        this.name = "";
        this.age = 0;
        this.sallary = 0;
    }

    /**
     * Instantiates a new Employee.
     *
     * @param name    the name
     * @param age     the age
     * @param sallary the sallary
     */
    public Employee(String name, int age, float sallary) {
        this.name = name;
        this.age = age;
        this.sallary = sallary;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets sallary.
     *
     * @return the sallary
     */
    public double getSallary() {
        return sallary;
    }

    /**
     * Sets sallary.
     *
     * @param sallary the sallary
     */
    public void setSallary(float sallary) {
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wins=" + this.calculatePayment() +
                '}';
    }

    /**
     * Calculate payment float.
     *
     * @return the float
     */
    abstract public float calculatePayment();
}
