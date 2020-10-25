package Ejercicio4;

import java.util.Date;

/**
 * The type Employee.
 */
abstract public class Employee {

    private String firstname;
    private String lastname;
    private Date startWorking;
    private Date finishWorking;

    /**
     * Instantiates a new Employee.
     *
     * @param firstname     the firstname
     * @param lastname      the lastname
     * @param startWorking  the start working
     * @param finishWorking the finish working
     */
    public Employee(String firstname, String lastname, Date startWorking, Date finishWorking) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.startWorking = startWorking;
        this.finishWorking = finishWorking;
    }

    /**
     * Gets firstname.
     *
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets firstname.
     *
     * @param firstname the firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets lastname.
     *
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets lastname.
     *
     * @param lastname the lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Gets start working.
     *
     * @return the start working
     */
    public Date getStartWorking() {
        return startWorking;
    }

    /**
     * Sets start working.
     *
     * @param startWorking the start working
     */
    public void setStartWorking(Date startWorking) {
        this.startWorking = startWorking;
    }

    /**
     * Gets finish working.
     *
     * @return the finish working
     */
    public Date getFinishWorking() {
        return finishWorking;
    }

    /**
     * Sets finish working.
     *
     * @param finishWorking the finish working
     */
    public void setFinishWorking(Date finishWorking) {
        this.finishWorking = finishWorking;
    }

    @Override
    public String toString() {
        return "[Nombre='" + firstname +
                ", Apellido='" + lastname +
                ", Comienzo horario laboral=" + startWorking +
                ", Fin horario laboral=" + finishWorking;
    }
}
