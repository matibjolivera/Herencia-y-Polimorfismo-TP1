package Ejercicio4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * The type Show.
 */
public class Show {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MundoMarino mundoMarino = new MundoMarino();

        addCarers(mundoMarino);
        addTrainers(mundoMarino);
        addFoods(mundoMarino);
        addAnimals(mundoMarino);

        Animal animal;
        Skill skill;
        do {
            mundoMarino.showAnimals();
            System.out.println("------------------------");
            animal = selectAnimal(mundoMarino);

            if (animal != null) {
                animal.showSkills();
                do {
                    System.out.println("------------------------");
                    mundoMarino.showFoodStock(mundoMarino.getFoodByAnimal(animal));
                    skill = selectSkill(animal);
                    if (skill != null) {
                        animal.doSkill(skill, mundoMarino.getFoodByAnimal(animal));
                    }
                } while (skill != null);
            }
        } while (animal != null);
        scanner.close();
    }

    private static void addCarers(MundoMarino mundoMarino) {
        mundoMarino.addCarer(new Carer("Juan Román", "Riquelme", new Date(), new Date(), 2));
        mundoMarino.addCarer(new Carer("Martín", "Palermo", new Date(), new Date(), 4));
        mundoMarino.addCarer(new Carer("Ángel Clemente", "Rojas", new Date(), new Date(), 8));
        mundoMarino.addCarer(new Carer("Jorge", "Bermúdez", new Date(), new Date(), 14));
    }

    private static void addTrainers(MundoMarino mundoMarino) {
        mundoMarino.addTrainer(new Trainer("Carlos", "Bianchi", new Date(), new Date(), 40));
        mundoMarino.addTrainer(new Trainer("Carlos Salvador", "Bilardo", new Date(), new Date(), 50));
        mundoMarino.addTrainer(new Trainer("Miguel Ángel", "Russo", new Date(), new Date(), 30));
        mundoMarino.addTrainer(new Trainer("Alfio", "Basile", new Date(), new Date(), 30));
    }

    private static void addFoods(MundoMarino mundoMarino) {
        mundoMarino.addFood(new Food(FoodType.CRAB, 2));
        mundoMarino.addFood(new Food(FoodType.SQUID, 6));
        mundoMarino.addFood(new Food(FoodType.OCTOPUS, 4));
    }

    private static void addAnimals(MundoMarino mundoMarino) {
        ArrayList<Skill> dolphinSkills = new ArrayList<>();
        dolphinSkills.add(new Skill("Truco 1", 2));
        dolphinSkills.add(new Skill("Truco 2", 4));
        dolphinSkills.add(new Skill("Truco 3", 1));

        Trainer dolphinTrainer = mundoMarino.getRandomTrainer();

        mundoMarino.addAnimal(new Dolphin("Pepe", 50, 40, dolphinSkills, dolphinTrainer));

        ArrayList<Skill> killerWhaleSkills = new ArrayList<>();
        killerWhaleSkills.add(new Skill("Truco 4", 6));
        killerWhaleSkills.add(new Skill("Truco 5", 12));
        killerWhaleSkills.add(new Skill("Truco 6", 10));

        mundoMarino.addAnimal(new KillerWhale("Juansito", 500, 200, killerWhaleSkills));

        ArrayList<Skill> seaWolfSkills = new ArrayList<>();
        seaWolfSkills.add(new Skill("Truco 7", 4));
        seaWolfSkills.add(new Skill("Truco 8", 8));
        seaWolfSkills.add(new Skill("Truco 9", 20));

        mundoMarino.addAnimal(new SeaWolf("Pedrito", 200, 100, seaWolfSkills));
    }

    private static Animal selectAnimal(MundoMarino mundoMarino) {
        Animal animal = null;
        int position = 0;

        while (animal == null && position != -1) {
            System.out.println("Seleccione un animal según su posición (-1 para finalizar)");
            position = scanner.nextInt();

            animal = mundoMarino.getAnimal(position);

            if (animal == null && position != -1) {
                System.out.println("ERROR. Posición inválida");
            }
        }

        return animal;
    }

    private static Skill selectSkill(Animal animal) {
        Skill skill = null;
        int position = 0;

        while (skill == null && position != -1) {
            System.out.println("Seleccione una habilidad según su posición (-1 para finalizar)");
            position = scanner.nextInt();

            skill = animal.getSkill(position);

            if (skill == null && position != -1) {
                System.out.println("ERROR. Posición inválida");
            }
        }

        return skill;
    }
}
