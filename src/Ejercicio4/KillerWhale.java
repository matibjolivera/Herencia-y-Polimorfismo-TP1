package Ejercicio4;

import java.util.ArrayList;

/**
 * The type Killer whale.
 */
public class KillerWhale extends Animal {

    /**
     * Instantiates a new Animal.
     *
     * @param name   the name
     * @param weight the weight
     * @param size   the size
     * @param skills the skills
     */
    public KillerWhale(String name, double weight, double size, ArrayList<Skill> skills) {
        super(name, weight, size, skills);
        this.foodType = FoodType.SQUID;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Alimento=" + foodType;
    }
}