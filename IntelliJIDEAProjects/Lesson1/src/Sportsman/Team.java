package Sportsman;

import Obstacle.Course;
import Sportsman. Animal.Animal;
import Sportsman.People.Person;

import java.util.ArrayList;

public class Team {
    private ArrayList<Sportsman> personTeamList;
    private String nameTeam;

    public Team(String nameTeam, Sportsman ... per) {
        personTeamList = new ArrayList<Sportsman>();

        for (Sportsman s : per)
            personTeamList.add(s);

        this.nameTeam = nameTeam;
    }


    public ArrayList<Sportsman> getPersonTeamList() {
        return personTeamList;
    }

    public void showInfoTeam() {
        System.out.printf("Team: %s\n", nameTeam);
        for (Sportsman p : personTeamList) {
            System.out.printf("%s: %s Course %s\n", getNameSportsman(p),  p.getDistCheck(), p.getSlipUp());
        }
    }

    private String getNameSportsman(Sportsman p) {
        if (p instanceof Animal)
            return ((Animal) p).getNameAnimal();
        else if (p instanceof Person)
            return ((Person) p).getNamePerson();

        return "Sportsman";
    }
}
