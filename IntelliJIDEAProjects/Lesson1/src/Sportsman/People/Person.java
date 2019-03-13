package Sportsman.People;

import Sportsman.People.People;
import Sportsman.Sportsman;

public class Person extends People {
    private String namePerson;

    public String getNamePerson() {
        return namePerson;
    }

    public Person(String name ,int distRun, int distJump, int distSwim) {
        super(distRun, distJump, distSwim);
        this.namePerson = name;
    }
}
