package main;

import main.Lesson1.*;

public class MainClass {
    public static void main(String[] args) {
        Team teamCats = new Team("Cats", new Person[]{
                new Person(8, 2, 7),
                new Person(8, 3, 3),
                new Person(3, 5, 10),
                new Person(8, 6, 2)});
        Course course = new Course(new Obstacle[]{new Road(8), new Wall(3), new Water(3)});

        course.Overcoming(teamCats);

        teamCats.showResult();
        System.out.println("---------------------------------------------");
        teamCats.showInfoTeam();
    }
}
