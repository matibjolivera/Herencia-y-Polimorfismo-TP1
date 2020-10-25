package Ejercicio4;

import java.util.ArrayList;
import java.util.Random;

/**
 * The type Mundo marino.
 */
public class MundoMarino {

    private ArrayList<Animal> animals;
    private ArrayList<Trainer> trainers;
    private ArrayList<Carer> carers;
    private ArrayList<Food> foods;

    /**
     * Instantiates a new Mundo marino.
     */
    public MundoMarino() {
        this.animals = new ArrayList<>();
        this.trainers = new ArrayList<>();
        this.carers = new ArrayList<>();
        this.foods = new ArrayList<>();
    }

    /**
     * Gets animals.
     *
     * @return the animals
     */
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    /**
     * Sets animals.
     *
     * @param animals the animals
     */
    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    /**
     * Add animal.
     *
     * @param animal the animal
     */
    public void addAnimal(Animal animal) {
        if (asignCarer(animal)) {
            this.getAnimals().add(animal);
        } else {
            System.out.println("No hay cuidadores disponibles.");
        }
    }

    private boolean asignCarer(Animal animal) {
        Carer carer;
        boolean carerSetted = false;
        int i = 0;

        ArrayList<Carer> carers = this.getCarers();
        int quantityCarers = carers.size();

        while (i < quantityCarers && !carerSetted) {
            carer = carers.get(i);
            if (carer.canAddAnimal()) {
                animal.setCarer(carer);
                carerSetted = true;
            } else {
                i++;
            }
        }
        return carerSetted;
    }

    /**
     * Gets trainers.
     *
     * @return the trainers
     */
    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    /**
     * Sets trainers.
     *
     * @param trainers the trainers
     */
    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    /**
     * Gets carers.
     *
     * @return the carers
     */
    public ArrayList<Carer> getCarers() {
        return carers;
    }

    /**
     * Sets carers.
     *
     * @param carers the carers
     */
    public void setCarers(ArrayList<Carer> carers) {
        this.carers = carers;
    }

    /**
     * Gets foods.
     *
     * @return the foods
     */
    public ArrayList<Food> getFoods() {
        return foods;
    }

    /**
     * Sets foods.
     *
     * @param foods the foods
     */
    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

    /**
     * Add carer.
     *
     * @param carer the carer
     */
    public void addCarer(Carer carer) {
        this.getCarers().add(carer);
    }

    /**
     * Add trainer.
     *
     * @param trainer the trainer
     */
    public void addTrainer(Trainer trainer) {
        this.getTrainers().add(trainer);
    }

    /**
     * Add food.
     *
     * @param food the food
     */
    public void addFood(Food food) {
        this.getFoods().add(food);
    }

    /**
     * Gets random trainer.
     *
     * @return the random trainer
     */
    public Trainer getRandomTrainer() {
        Trainer trainer = null;
        int quantityTrainers = this.getTrainers().size();

        if (quantityTrainers > 0) {
            Random random = new Random();
            trainer = this.getTrainers().get(random.nextInt(quantityTrainers - 1));
        }
        return trainer;
    }

    /**
     * Gets animal.
     *
     * @param position the position
     * @return the animal
     */
    public Animal getAnimal(int position) {
        Animal animal = null;
        ArrayList<Animal> animals = this.getAnimals();

        if (position >= 0 && position < animals.size()) {
            animal = animals.get(position);
        }
        return animal;
    }

    /**
     * Show animals.
     */
    public void showAnimals() {
        ArrayList<Animal> animals = this.getAnimals();
        int quantityAnimals = animals.size();

        for (int i = 0; i < quantityAnimals; i++) {
            System.out.println(i + ": " + animals.get(i));
        }
    }

    /**
     * Gets food by animal.
     *
     * @param animal the animal
     * @return the food by animal
     */
    public Food getFoodByAnimal(Animal animal) {
        Food food = null;
        Food currentFood;
        int i = 0;
        ArrayList<Food> foods = this.getFoods();
        int quantityFoods = foods.size();

        while (i < quantityFoods && food == null) {
            currentFood = foods.get(i);
            if (currentFood.getFoodType().equals(animal.getFoodType())) {
                food = currentFood;
            } else {
                i++;
            }
        }
        return food;
    }

    /**
     * Show food stock.
     *
     * @param food the food
     */
    public void showFoodStock(Food food) {
        System.out.println(food.getFoodType() + ": quedan " + food.getStock() + "kg. en stock");
    }
}
