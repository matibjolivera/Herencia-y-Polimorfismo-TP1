package Ejercicio4;

import java.util.Date;

/**
 * The type Carer.
 */
public class Carer extends Employee {

    private int maxQuantityAnimalsToCareFor;
    private int currentQuantityAnimals;

    /**
     * Instantiates a new Carer.
     *
     * @param firstname                   the firstname
     * @param lastname                    the lastname
     * @param startWorking                the start working
     * @param finishWorking               the finish working
     * @param maxQuantityAnimalsToCareFor the max quantity animals to care for
     */
    public Carer(String firstname, String lastname, Date startWorking, Date finishWorking, int maxQuantityAnimalsToCareFor) {
        super(firstname, lastname, startWorking, finishWorking);
        this.maxQuantityAnimalsToCareFor = maxQuantityAnimalsToCareFor;
        this.currentQuantityAnimals = 0;
    }

    /**
     * Gets max quantity animals to care for.
     *
     * @return the max quantity animals to care for
     */
    public int getMaxQuantityAnimalsToCareFor() {
        return maxQuantityAnimalsToCareFor;
    }

    /**
     * Sets max quantity animals to care for.
     *
     * @param maxQuantityAnimalsToCareFor the max quantity animals to care for
     */
    public void setMaxQuantityAnimalsToCareFor(int maxQuantityAnimalsToCareFor) {
        this.maxQuantityAnimalsToCareFor = maxQuantityAnimalsToCareFor;
    }

    /**
     * Gets current quantity animals.
     *
     * @return the current quantity animals
     */
    public int getCurrentQuantityAnimals() {
        return currentQuantityAnimals;
    }

    /**
     * Sets current quantity animals.
     *
     * @param currentQuantityAnimals the current quantity animals
     */
    public void setCurrentQuantityAnimals(int currentQuantityAnimals) {
        this.currentQuantityAnimals = currentQuantityAnimals;
    }

    /**
     * Can add animal boolean.
     *
     * @return the boolean
     */
    public boolean canAddAnimal() {
        return this.getCurrentQuantityAnimals() < this.getMaxQuantityAnimalsToCareFor();
    }

    @Override
    public String toString() {
        return super.toString() + ", Cantidad máxima de animales para cuidar=" + maxQuantityAnimalsToCareFor + "]";
    }

    /**
     * Can do skill boolean.
     *
     * @param skill the skill
     * @param food  the food
     * @return the boolean
     */
    public boolean canDoSkill(Skill skill, Food food) {
        boolean result = false;
        if (skill.getKgFood() <= food.getStock()) {
            result = true;
        }
        return result;
    }

    /**
     * Discount food stock.
     *
     * @param food     the food
     * @param discount the discount
     */
    public void discountFoodStock(Food food, int discount) {
        food.setStock(food.getStock() - discount);
    }
}
