package homework.polymorphism.competition.participant;

public class Cat extends Participant {

    private final int runningLimit;
    private final int jumpingLimit;

    public Cat(String name, int runningLimit, int jumpingLimit) {
        super(name, Type.CAT);
        this.runningLimit = runningLimit;
        this.jumpingLimit = jumpingLimit;
    }

    public int getRunningLimit() {
        return runningLimit;
    }

    public int getJumpingLimit() {
        return jumpingLimit;
    }

    @Override
    public boolean jump(int height) {
        if (height <= jumpingLimit) {
            countDistance(height);
            return true;
        }
        return false;
    }

    @Override
    public boolean run(int length) {
        if (length <= runningLimit) {
            countDistance(length);
            return true;
        }
        return false;
    }
}