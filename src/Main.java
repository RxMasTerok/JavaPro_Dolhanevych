import homework.polymorphism.competition.Competition;
import homework.polymorphism.competition.obstacle.Obstacle;
import homework.polymorphism.competition.obstacle.Racetrack;
import homework.polymorphism.competition.obstacle.Wall;
import homework.polymorphism.competition.participant.Cat;
import homework.polymorphism.competition.participant.Robot;
import homework.polymorphism.competition.participant.Human;
import homework.polymorphism.competition.participant.Participant;
import homework.polymorphism.geometricshape.AreaCalculable;
import homework.polymorphism.geometricshape.model.Circle;
import homework.polymorphism.geometricshape.model.Square;
import homework.polymorphism.geometricshape.model.Triangle;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5.55);
        Square square = new Square(2.28);
        Triangle triangle = new Triangle(15.767, 4.69);

        List<AreaCalculable> figures = Arrays.asList(circle, square, triangle);
        double sumAreaFigures = figures.stream().mapToDouble(AreaCalculable::calculateArea).sum();
        System.out.println("The total area of all geometric figures: " + sumAreaFigures);


        Human human = new Human("Anakin Skywalker", 110, 10);
        Cat cat = new Cat("Yoda", 50, 50);
        Robot robot = new Robot("R2-D2", 100, 110);

        Racetrack racetrack = new Racetrack("Jedha", 100);
        Wall wall = new Wall("Death Star", 50);

        List<Participant> participants = Arrays.asList(human, cat, robot);
        List<Obstacle> obstacles = Arrays.asList(racetrack, wall);

        Competition competition = new Competition(participants, obstacles);
        Map<Participant, List<Obstacle>> result = competition.start();

        result.forEach((participant, challenges) -> {
            challenges.forEach(obstacle -> {
                StringBuilder report = new StringBuilder()
                        .append("Participant ")
                        .append(participant.getName())
                        .append(" ");

                if (obstacle.isOvercome()) {
                    report.append("passed the obstacle ");
                } else {
                    report.append("did not pass the obstacle ");
                }

                report.append(obstacle.getName())
                        .append(" at the distance ")
                        .append(obstacle.getLength());

                if (!obstacle.isOvercome()) {
                    report.append(". Passed ")
                            .append(participant.getPassedDistance());
                }

                System.out.println(report);
            });
        });
    }
}
