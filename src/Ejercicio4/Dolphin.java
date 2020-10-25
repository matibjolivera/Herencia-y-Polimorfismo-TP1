package Ejercicio4;

import java.util.ArrayList;

/**
 * The type Dolphin.
 */
public class Dolphin extends Animal {

    private Trainer trainer;

    /**
     * Instantiates a new Animal.
     *
     * @param name    the name
     * @param weight  the weight
     * @param size    the size
     * @param skills  the skills
     * @param trainer the trainer
     */
    public Dolphin(String name, double weight, double size, ArrayList<Skill> skills, Trainer trainer) {
        super(name, weight, size, skills);
        this.trainer = trainer;
        this.foodType = FoodType.OCTOPUS;
    }

    /**
     * Gets trainer.
     *
     * @return the trainer
     */
    public Trainer getTrainer() {
        return trainer;
    }

    /**
     * Sets trainer.
     *
     * @param trainer the trainer
     */
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Entrenador=" + trainer +
                ", Alimento=" + foodType;
    }
}
