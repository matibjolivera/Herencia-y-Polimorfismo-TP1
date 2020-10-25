package Ejercicio4;

import java.util.ArrayList;

/**
 * The type Animal.
 */
abstract public class Animal {

    private String name;
    private double weight;
    private double size;
    private ArrayList<Skill> skills;
    private Carer carer;
    /**
     * The Food type.
     */
    protected FoodType foodType;

    /**
     * Instantiates a new Animal.
     *
     * @param name   the name
     * @param weight the weight
     * @param size   the size
     * @param skills the skills
     */
    public Animal(String name, double weight, double size, ArrayList<Skill> skills) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.skills = skills;
        this.carer = null;
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
     * Gets weight.
     *
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Gets skills.
     *
     * @return the skills
     */
    public ArrayList<Skill> getSkills() {
        return skills;
    }

    /**
     * Sets skills.
     *
     * @param skills the skills
     */
    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    /**
     * Add skill.
     *
     * @param skill the skill
     */
    public void addSkill(Skill skill) {
        this.getSkills().add(skill);
    }

    /**
     * Gets carer.
     *
     * @return the carer
     */
    public Carer getCarer() {
        return carer;
    }

    /**
     * Sets carer.
     *
     * @param carer the carer
     */
    public void setCarer(Carer carer) {
        this.carer = carer;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": Nombre='" + name +
                ", Peso=" + weight +
                ", Tamaño=" + size +
                ", Habilidades=" + skills +
                ", Cuidador=" + carer;
    }

    /**
     * Gets skill.
     *
     * @param position the position
     * @return the skill
     */
    public Skill getSkill(int position) {
        Skill skill = null;
        ArrayList<Skill> skills = this.getSkills();

        if (position >= 0 && position < skills.size()) {
            skill = skills.get(position);
        }
        return skill;
    }

    /**
     * Gets food type.
     *
     * @return the food type
     */
    public FoodType getFoodType() {
        return foodType;
    }

    /**
     * Sets food type.
     *
     * @param foodType the food type
     */
    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    /**
     * Show skills.
     */
    public void showSkills() {
        ArrayList<Skill> skills = this.getSkills();
        int quantitySkills = skills.size();

        System.out.println("Habilidades:");
        for (int i = 0; i < quantitySkills; i++) {
            System.out.println(i + ": " + skills.get(i));
        }
    }

    /**
     * Do skill.
     *
     * @param skill the skill
     * @param food  the food
     */
    public void doSkill(Skill skill, Food food) {
        Carer carer = this.getCarer();
        if (carer.canDoSkill(skill, food)) {
            carer.discountFoodStock(food, skill.getKgFood());
            System.out.println(this.getName() + " realizó el truco " + skill.getName());
        } else {
            System.out.println("No hay suficiente stock para hacer el truco");
        }
    }
}
