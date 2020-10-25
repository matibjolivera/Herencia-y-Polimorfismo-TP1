package Ejercicio4;

import java.util.Date;

/**
 * The type Trainer.
 */
public class Trainer extends Employee {

    private int experienceYears;

    /**
     * Instantiates a new Employee.
     *
     * @param firstname       the firstname
     * @param lastname        the lastname
     * @param startWorking    the start working
     * @param finishWorking   the finish working
     * @param experienceYears the experience years
     */
    public Trainer(String firstname, String lastname, Date startWorking, Date finishWorking, int experienceYears) {
        super(firstname, lastname, startWorking, finishWorking);
        this.experienceYears = experienceYears;
    }

    /**
     * Gets experience years.
     *
     * @return the experience years
     */
    public int getExperienceYears() {
        return experienceYears;
    }

    /**
     * Sets experience years.
     *
     * @param experienceYears the experience years
     */
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return super.toString() + ", Años de experiencia=" + experienceYears + "]";
    }
}
