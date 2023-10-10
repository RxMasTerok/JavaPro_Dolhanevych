package inheritance.cat;

import inheritance.Animal;
import inheritance.Running;

public class Cat extends Animal implements Running {

    private final int runLimit;

    public Cat(String name, int runLimit) {
        super(name);
        this.runLimit = runLimit;
    }

    @Override
    public boolean run(int distance) {
        return distance <= runLimit;
    }
}