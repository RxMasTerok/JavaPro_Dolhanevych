import inheritance.Animal;
import inheritance.Running;
import inheritance.Swimming;
import inheritance.cat.Cat;
import inheritance.dog.Dog;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dog bobik = new Dog("Bobik", 500, 10);
        Dog bulka = new Dog("Bulka", 600, 10);
        Dog tuzik = new Dog("Tuzik", 200, 5);

        Cat meow = new Cat("Meow", 300);
        Cat sonya = new Cat("Sonya", 210);
        Cat masya = new Cat("Masya", 100);

        List<Animal> animals = Arrays.asList(bobik, bulka, tuzik, meow, sonya, masya);

        runningCompetition(animals);
        swimmingCompetition(animals);
    }

    private static void runningCompetition(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Running) {
                Running runningAnimal = (Running) animal;
                boolean mileage = runningAnimal.run(500);
                String constructedResult = animal.getName() +
                        (mileage ? " ran " : " couldn't run ") +
                        500 +
                        " m.";
                System.out.println(constructedResult);
            } else {
                System.out.println(animal.getName() + " can't run.");
            }
        }
    }

    private static void swimmingCompetition(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Swimming) {
                Swimming swimmingAnimal = (Swimming) animal;
                boolean mileage = swimmingAnimal.swim(10);
                String constructedResult = animal.getName() +
                        (mileage ? " swam " : " couldn't swim ") +
                        10 +
                        " m.";
                System.out.println(constructedResult);
            } else {
                System.out.println(animal.getName() + " can't swim.");
            }
        }
    }
}