package Ejercicio4;

/**
 * The type Skill.
 */
public class Skill {

    private String name;
    private int kgFood;

    /**
     * Instantiates a new Skill.
     *
     * @param name   the name
     * @param kgFood the kg food
     */
    public Skill(String name, int kgFood) {
        this.name = name;
        this.kgFood = kgFood;
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
     * Gets kg food.
     *
     * @return the kg food
     */
    public int getKgFood() {
        return kgFood;
    }

    /**
     * Sets kg food.
     *
     * @param kgFood the kg food
     */
    public void setKgFood(int kgFood) {
        this.kgFood = kgFood;
    }

    @Override
    public String toString() {
        return "Truco=" + name +
                ", Consume=" + kgFood + "kg.";
    }
}
